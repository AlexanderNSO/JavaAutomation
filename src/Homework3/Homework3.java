package Homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        fillArray();
        fillDiagonal();
        changeArray();
        invertArray();
        System.out.println(Arrays.toString(getArray(6,8)));
        printMaxMinElement(new int[]{1,3,2,-5,2,5,7,4,2,});
        System.out.println(checkBalance(new int[]{1,2,3,3,2,1}));
    }
//task 1
    public static void invertArray() {
        int[] array1 = {1, 0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
//task 2
    public static void changeArray() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(array3));
    }
//  task 3
    public static void fillDiagonal() {
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i] == array[j]) {
                    array[i][j] = 1;
                } else if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
// task 4
    public static void fillArray() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] += i + 1;
        }
        System.out.println(Arrays.toString(array2));
    }
// task 5
    public static int[] getArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
//task 6

    public static void  printMaxMinElement(int[] array){
        int max = array[0];
        int min = array[0];

        for (int value : array) {
            if (max <= value) {
                max = value;
            } else if (min >= value) {
                min = value;
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }

    //task 7

    public static boolean checkBalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}
