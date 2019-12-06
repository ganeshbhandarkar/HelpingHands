package com.ganeshbhandarkar.helpinghands;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.auth.FirebaseAuth;

import java.net.URI;
import java.util.zip.Inflater;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

import static io.fabric.sdk.android.services.concurrency.AsyncTask.init;

public class AccountFragment extends Fragment {


    private FirebaseAuth mAuth;
    private Button logoutButton;
    private View view;
    MaterialCardView cardView;
    private Button settings_button;
    private ScrollView scrollView;
    private TextView UserName,recommand_button,button_complain,button_specific_help,improve_button;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_account,container,false);
        init();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        UserName = view.findViewById(R.id.userName);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getActivity());
        if (acct != null) {
            String personName = acct.getDisplayName();
            UserName.setText(personName);
//            String personEmail = acct.getEmail();
//            UserEmail.setText(personEmail);
//            Uri personPhoto = acct.getPhotoUrl();
//            if(personPhoto!=null) {
//                Glide.with(getContext()).load(acct.getPhotoUrl().toString()).into(UserProfileImage);
//            }
        }
    }

    private void init(){

        ScrollView scrollView = (ScrollView) view.findViewById(R.id.scroll_view);
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);


        mAuth = FirebaseAuth.getInstance();

        settings_button = view.findViewById(R.id.settings_button);
        button_complain = view.findViewById(R.id.complain_button);
        button_specific_help = view.findViewById(R.id.need_help_button);
        improve_button = view.findViewById(R.id.improve_button);
        cardView = view.findViewById(R.id.cardview_profile);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Comming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        improve_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.ukarshini.com"));
                startActivity(i);
            }
        });

        button_specific_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9420356370"));
                startActivity(intent);
            }
        });

        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),SettingsActivity.class);
                startActivity(i);
                setAllowEnterTransitionOverlap(true);
            }
        });

        button_complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),ComplainActivity.class);
                startActivity(i);
                setAllowEnterTransitionOverlap(true);
            }
        });

        recommand_button = view.findViewById(R.id.recommend_button);

        recommand_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "http://www.ukarshini.com/");
                sendIntent.setType("text/link");

                Intent shareIntent = Intent.createChooser(sendIntent, "Share Helping Hands With Friends and Families");
                startActivity(shareIntent);


            }
        });


//        logoutButton = view.findViewById(R.id.logout);
//
//        logoutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mAuth.signOut();
//                Intent i = new Intent(getActivity(), LoginActivity.class);
//                startActivity(i);
//            }
//        });

    }


}
