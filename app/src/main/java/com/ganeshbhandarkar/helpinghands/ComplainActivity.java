package com.ganeshbhandarkar.helpinghands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import de.hdodenhof.circleimageview.CircleImageView;

public class ComplainActivity extends AppCompatActivity {

    EditText complain,mob;
    Button submit;
    EditText PostDetailComment;
    Button PostDetailCommentAddButton;
    Uri Photo;
    String PostKey;
    FirebaseUser mUser;
    FirebaseAuth mAuth;
    FirebaseDatabase firebaseDatabase;
    RecyclerView recyclerView;
    CommentAdapter commentAdapter;
    CommentModel commentModel;
    List<CommentModel> commentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        complain = findViewById(R.id.complain);
        submit = findViewById(R.id.submit);
        mob = findViewById(R.id.mob_no);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit.setVisibility(View.INVISIBLE);
                DatabaseReference databaseReference = firebaseDatabase.getReference("Complains").push();
                String comment_content = complain.getText().toString();
                final String mob_no = mob.getText().toString();
                String uid = mUser.getUid();
                String uname = mUser.getDisplayName();
                String uimg = mUser.getPhotoUrl().toString();
                CommentModel commentModel = new CommentModel(comment_content,mob_no,uid,uimg,uname);

                databaseReference.setValue(commentModel).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        submit.setVisibility(View.VISIBLE);
                        complain.setText("");
                        mob.setText("");
                        Toast.makeText(ComplainActivity.this, "Thank You For your Feedback , You will We Notified by the Experts", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(ComplainActivity.this,MainActivity.class);
                        startActivity(i);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        submit.setVisibility(View.VISIBLE);
                    }
                });
            }
        });

//        PostKey = getIntent().getExtras().getString("postKey");

//        String postTimeStamp = timeStamp(getIntent().getExtras().getLong("postDate"));




    }

    private String timeStamp(long time){
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);

        String date = DateFormat.format("dd-MM-yyyy",calendar).toString();
        return date;
    }

}
