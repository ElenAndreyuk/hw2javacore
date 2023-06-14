package ru.gb.jcore.part1;

public class Main {
    /**
     * 1.Написать метод, возвращающий количество чётных элементов массива.
     *  countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     * 2.Написать функцию, возвращающую разницу между самым большим и самым маленьким
     * элементами переданного не пустого массива.
     * 3. Написать функцию, возвращающую истину, если в переданном массиве есть
     * два соседних элемента, с нулевым значением.
     * ЛИБО
     * доработать игру Змейка:
     * 1. Добавить логику с ядом (Game over при попадании на ячейку с ядом)
     * 2*. Разнести логику и отрисовку
     * 3. И другие улучшения по желанию
     **/
    public static void main(String[] args) {
        int[] array = {-7, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(countEvens(array));
        System.out.println(difference(array));
        System.out.println(areAdjacentZeros(array));


    }
//  * 1.Написать метод, возвращающий количество чётных элементов массива.
//  *  countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static int countEvens(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
//     * 2.Написать функцию, возвращающую разницу между самым большим и самым маленьким
//     * элементами переданного не пустого массива.
    public static int difference(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]> max){
                max = array[i];
            }
            if(array[i]< min){
                min = array[i];
            }
        }
        return max - min;
    }
//     * 3. Написать функцию, возвращающую истину, если в переданном массиве есть
//     * два соседних элемента, с нулевым значением.
    public static boolean  areAdjacentZeros(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == 0 && array[i+1] == 0){
                return true;
            }
        }
        return false;
    }



}