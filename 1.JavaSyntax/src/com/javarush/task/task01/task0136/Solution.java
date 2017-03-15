package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения — double.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        //напишите тут ваш код
        return (double) weightEarth * 17 / 100;
    }
}