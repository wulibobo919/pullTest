package main;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.ArrayList;

/**
 * @Author linbo
 * @Description:
 */
public class L6Convert {
    public static void main(String[] args) {

        String paypalishiring = convert("ab", 1);
        System.out.println(paypalishiring);

    }

    public static String convert(String s,int num){

        if (num==1){
            return s.charAt(0)+"";
        }
        int length = s.length();
        if (num<length){
            return s;
        }
        int curRow =0;
        boolean change = false;
        ArrayList<StringBuffer> row = new ArrayList<>();
        for (int i= 0;i<num;i++){
            row.add(new StringBuffer());
        }
        for (int i=0;i<length;i++){
            row.get(curRow).append(s.charAt(i));
            if (curRow==num-1 || curRow ==0){
                if (change)
                    change = false;
                else
                    change =true;
            }
            if (change){
                curRow++;
            }else {
                curRow--;
            }
        }

        StringBuffer result = new StringBuffer();
        for(int i=0;i<num;i++){
            result.append(row.get(i));
        }
        return result.toString();
    }
}
