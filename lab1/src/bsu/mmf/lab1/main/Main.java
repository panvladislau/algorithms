package bsu.mmf.lab1.main;

import bsu.mmf.lab1.algorithms.Algorithms;
import bsu.mmf.lab1.randomNumbers.RandomNumbers;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] array1 = randomNumbers.makeArr(256);
        int[] array2 = randomNumbers.makeArr(131072);
        int[] array3 = randomNumbers.makeArr1(131072);
        int[] array4 = randomNumbers.makeArr2(131072);

        Algorithms algorithms = new Algorithms();
        int[] sortedNum = new int[array1.length];
        long start;
        long end;

        System.out.println("Пузырек 1");
        start = System.nanoTime();
        sortedNum = algorithms.bubble(array1.clone());
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Пузырек 2");
        start = System.nanoTime();
        sortedNum = algorithms.bubble(array2.clone());
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Пузырек 3");
        start = System.nanoTime();
        sortedNum = algorithms.bubble(array3.clone());
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Пузырек 4");
        start = System.nanoTime();
        sortedNum = algorithms.bubble(array4.clone());
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Вставка 1");
        int[] sortedList0 = array1.clone();
        start = System.nanoTime();
        algorithms.insertion(sortedList0);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Вставка 2");
        sortedList0 = array2.clone();
        start = System.nanoTime();
        algorithms.insertion(sortedList0);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Вставка 3");
        sortedList0 = array3.clone();
        start = System.nanoTime();
        algorithms.insertion(sortedList0);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Вставка 4");
        sortedList0 = array4.clone();
        start = System.nanoTime();
        algorithms.insertion(sortedList0);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Быстрая 1");
        int[] sortedList1 = array1.clone();
        start = System.nanoTime();
        algorithms.quickSort(sortedList1,0, sortedList1.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Быстрая 2");
        sortedList1 = array2.clone();
        start = System.nanoTime();
        algorithms.quickSort(sortedList1,0, sortedList1.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Быстрая 3");
        sortedList1 = array2.clone();
        start = System.nanoTime();
        algorithms.quickSort(sortedList1,0, sortedList1.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Быстрая 4");
        sortedList1 = array4.clone();
        start = System.nanoTime();
        algorithms.quickSort(sortedList1,0, sortedList1.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Слияние 1");
        int[] sortedList2 = array1.clone();
        start = System.nanoTime();
        algorithms.mergeSort(sortedList2,0, sortedList2.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Слияние 2");
        sortedList2 = array2.clone();
        start = System.nanoTime();
        algorithms.mergeSort(sortedList2,0, sortedList2.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Слияние 3");
        sortedList2 = array3.clone();
        start = System.nanoTime();
        algorithms.mergeSort(sortedList2,0, sortedList2.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Слияние 4");
        sortedList2 = array4.clone();
        start = System.nanoTime();
        algorithms.mergeSort(sortedList2,0, sortedList2.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Черпаком 1");
        int[] sortedList3 = array1.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList3,sortedList3.length - 1);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Черпаком 2");
        sortedList3 = array2.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList3,sortedList3.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Черпаком 3");
        sortedList3 = array3.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList3,sortedList3.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Черпаком 4");
        sortedList3 = array4.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList3,sortedList3.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Смешанная 1");
        int[] sortedList4 = array1.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList4,sortedList4.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Смешанная 2");
        sortedList4 = array2.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList4,sortedList4.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Смешанная 3");
        sortedList4 = array3.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList4,sortedList4.length);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("Смешанная 4");
        sortedList4 = array4.clone();
        start = System.nanoTime();
        algorithms.countingSort(sortedList4,sortedList4.length);
        end = System.nanoTime();
        System.out.println(end - start);

    }
}
