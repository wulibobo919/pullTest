package main;




/**
 * @Author linbo
 * @Description:
 */
public class L7Reverse {
    public static void main(String[] args) {

//        System.out.println(reverse(1534236469));
        System.out.println(Integer.parseInt("10000000000"));

    }

    public static int reverse(int x){

        if (x == -Math.pow(2,31)){
            return 0;
        }
        int abs = Math.abs(x);
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = false;
        while (abs>=10){
            if (abs%10 != 0 || flag){
                flag = true;
                stringBuffer.append(abs%10+"");
            }
            abs/=10;

        }
        stringBuffer.append(abs+"");
        if (x>0){
            return Integer.parseInt(stringBuffer.toString());
        }else {
            return -Integer.parseInt(stringBuffer.toString());
        }

    }
}
