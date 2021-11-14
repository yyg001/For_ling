package com.example.for_ling;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class TwoFragment extends Fragment {



    public TwoFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button=view.findViewById(R.id.call_to_love);
        Button button2=view.findViewById(R.id.call_to_dad);
        Button button3=view.findViewById(R.id.call_to_mom);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(getActivity(),new String[]{
                            Manifest.permission.CALL_PHONE
                    },1);
                }else {
                    call_to_love();
                }



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(getActivity(),new String[]{
                            Manifest.permission.CALL_PHONE
                    },2);
                }else {
                    call_to_dad();
                }



            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(getActivity(),new String[]{
                            Manifest.permission.CALL_PHONE
                    },3);
                }else {
                    call_to_mom();
                }



            }
        });



    }
    private void call_to_love(){
        try {
            Intent intent=new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:19951302090"));
            startActivity(intent);
        }catch (SecurityException e){
            e.printStackTrace();
        }

    }
    private void call_to_dad(){
        try {
            Intent intent=new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18697021286"));
            startActivity(intent);
        }catch (SecurityException e){
            e.printStackTrace();
        }

    }

    private void call_to_mom(){
        try {
            Intent intent=new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:18245585020"));
            startActivity(intent);
        }catch (SecurityException e){
            e.printStackTrace();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    call_to_love();
                }else {
                    Toast.makeText(getActivity(),"臭小玲，还还没授权打电话去权限呢！",Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    call_to_dad();
                }else {
                    Toast.makeText(getActivity(),"臭小玲，还还没授权打电话去权限呢！",Toast.LENGTH_SHORT).show();
                }
                break;
            case 3:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    call_to_mom();
                }else {
                    Toast.makeText(getActivity(),"臭小玲，还还没授权打电话去权限呢！",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }




    }
}