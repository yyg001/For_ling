package com.example.for_ling;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.example.for_ling.lunbotu.LoopViewAdapter;
import com.example.for_ling.lunbotu.pagerOnClickListener;

import java.util.ArrayList;


public class OneFragment extends Fragment {

    private ViewPager viewPager;  //轮播图模块
    private int[] mImg;
    private int[] mImg_id;
    private String[] mDec;
    private ArrayList<ImageView> mImgList;
    private LinearLayout ll_dots_container;
    private TextView loop_dec;
    private int previousSelectedPosition = 0;
    boolean isRunning = false;


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
        initLoopView();  //实现轮播图
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
    private void initLoopView() {
        viewPager = (ViewPager)getView().findViewById(R.id.loopviewpager);
        ll_dots_container = (LinearLayout)getView().findViewById(R.id.ll_dots_loop);
        loop_dec = (TextView)getView().findViewById(R.id.loop_dec);

        // 图片资源id数组
        mImg = new int[]{
                R.drawable.a04,
                R.drawable.a10,
                R.drawable.a06,
                R.drawable.a07,
                R.drawable.a08,
        };

        // 文本描述
        mDec = new String[]{
                "Test1",
                "Test2",
                "Test3",
                "Test4",
                "Test5"
        };

        mImg_id = new int[]{
                R.id.pager_img1,
                R.id.pager_img2,
                R.id.pager_img3,
                R.id.pager_img4,
                R.id.pager_img5
        };

        // 初始化要展示的5个ImageView
        mImgList = new ArrayList<ImageView>();
        ImageView imageView;
        View dotView;
        LinearLayout.LayoutParams layoutParams;
        for(int i=0;i<mImg.length;i++){
            //初始化要显示的图片对象
            imageView = new ImageView(getActivity());
            imageView.setBackgroundResource(mImg[i]);
            imageView.setId(mImg_id[i]);
            imageView.setOnClickListener(new pagerOnClickListener(getActivity()));
            mImgList.add(imageView);
            //加引导点
            dotView = new View(getActivity());
            dotView.setBackgroundResource(R.drawable.dot);
            layoutParams = new LinearLayout.LayoutParams(10,10);
            if(i!=0){
                layoutParams.leftMargin=10;
            }
            //设置默认所有都不可用
            dotView.setEnabled(false);
            ll_dots_container.addView(dotView,layoutParams);
        }

        ll_dots_container.getChildAt(0).setEnabled(true);
        loop_dec.setText(mDec[0]);
        previousSelectedPosition=0;
        //设置适配器
        viewPager.setAdapter(new LoopViewAdapter(mImgList));
        // 把ViewPager设置为默认选中Integer.MAX_VALUE / t2，从十几亿次开始轮播图片，达到无限循环目的;
        int m = (Integer.MAX_VALUE / 2) %mImgList.size();
        int currentPosition = Integer.MAX_VALUE / 2 - m;
        viewPager.setCurrentItem(currentPosition);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                int newPosition = i % mImgList.size();
                loop_dec.setText(mDec[newPosition]);
                ll_dots_container.getChildAt(previousSelectedPosition).setEnabled(false);
                ll_dots_container.getChildAt(newPosition).setEnabled(true);
                previousSelectedPosition = newPosition;
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        // 开启轮询
        new Thread(){
            public void run(){
                isRunning = true;
                while(isRunning){
                    try{
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //下一条
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                        }
                    });
                }
            }
        }.start();

    }
}