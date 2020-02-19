package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List

        /**
         * 创建一个List 然后在List中添加0到100整数
         */
        List<Integer> list = getNumbers();

        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(getNumbers().get(i));
        }

        //增强for循环
        for (int i : list) {
            System.out.println(i);
        }

        //迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

    public static List<Integer> getNumbers() {
        List<Integer> getNumbers = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            getNumbers.add(i);
        }
        return getNumbers;
    }
}
