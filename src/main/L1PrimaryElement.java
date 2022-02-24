package main;

/**
 * @Author linbo
 * @Description: 主要元素，数组中占比超过一半的元素称之为主要元素。
 * 给你一个 整数 数组，找出其中的主要元素。若没有，返回 -1 。
 * 请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。
 *
 *
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-majority-element-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class L1PrimaryElement {
    public static void main(String[] args) {

    }

    public static int all(int[] a){
        int candidate  = -1;
        int count =0;

        for (int num : a) {
            if (count==0){
                candidate = num;
            }
            if (candidate == num){
                count++;
            }else{
                count--;
            }

        }
        count  = 0;
        for (int i : a) {
            if (candidate == i){
                count++;
            }
        }
        return count*2>a.length ? candidate:-1;

    }



}
