package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<String>();

        set.add("Л1");
        set.add("Л2");
        set.add("Л3");
        set.add("Л4");
        set.add("Л5");
        set.add("Л6");
        set.add("Л7");
        set.add("Л8");
        set.add("Л9");
        set.add("Л10");
        set.add("Л11");
        set.add("Л21");
        set.add("Л31");
        set.add("Л41");
        set.add("Л51");
        set.add("Л61");
        set.add("Л71");
        set.add("Л81");
        set.add("Л91");
        set.add("Л101");


        return (HashSet<String>) set;
    }
}
