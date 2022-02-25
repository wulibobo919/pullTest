package main;

import java.io.IOException;

/**
 * @Author linbo
 * @Description:
 */
public class Leetcode2029 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process pro = runtime.exec("git -C /Users/xushantong/Downloads/testPull/linbo/pullTest/ pull -X --theirs");
            pro.waitFor();
            System.out.println(pro.exitValue());
            pro.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public boolean stoneGameIX(int[] stones){
        boolean isAlice  = true;
        boolean success  = false;
        int sum  = 0;
        int length = stones.length;
        while (length-- > 0){
            for (int i=0;i<stones.length;i++){
                if ((stones[i]+sum)%3 != 0);
            }
            System.out.println();
        }
        return false;
    }



}
