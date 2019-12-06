package com.ganeshbhandarkar.helpinghands;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CreateAccountActivity extends AppCompatActivity {

    private TextView loginButton;
    private TextInputLayout Email_layout,Password_layout,ConfirmPassword_layout;
    private TextInputEditText Email,Password,ConfirmPassword;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private Button signUpButton;
    private ProgressDialog loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        loginButton = findViewById(R.id.LogIn);
        Email_layout = findViewById(R.id.email_input_layout);
        Password_layout = findViewById(R.id.password_input_layout);
        ConfirmPassword_layout = findViewById(R.id.confirm_password_input_layout);
        Email = findViewById(R.id.input_email);
        Password = findViewById(R.id.input_password);
        ConfirmPassword = findViewById(R.id.input_confirm_password);
        signUpButton = findViewById(R.id.sign_up_button);

        loadingBar = new ProgressDialog(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccountIntent = new Intent(CreateAccountActivity.this,LoginActivity.class);
                createAccountIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(createAccountIntent);
                overridePendingTransition(R.anim.slide_up,R.anim.slide_down);
                finish();
            }
        });


        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNewAccount();
            }
        });

    }

    private void CreateNewAccount() {
        String email = Email.getText().toString();
        String password = Password.getText().toString();
        String confirmpassword = ConfirmPassword.getText().toString();

        mAuth = FirebaseAuth.getInstance();


        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Write your Email", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Write your Password", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(confirmpassword)){
            Toast.makeText(this, "Please Confirm your Password", Toast.LENGTH_SHORT).show();
        }
        else if(!password.equals(confirmpassword)){
            Toast.makeText(this, "Your PAssword donot match with oyur confirm password", Toast.LENGTH_SHORT).show();
        }
        else{

            loadingBar.setTitle("Creating new Account");
            loadingBar.setMessage("Please Wait, While we are Creating Your new Account");
            loadingBar.show();
            loadingBar.setCanceledOnTouchOutside(true);
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(CreateAccountActivity.this, "You are Authenticated Successfully ", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();
                                Intent signUpIntent = new Intent(CreateAccountActivity.this,LoginActivity.class);
                                signUpIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(signUpIntent);
                                finish();
                            }
                            else{
                                loadingBar.dismiss();
                                String message = task.getException().getMessage();
                                Toast.makeText(CreateAccountActivity.this,"There is some error" + message,Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

    }


//    private void sendEmailVerification(){
//        mUser = mAuth.getCurrentUser();
//        mUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if(task.isSuccessful()){
//
//                }
//            }
//        });
//    }
}
