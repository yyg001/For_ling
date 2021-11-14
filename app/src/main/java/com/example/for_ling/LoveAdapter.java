package com.example.for_ling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;

public class LoveAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    private Context mContext;
    private LayoutInflater mInflater;
    private List<LovePhoto> mData;

    public LoveAdapter(Context context,List<LovePhoto> datas) {
        this.mContext = context;
        this.mData = datas;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_love_photo_item, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        LovePhoto lovePhoto = mData.get(position);
        LoveAdapter.MyViewHolder myHeaderViewHolder = (LoveAdapter.MyViewHolder) holder;
        myHeaderViewHolder.imageView.setImageResource(lovePhoto.getImageId());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private View view;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            imageView = itemView.findViewById(R.id.iv_love_photo);


        }

        @Override
        public void onClick(View v) {

        }
    }
}
