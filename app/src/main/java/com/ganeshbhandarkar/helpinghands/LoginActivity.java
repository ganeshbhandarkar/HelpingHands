package com.ganeshbhandarkar.helpinghands;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class LoginActivity extends AppCompatActivity {

    private TextView createAccountTextView;
    private TextInputLayout login_layout,password_layout;
    private TextInputEditText User_Email_input,User_Password_input;
    private Button login_button,facebook_login,google_login;
    private FirebaseAuth mAuth;
    private GoogleSignInClient mGoogleSignInClient;
//    private FirebaseUser currentUser;
    private ProgressDialog loadingbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toast.makeText(this, "USE GOOGLE SIGN-IN TO NEVER LOSE THE DATA", Toast.LENGTH_SHORT).show();

        mAuth = FirebaseAuth.getInstance();
        createAccountTextView = findViewById(R.id.create_account_link);
        login_layout = findViewById(R.id.email_input_layout);
        password_layout = findViewById(R.id.password_input_layout);
        User_Email_input = findViewById(R.id.useremail);
        User_Password_input = findViewById(R.id.userpassword);
        login_button = findViewById(R.id.login_button);
        facebook_login = findViewById(R.id.facebook_login);
        google_login = findViewById(R.id.google_login);
        loadingbar = new ProgressDialog(this);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);

        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccountIntent = new Intent(LoginActivity.this,CreateAccountActivity.class);
                createAccountIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(createAccountIntent);
                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);

                finish();
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserLoginPage();
            }
        });


        google_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = mGoogleSignInClient.getSignInIntent();
                startActivityForResult(signInIntent, 101);
            }
        });




    }

//    private void signIn() {
//        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
//        startActivityForResult(signInIntent, 101);
//    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == 101) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account);
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately

                // ...
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {
        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);

        loadingbar.setTitle("Logging In ");
        loadingbar.setMessage("Please wait while entering the World of Parents");
        loadingbar.setCanceledOnTouchOutside(true);
        loadingbar.show();
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            loadingbar.dismiss();
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent googleIntent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(googleIntent);
                            overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
                            finish();


                        } else {
                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "signInWithCredential:failure", task.getException());
//                            Snackbar.make(findViewById(R.id.main_layout), "Authentication Failed.", Snackbar.LENGTH_SHORT).show();

                            String message = task.getException().getMessage();
                            Toast.makeText(LoginActivity.this,"Error"+ message,Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        FirebaseUser currentUser  = mAuth.getCurrentUser();
//        if (currentUser == null) {
//            UserHomeActivity();
//        }
//
//    }
//
//    private void UserHomeActivity() {
//        Intent homeIntent = new Intent(LoginActivity.this,MainActivity.class);
//        startActivity(homeIntent);
//        finish();
//
//    }



    // Normal Login

    private void UserLoginPage() {
        String email = User_Email_input.getText().toString();
        String password = User_Password_input.getText().toString();

        mAuth = FirebaseAuth.getInstance();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
        }else{

            loadingbar.setTitle("Logging In ");
            loadingbar.setMessage("Please wait while entering the World of Parents");
            loadingbar.setCanceledOnTouchOutside(true);
            loadingbar.show();

            mAuth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(LoginActivity.this, "You are Logged In Successfully ", Toast.LENGTH_SHORT).show();
                                loadingbar.dismiss();
                                Intent loginIntent = new Intent(LoginActivity.this,MainActivity.class);
                                loginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(loginIntent);
                                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
                                finish();
                           }else{
                                loadingbar.dismiss();
                                String message = task.getException().getMessage();
                                Toast.makeText(LoginActivity.this, "It is not Completed due to"+ message, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }

    }

}
