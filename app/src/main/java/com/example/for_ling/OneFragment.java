package com.example.for_ling;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class OneFragment extends Fragment {

    TextView textView;
    Button button,button2;
    AnimatorSet animatorSet=new AnimatorSet();
    int index=0;


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView=(TextView) getView().findViewById(R.id.tv_01);
        button=(Button) getView().findViewById(R.id.btn_zhenxinhua);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("小玲是个小可爱，温柔贤惠有魅力!");


                if (index==0){
                    Toast.makeText(getActivity(),"哎呀，被小玲击中了心房！",Toast.LENGTH_SHORT).show();
                }else if (index==1){
                    Toast.makeText(getActivity(),"哎呀，被小玲再次击中了心房！",Toast.LENGTH_SHORT).show();
                }else if (index==2){
                    Toast.makeText(getActivity(),"哎呀，被小玲又一次击中了心房！",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(),"哎呀，昏过去了！！",Toast.LENGTH_SHORT).show();
                }
                ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 1f);
                ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "rotation", 1f, 360f);
                float curTranslationX = textView.getTranslationX();
                ObjectAnimator animator3 = ObjectAnimator.ofFloat(textView, "translationY", curTranslationX, 500f, curTranslationX);
                ObjectAnimator animator4 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 3f, 1f);

                animatorSet.play(animator2).with(animator).before(animator4).after(animator3);
                animatorSet.setDuration(1000);
                animatorSet.start();
                index++;
//
//                ValueAnimator anim = ValueAnimator.ofFloat(0f, 10f,5f,1f);
//                anim.setDuration(1000);
//                anim.setStartDelay(10000);
//                anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                    @Override
//                    public void onAnimationUpdate(ValueAnimator animation) {
//                        float currentValue = (float) animation.getAnimatedValue();
//                        Log.d("TAG", "cuurent value is " + currentValue);
//                    }
//                });
//                anim.start();
            }
        });
    }
}