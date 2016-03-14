package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "s1");
        labels.put(2d, "s2");
        labels.put(3d, "s3");
        labels.put(4d, "s4");
        labels.put(5d, "s5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
