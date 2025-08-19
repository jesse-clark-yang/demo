package com.yfc.clark.java.test;

/**
 * 第一题代码，给定一个字符串，将连续相同的三个字符串删除
 */

public class ZdjxTest1 {
    public static void main(String[] args) {
        String source = "aabcccbaaaddd";
        int total=getTotalMoreThan3(source);
        for(int i=0;i<total;i++){
            if (isCharMoreThan3(source)) {
                int[] charLessThan3 = getCharMoreThan3(source);
                source = source.substring(0, charLessThan3[0]) + source.substring(charLessThan3[1]+1);
            }
        }

        System.out.println(source+" 总共重复"+total+"次");
    }

    /**
     * 获取首个3个相同字符的首尾位置
     * @param source 源字符串
     * @return 字符串中首个3个相同字符首尾位置数组
     */
    public static int[] getCharMoreThan3(String source) {
        int[] startAndEnd = new int[2];
        String target = source;
        int size = source.length();
        int identicalNum = 0;
        for (int i = 0; i < size - 2; i++) {
            char charOne = source.charAt(i);
            char charTwo = source.charAt(i + 1);
            char charThree = source.charAt(i + 2);
            if (charOne == charTwo && charTwo == charThree) {
                identicalNum = 3;
                if (identicalNum >= 3) {
                    startAndEnd[0] = i;
                    startAndEnd[1] = i + 2;
                    return startAndEnd;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return startAndEnd;
    }

    /**
     * 判断字符串中是否含有三个相邻的相同字符
     * @param source 源字符串
     * @return 是否含有三个相邻的相同字符
     */
    public static boolean isCharMoreThan3(String source) {
        boolean isCharLessThan3 = false;
        int size = source.length();
        for (int i = 1; i < size; i++) {
            char charOne = source.charAt(i);
            char charTwo = source.charAt(i + 1);
            char charThree = source.charAt(i + 2);
            if (charOne == charTwo && charTwo == charThree) {
                isCharLessThan3 = true;
                break;
            }
        }
        return isCharLessThan3;
    }

    /**
     * 字符串中总共包含三个相邻的相同字符的个数
     * @param source 源字符串
     * @return 总个数
     */
    public static int getTotalMoreThan3(String source){
        int num = 0;
        int size = source.length();
        for (int i = 1; i < size-2; i++) {
            char charOne = source.charAt(i);
            char charTwo = source.charAt(i + 1);
            char charThree = source.charAt(i + 2);
            if (charOne == charTwo && charTwo == charThree) {
                num =num+1;
            }
        }
        return num;
    }
}
