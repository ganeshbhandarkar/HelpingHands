package com.ganeshbhandarkar.helpinghands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Button logout_button;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private DatabaseReference UserRef;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserRef = FirebaseDatabase.getInstance().getReference().child("Users");
        mAuth = FirebaseAuth.getInstance();

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        setTitle("Learn");
        LearnFragment fragment= new LearnFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content,fragment,"Fragment Name");
        fragmentTransaction.commit();

//        logout_button = findViewById(R.id.logout);
//
//
//
//        logout_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mAuth.signOut();
//                Intent login = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(login);
//                overridePendingTransition(R.anim.slide_up,R.anim.slide_down);
//                finish();
//            }
//        });


    }




















    // Login and Create Account SetUp

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser  = mAuth.getCurrentUser();
        if (currentUser == null) {
            SendUserToLoginActivity();
        }
        else{
            CheckUserExistance();
        }
    }

    private void CheckUserExistance() {


        final String current_user_id = mAuth.getCurrentUser().getUid();

        UserRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(!dataSnapshot.hasChild(current_user_id)){
//                    SendSetup();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

//    private void SendSetup() {
//
//        Intent hello = new Intent(MainActivity.this,SetupActivity.class);
//        startActivity(hello);
//        finish();
//
//    }

    private void SendUserToLoginActivity() {

        Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        finish();

    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//        Fragment selectedFragment = null;
//
//        switch (menuItem.getItemId()){
//            case R.id.nav_learn:
//                selectedFragment = new HomeFragmentActivity();
//                break;
//            case R.id.nav_build:
//                selectedFragment = new BuildFragment();
//                break;
//            case R.id.nav_account:
//                selectedFragment = new AccountFragment();
//                break;
//
//
//        }
//        getSupportFragmentManager().beginTransaction().replace(R.id.content,
//                selectedFragment).commit();
//
//        return true;
//    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_learn:



                    //fragment code
                    setTitle("Learn");
                    LearnFragment fragment= new LearnFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content,fragment,"Fragment Name");
                    fragmentTransaction.addToBackStack(null).commit();



                    return true;
                case R.id.nav_build:

                    //fragment code
                    setTitle("Build");
                    BuildFragment fragment2= new BuildFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content,fragment2,"Fragment Name");
                    fragmentTransaction2.addToBackStack(null).commit();

                    return true;
                case R.id.nav_account:

                    //fragment code
                    setTitle("Account");
                    AccountFragment fragment3= new AccountFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.content,fragment3,"Fragment Name");
                    fragmentTransaction3.addToBackStack(null).commit();

                    return true;

                case R.id.nav_games:

                    //fragment code
                    setTitle("Account");
                    GameFragment fragment4= new GameFragment();
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.content,fragment4,"Fragment Name");
                    fragmentTransaction4.addToBackStack(null).commit();

                    return true;

            }
            return false;
        }
    };
}
