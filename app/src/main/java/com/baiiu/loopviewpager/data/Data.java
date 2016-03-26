package com.baiiu.loopviewpager.data;

import com.baiiu.loopviewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * auther: baiiu
 * time: 16/3/26 26 17:11
 * description:
 */
public class Data {

    public static List<Integer> provideListLocal() {
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.gank610dc034jw1f27tuwswd3j20hs0qoq6q);
        list.add(R.drawable.gank7a8aed7bgw1etlw75so1hj20qo0hsgpk);
        list.add(R.drawable.gank7a8aed7bjw1f25gtggxqjj20f00b9tb5);
        list.add(R.drawable.gank7a8aed7bjw1f27uhoko12j20ez0miq4p);
        return list;
    }

    public static List<String> provideListRemote() {
        List<String> list = new ArrayList<>();
        list.add("http://ww1.sinaimg.cn/large/7a8aed7bjw1f20ruz456sj20go0p0wi3.jpg");
        list.add("http://ww3.sinaimg.cn/large/7a8aed7bgw1etlw75so1hj20qo0hsgpk.jpg");
        list.add("http://ww2.sinaimg.cn/large/7a8aed7bjw1f25gtggxqjj20f00b9tb5.jpg");
        list.add("http://ww1.sinaimg.cn/large/7a8aed7bjw1f27uhoko12j20ez0miq4p.jpg");
        list.add("http://ww2.sinaimg.cn/large/610dc034jw1f27tuwswd3j20hs0qoq6q.jpg");

        return list;
    }


}