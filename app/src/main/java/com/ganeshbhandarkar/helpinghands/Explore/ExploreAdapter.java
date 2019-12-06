package com.ganeshbhandarkar.helpinghands.Explore;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    Context mContext;
    List<ExploreModel> elist;

    public ExploreAdapter(Context mContext, List<ExploreModel> elist) {
        this.mContext = mContext;
        this.elist = elist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.explore_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.cardImage1.setImageResource(elist.get(position).getCardImage1());
        holder.cardImage2.setImageResource(elist.get(position).getCardImage2());
        holder.block_no.setText(elist.get(position).getBlock_no());
        holder.explore_title.setText(elist.get(position).getExplore_title());
        holder.title1.setText(elist.get(position).getTitle1());
        holder.title2.setText(elist.get(position).getTitle2());
        holder.cardName1.setText(elist.get(position).getCardName1());
        holder.cardName2.setText(elist.get(position).getCardName2());

        holder.cardImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext,ExploreDetails.class);
                i.putExtra("author",elist.get(position).getAuthorName());
                i.putExtra("data",elist.get(position).getRead());
                //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mContext.startActivity(i);
            }
        });

        holder.cardImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Coming Soon",Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(mContext,ExploreDetails.class);
//                //i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return elist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView cardImage1,cardImage2;
        TextView block_no,explore_title,title1,title2,cardName1,cardName2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardImage1 = itemView.findViewById(R.id.imageCard1);
            cardImage2 = itemView.findViewById(R.id.imageCard2);
            block_no = itemView.findViewById(R.id.block_no);
            explore_title = itemView.findViewById(R.id.explore_title);
            title1 = itemView.findViewById(R.id.title1);
            title2 = itemView.findViewById(R.id.title2);
            cardName1 = itemView.findViewById(R.id.cardName1);
            cardName2 = itemView.findViewById(R.id.cardName2);

        }
    }
}
