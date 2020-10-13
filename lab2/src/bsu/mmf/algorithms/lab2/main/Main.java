package bsu.mmf.algorithms.lab2.main;

import bsu.mmf.algorithms.lab2.randNumbers.RandomNumbers;
import bsu.mmf.algorithms.lab2.search.Searchs;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] arr = randomNumbers.makeArr1(1048576);
        arr[2] = 100;
        long start;
        long end;
        int number = 100;

        for(int i = 0; i < 200; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Эллемент 3й");

        System.out.println("Преребором");
        start = System.nanoTime();
        Searchs.simpleSearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.simpleSearch(arr, number));

        System.out.println("Бинарная");
        start = System.nanoTime();
        Searchs.binarySearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.binarySearch(arr, number));

        System.out.println("Интерполяционная");
        start = System.nanoTime();
        Searchs.interpolationSearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.interpolationSearch(arr, number));
    }
}
