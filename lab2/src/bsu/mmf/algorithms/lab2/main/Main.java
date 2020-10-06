package bsu.mmf.algorithms.lab2.main;

import bsu.mmf.algorithms.lab2.randNumbers.RandomNumbers;
import bsu.mmf.algorithms.lab2.search.Searchs;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] arr = randomNumbers.makeArr1(1048576);
        arr[1] = 10;
        long start;
        long end;
        int number = -2;

        for(int i = 0; i < 20000; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        start = System.nanoTime();
        Searchs.simpleSearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.simpleSearch(arr, number));

        start = System.nanoTime();
        Searchs.binarySearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.binarySearch(arr, number));

        start = System.nanoTime();
        Searchs.interpolationSearch(arr,number);
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Searchs.interpolationSearch(arr, number));
    }
}
