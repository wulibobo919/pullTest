package main;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author linbo
 * @Description:
 */
public class RandomUrl {

    public static List<String> getSixUrl(){
        //在这个数组里面放入你的URL
        String[] URL = {"",""};
        Random random = new Random();
        List<String> urls = new ArrayList<>();
        for (int i=0;i<6;i++){
            urls.add(URL[random.nextInt(URL.length)]);
        }
        return urls;
    }
}
