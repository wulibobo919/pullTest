package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author linbo
 * @Description:
 */
public class L2AddTwoNumbers {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.printf(L2AddTwoNumbers.array2int(a)+"");
        int b =120;
        Integer[] integers = L2AddTwoNumbers.int2array(b);
        for (Integer integer : integers) {
            System.out.printf(" "+integer);
        }

    }

    public static int array2int(int[] src){
        int result = 0;
        for (int i=0 ;i<src.length;i++){
            for (int j=0;j<i;j++) {
                src[i] *= 10;
            }
        }
        for (int i = 0;i<src.length;i++){
            result+=src[i];
        }
        return result;
    }

    public static Integer[] int2array(int src){
        List<Integer> integers = new ArrayList<>();
        while(src/10!=0){
            integers.add(src%10);
            src/=10;
        }
        integers.add(src);
        return integers.toArray(new Integer[integers.size()]);
    }
}
