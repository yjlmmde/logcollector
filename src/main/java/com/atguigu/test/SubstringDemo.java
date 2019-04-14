package com.atguigu.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by yjl
 * Data: 2019/4/11
 * Time: 15:04
 */
public class SubstringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abcd我们啊ddd";
//        System.out.println(subStringByBytes(str, 6,"gbk"));
        System.out.println(subStringByBytes(str, 1,"utf-8"));

        String en = "a";
        String cn = "我";

        System.out.println("英文_GBK：" + en.getBytes("GBK").length);
        System.out.println("汉字_GBK：" + cn.getBytes("GBK").length);
        System.out.println("英文_UTF-8：" + en.getBytes("UTF-8").length);
        System.out.println("汉字_UTF-8：" + cn.getBytes("UTF-8").length);




    }
    public static String subStringByBytes(String str, int bytes,String charSetName) throws UnsupportedEncodingException {
        String subAfter = str.substring(0, bytes);
        int temp = bytes;
        try {
            //直到截取的字符串的字节数  和   需要的 截取的字节数相等位为止
            while(bytes < subAfter.getBytes(charSetName).length-3){
                subAfter = subAfter.substring(0,--temp );
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return subAfter;
    }

}
