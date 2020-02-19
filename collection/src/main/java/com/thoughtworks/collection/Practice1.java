package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */

    public static Collection<Integer> randomNumber() {
        Collection<Integer> randomNumber = new HashSet<>();
        while (randomNumber.size() < 10) {
            Random r = new Random();
            int num = r.nextInt(20);
            randomNumber.add(num);
        }
        return randomNumber;
    }
}
