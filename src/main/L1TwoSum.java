package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author linbo
 * @Description:
 */
public class L1TwoSum {
    public static void main(String[] args) {
        System.out.println("modify");
        System.out.println();
    }

    public static int[] twoSum(int[] src,int target){

       Map<Integer,Integer> num = new HashMap<>();

       for(int i = 0;i<src.length;i++){
           if (num.containsKey(target-src[i])){
               return new int[]{i,num.get(target-src[i])};
           }else{

               num.put(src[i],i);
           }
       }

       return new int[]{};

      }
}
