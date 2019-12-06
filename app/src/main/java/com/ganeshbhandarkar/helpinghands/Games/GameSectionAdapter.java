package com.ganeshbhandarkar.helpinghands.Games;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.List;

public class GameSectionAdapter extends RecyclerView.Adapter<GameSectionAdapter.ViewHolder> {


    Context mContext;
    List<GameSectionModel> gameSectionModelList;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.game_section_item,parent,false);


        return new ViewHolder(view);
    }

    public GameSectionAdapter(Context mContext, List<GameSectionModel> gameSectionModelList) {
        this.mContext = mContext;
        this.gameSectionModelList = gameSectionModelList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.gameImage.setImageResource(gameSectionModelList.get(position).getGameImage());
        holder.gamePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(gameSectionModelList.get(position).getGameUrl()));
                mContext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gameSectionModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView gameImage;
        RelativeLayout gamePlay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gameImage = itemView.findViewById(R.id.game_image);
            gamePlay = itemView.findViewById(R.id.gamePlay);
        }
    }
}
