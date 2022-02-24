package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author linbo
 * @Description:
 */
public class L3LengthOfLongestSubstring {
    public static void main(String[] args) {

        int abcabcbb = L3LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcbb);
    }

    public static int lengthOfLongestSubstring(String s){
        int left=0,right = 0;
        int length = s.length();
        int maxLength = 0;
        Set<String> set = new HashSet<>();

        while(right<length){
            if (set.contains(s.charAt(right)+"")){
                set.remove(s.charAt(left)+"");
                left++;
            }else{
                set.add(s.charAt(right)+"");
                right++;
            }
            maxLength = Math.max(maxLength,right-left);

        }
        return maxLength;
    }
}
