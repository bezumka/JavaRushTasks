package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5461));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        return number / 100 + (number / 10) % 10 + number % 10;
    }

}