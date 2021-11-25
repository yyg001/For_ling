package com.example.for_ling;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThreeFragment extends Fragment implements LoveAdapter.OnButtonClickListener{
    private RecyclerView recyclerView;
    private List<LovePhoto> lovePhotos=new ArrayList<>();
    LoveAdapter loveAdapter;
    public ThreeFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        loveAdapter=new LoveAdapter(getActivity(),lovePhotos);
        loveAdapter.setOnClickListener(this);
        recyclerView=view.findViewById(R.id.rv_love);
        recyclerView.setAdapter(loveAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2, RecyclerView.VERTICAL, false));
        //设置子项间距

    }
    private void initData(){


        LovePhoto lovePhoto1=new LovePhoto(R.drawable.a01);
        lovePhotos.add(lovePhoto1);
        LovePhoto lovePhoto2=new LovePhoto(R.drawable.a02);
        lovePhotos.add(lovePhoto2);
        LovePhoto lovePhoto3=new LovePhoto(R.drawable.a03);
        lovePhotos.add(lovePhoto3);
        LovePhoto lovePhoto4=new LovePhoto(R.drawable.a04);
        lovePhotos.add(lovePhoto4);
        LovePhoto lovePhoto5=new LovePhoto(R.drawable.a05);
        lovePhotos.add(lovePhoto5);
        LovePhoto lovePhoto6=new LovePhoto(R.drawable.a06);
        lovePhotos.add(lovePhoto6);
        LovePhoto lovePhoto7=new LovePhoto(R.drawable.a07);
        lovePhotos.add(lovePhoto7);
        LovePhoto lovePhoto8=new LovePhoto(R.drawable.a08);
        lovePhotos.add(lovePhoto8);
        LovePhoto lovePhoto9=new LovePhoto(R.drawable.a09);
        lovePhotos.add(lovePhoto9);
        LovePhoto lovePhoto10=new LovePhoto(R.drawable.a10);
        lovePhotos.add(lovePhoto10);
        LovePhoto lovePhoto11=new LovePhoto(R.drawable.a11);
        lovePhotos.add(lovePhoto11);
        LovePhoto lovePhoto12=new LovePhoto(R.drawable.a12);
        lovePhotos.add(lovePhoto12);
        LovePhoto lovePhoto13=new LovePhoto(R.drawable.a13);
        lovePhotos.add(lovePhoto13);
        LovePhoto lovePhoto14=new LovePhoto(R.drawable.a14);
        lovePhotos.add(lovePhoto14);
        LovePhoto lovePhoto15=new LovePhoto(R.drawable.a15);
        lovePhotos.add(lovePhoto15);
        LovePhoto lovePhoto16=new LovePhoto(R.drawable.a16);
        lovePhotos.add(lovePhoto16);
        LovePhoto lovePhoto17=new LovePhoto(R.drawable.a17);
        lovePhotos.add(lovePhoto17);
        LovePhoto lovePhoto18=new LovePhoto(R.drawable.a18);
        lovePhotos.add(lovePhoto18);
        LovePhoto lovePhoto19=new LovePhoto(R.drawable.a19);
        lovePhotos.add(lovePhoto19);
        LovePhoto lovePhoto20=new LovePhoto(R.drawable.a20);
        lovePhotos.add(lovePhoto20);
        LovePhoto lovePhoto21=new LovePhoto(R.drawable.a21);
        lovePhotos.add(lovePhoto21);
        LovePhoto lovePhoto22=new LovePhoto(R.drawable.a22);
        lovePhotos.add(lovePhoto22);
        LovePhoto lovePhoto23=new LovePhoto(R.drawable.a23);
        lovePhotos.add(lovePhoto23);
        LovePhoto lovePhoto24=new LovePhoto(R.drawable.a24);
        lovePhotos.add(lovePhoto24);
        LovePhoto lovePhoto25=new LovePhoto(R.drawable.a25);
        lovePhotos.add(lovePhoto25);
        LovePhoto lovePhoto26=new LovePhoto(R.drawable.a26);
        lovePhotos.add(lovePhoto26);
        LovePhoto lovePhoto27=new LovePhoto(R.drawable.a27);
        lovePhotos.add(lovePhoto27);
        LovePhoto lovePhoto28=new LovePhoto(R.drawable.a28);
        lovePhotos.add(lovePhoto28);
        LovePhoto lovePhoto29=new LovePhoto(R.drawable.a29);
        lovePhotos.add(lovePhoto29);
        LovePhoto lovePhoto30=new LovePhoto(R.drawable.a30);
        lovePhotos.add(lovePhoto30);
        LovePhoto lovePhoto31=new LovePhoto(R.drawable.a31);
        lovePhotos.add(lovePhoto31);
        LovePhoto lovePhoto32=new LovePhoto(R.drawable.a32);
        lovePhotos.add(lovePhoto32);
        LovePhoto lovePhoto33=new LovePhoto(R.drawable.a33);
        lovePhotos.add(lovePhoto33);
        LovePhoto lovePhoto34=new LovePhoto(R.drawable.a34);
        lovePhotos.add(lovePhoto34);
        LovePhoto lovePhoto35=new LovePhoto(R.drawable.ling);
        lovePhotos.add(lovePhoto35);
        LovePhoto lovePhoto=new LovePhoto(R.drawable.ling);
        lovePhotos.add(lovePhoto);

    }

    @Override
    public void onItemClick(LovePhoto lovePhoto, int position) {
//        Toast.makeText(getActivity(),"你点击了第"+(position+1)+"张图片",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getActivity(),MainActivity2.class);
        intent.putExtra("number",position+1);
        startActivity(intent);
    }
}