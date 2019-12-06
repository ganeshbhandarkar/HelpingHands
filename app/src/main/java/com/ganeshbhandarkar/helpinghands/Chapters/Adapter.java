package com.ganeshbhandarkar.helpinghands.Chapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mContext;
    List<ChapterItem> mData;

    public Adapter(Context mContext, List<ChapterItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;


        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.chaptersitem,parent,false);


        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myViewHolder holder, final int position) {




        holder.chapterImage.setImageResource(mData.get(position).getItem_images());
        holder.description.setText(mData.get(position).getItem_names());
        holder.chapterNo.setText(mData.get(position).getItem_no());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemIntent = new Intent(mContext, ChapterContentActivity.class);
                itemIntent.putExtra("name",mData.get(position).item_images);
                itemIntent.putExtra("read1",mData.get(position).getReadMode1());
                itemIntent.putExtra("read2",mData.get(position).getReadMode2());
                itemIntent.putExtra("read3",mData.get(position).getReadMode3());
                mContext.startActivity(itemIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayout;
        ImageView chapterImage;
        TextView description;
        TextView chapterNo;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);


            chapterImage = itemView.findViewById(R.id.chapter_image);
            description = itemView.findViewById(R.id.chapter_names);
            chapterNo = itemView.findViewById(R.id.chapter_no);
            relativeLayout = itemView.findViewById(R.id.chapter_item_relative_layout);


//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent i = new Intent(mContext,ChapterContentActivity.class);
//                    int position =getAdapterPosition();
//
//                    i.putExtra("readMode1",mData.get(position).getReadMode());
//
//                    mContext.startActivity(i);
//                }
//            });



            Animation animation = AnimationUtils.loadAnimation(mContext,R.anim.slide_in_from_right);
            itemView.startAnimation(animation);

        }


    }

}
