package com.ganeshbhandarkar.helpinghands.Articles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ArticleFragment extends Fragment {
    View view;
    List<ArticleModel> articleModelList;
    FirebaseAuth mAuth;
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    FirebaseDatabase database;
    ArticleAdapter articleAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Articles_Posts");



        view = inflater.inflate(R.layout.fragment_articles,container,false);
        recyclerView = view.findViewById(R.id.recyclerViewArticle);
        ArticleAdapter articleAdapter = new ArticleAdapter(getContext(),articleModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        articleModelList = new ArrayList<>();

        articleModelList.add(new ArticleModel(R.drawable.image_1," Parenthood is such a compassionate phase of one's life that put the whole world into a perspective ","PARENTHOOD","https://helpinghandsapp29.wixsite.com/helpinghandsforyourc/post/parenting-1"));
        articleModelList.add(new ArticleModel(R.drawable.image_2,"Kids get fever from time to time. A fever itself usually causes no harm and can actually be a good thing, it’s often a sign that the body is fighting and infection caused by a foreign organism.","FEVER","https://helpinghandsapp29.wixsite.com/helpinghandsforyourc/post/fever"));
        articleModelList.add(new ArticleModel(R.drawable.cold,"Babies get sick a lot. During their first year, most have as many as seven colds -- that’s a lot of runny noses and sleepless nights.","COLD","https://helpinghandsapp29.wixsite.com/helpinghandsforyourc/post/_cold"));
        articleModelList.add(new ArticleModel(R.drawable.sooji,"Sooji Kheer for Babies is one of the easiest and most nutritious foods for your baby. This recipe can be served in dinner for the babies to sleep well through the night..","SOOJI KHEER","https://helpinghandsapp29.wixsite.com/helpinghandsforyourc/post/sooji-kheer"));
        articleModelList.add(new ArticleModel(R.drawable.cheese,"Making sure that your little munchkins are fed-well 24×7 is hard enough. For many mommies like me back to school means packing lunches. ","CHEESE CORNS","https://helpinghandsapp29.wixsite.com/helpinghandsforyourc/post/cheese-corn-cutlets-with-chutney"));
//        articleModelList.add(new ArticleModel(R.drawable.articleitemimage,"While parenting teens resemble the helter-skelter throes of riding a rollercoaster, God provides the stability we crave.","Ram Arrora",""));
//        articleModelList.add(new ArticleModel(R.drawable.articleitemimage,"While parenting teens resemble the helter-skelter throes of riding a rollercoaster, God provides the stability we crave.","Ram Arrora",""));
//        articleModelList.add(new ArticleModel(R.drawable.articleitemimage,"While parenting teens resemble the helter-skelter throes of riding a rollercoaster, God provides the stability we crave.","Ram Arrora",""));

    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                articleList = new ArrayList<>();
//
//                for (DataSnapshot postSnap : dataSnapshot.getChildren()) {
//
//                    ArticlePostModel articlePostModel = postSnap.getValue(ArticlePostModel.class);
//                    articleList.add(articlePostModel);
//
//                }
//
//                articlePostAdapter = new ArticlePostAdapter(articleList,getActivity());
//                recyclerView.setAdapter(articlePostAdapter);
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }
}
