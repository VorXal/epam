package com.company;
import java.util.*;
import java.lang.*;


public abstract class Main {


    public static int[] bubble_sort(int[] array){
        int size = array.length;
        for(int i = 0; i < size; i++){
            for(int j  = size-1; j >= i+1; j--){
                if(array[j]<array[j-1]){
                    int change = array[j];                  //Задание1. Функция сортировки пузырьком
                    array[j] = array[j-1];
                    array[j-1] = change;
                }
            }
        }
        return array;
    }

    public static boolean isTrue(int number, int[] array){
        boolean flag = false;
        for (int i = 0; i < array.length; i++)
            if (array[i] == number) {                       //Задание2. Функция посика
                flag = true;
            }
        return flag;
    }

    public static void onlyOneTimeInString(String string){
        ArrayList<String> list = new ArrayList<String>();
        String s[]=string.split(" ");
        String p = s[0];
        list.add(p);
        for (int i = 1; i < s.length; i++) {                //Задание3. Функция вывода уникальных слов в строке
            if (!(list.contains(s[i]))) {
                list.add(s[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));}
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n  ; i++){
            fact*=i;                                        //Задание4. Функция нахождения факториала
        }
        return fact;
    }

    public static void trueBrackets(String string){
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        char[] str = string.toCharArray();
        if(str.length % 2 == 1){                            //Задание5(со звездочкой). Правильная строчная последовательность
            System.out.println("String is not correct!");
        }
        else {
            for(int i = 0; i <= str.length/2-1; i++){
                if(Character.toString(str[str.length-i-1]).equals(map.get(Character.toString(str[i])))){
                    if (i==str.length/2-1) System.out.println("String is correct!");
                }
                else{
                    System.out.println("String is not correct!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1:");
        int[] a ={0, 2, 8, 5, 4, 6, 10, 2, 4};
        bubble_sort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\n\n\nЗадание №2:");
        System.out.println(isTrue(7,a));

        System.out.println("\n\n\nЗадание №3:");
        onlyOneTimeInString("Hello Hello How How Not");

        System.out.println("\n\n\nЗадание №4:");
        System.out.println(factorial(2));

        System.out.println("\n\n\nЗадание №5:");
        trueBrackets("{[([])]}");
    }

}
