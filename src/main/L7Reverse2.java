package main;

import org.omg.CORBA.INTERNAL;

/**
 * @Author linbo
 * @Description:
 */
public class L7Reverse2 {
    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(-10));
        System.out.println(reverse(153423646));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverse(-2147483412));
    }

    public static int reverse(int x){

        int result = 0;
        int temp = 0;

        while(x!=0){

            temp = x%10;
            result=(result+temp)*10;
            x/=10;
            if (result/10<Integer.MIN_VALUE/10 || result/10>Integer.MAX_VALUE/10){
                return 0;
            }
        }
        return result/10;

    }

}
