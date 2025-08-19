package com.yfc.clark.java.test;

/**
 * 第二题，需求，将连续相同的三个字母替换成指定字母，最终保证不会出现3个连续相同的字母
 * 例如将ccc->b,bbb->a,aaa->''
 */

public class ZdjxTest2 {
    private static final String REPLACE1="ccc";
    private static final String REPLACE2="bbb";
    private static final String REPLACE3="aaa";

    public static void main(String[] args) {
        String source = "abcccbad";
        String target = source;
        while(ZdjxTest1.isCharMoreThan3(target)){
            if(target.contains(REPLACE1)) target = replaceThreeIdenticalChar(target,REPLACE1,'b');
            if(target.contains(REPLACE2)) target = replaceThreeIdenticalChar(target,REPLACE2,'a');
            if(target.contains(REPLACE3)) target = replaceThreeIdenticalChar(target,REPLACE3,' ');
        }
        System.out.println("输出的字符串为"+target);

    }

    /**
     * 将连续相同的三个字符串替换为单字符
     * @param source 源字符串
     * @param replace 需要替换的字符串
     * @param target 替换为这个字符
     * @return 替换后的字符串。
     */
    public static String replaceThreeIdenticalChar(String source,String replace,char target){
        String replaceString = " " + target;
        String targetString = source;
        targetString =   targetString.replaceAll(replace,replaceString).replaceAll(" ","");
        return targetString;
    }

}
