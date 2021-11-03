package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import static java.lang.StrictMath.*;
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 2, 15, 3, 1, 8, 5,9,23};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }}
//    int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
//    insertionSort(array);
//    System.out.println(Arrays.toString(array));
//}
//
//    public static void insertionSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i;
//            while (j > 0 && array[j - 1] > current) {
//                array[j] = array[j - 1];
//                j--;
//            }
//            array[j] = current;
//        }
//
//    }
//}
//    static int vstavkami(){
//        int[] array = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array));
//        for (int left = 0; left < array.length; left++) {
//            // Вытаскиваем значение элемента
//            int value = array[left];
//            // Перемещаемся по элементам, которые перед вытащенным элементом
//            int i = left - 1;
//            for (; i >= 0; i--) {
//                // Если вытащили значение меньшее — передвигаем больший элемент дальше
//                if (value < array[i]) {
//                    array[i + 1] = array[i];
//                } else {
//                    // Если вытащенный элемент больше — останавливаемся
//                    break;
//                }
//            }
//            // В освободившееся место вставляем вытащенное значение
//            array[i + 1] = value;
//        }
//
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("m:"+array);
//    }}}