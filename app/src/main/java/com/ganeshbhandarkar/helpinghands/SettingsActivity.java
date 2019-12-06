package com.ganeshbhandarkar.helpinghands;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SettingsActivity extends AppCompatActivity {

    private TextView SignOut,email,contact,privacy;
    private Button BackButton;
    private FirebaseAuth mAuth;
    private ProgressDialog loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mAuth = FirebaseAuth.getInstance();

        SignOut = findViewById(R.id.signOut_text);
        BackButton = findViewById(R.id.back_fragment);
        email = findViewById(R.id.email_button);
        contact = findViewById(R.id.contact_button);
        privacy = findViewById(R.id.privacy_button);
        loader = new ProgressDialog(this);


        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://learnassemblylanguage.wordpress.com/2019/10/02/privacy-policy/"));
                startActivity(i);
            }
        });

        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                loader.setTitle("Signing Out");
                loader.setMessage("Good Bye");
                loader.show();
                Intent i = new Intent(SettingsActivity.this,LoginActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up,R.anim.fade_out);
                finish();
            }
        });

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(SettingsActivity.this,MainActivity.class);
                startActivity(backIntent);
                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
                finish();
            }
        });


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent email = new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"+"utkarshini.helpinghand@gmail.com"));
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[] { "utkarshini.helpinghand@gmail.com" });
                email.putExtra(Intent.EXTRA_SUBJECT, "Important :");
                email.putExtra(Intent.EXTRA_TEXT, "Send Feedback");

//need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9420356370"));
                startActivity(intent);
            }
        });








    }
}
