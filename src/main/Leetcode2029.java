package main;

/**
 * @Author linbo
 * @Description:
 */
public class Leetcode2029 {
    public static void main(String[] args) {
        new Leetcode2029().stoneGameIX(new int[]{1});
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
