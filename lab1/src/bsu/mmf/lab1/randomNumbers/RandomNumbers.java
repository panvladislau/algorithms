package bsu.mmf.lab1.randomNumbers;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public int[] makeArr(int n){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = (int)(Math.random() * 101);
        }
        return array;
    }

    public int[] makeArr1(int n){
        int[] array = new int[n];
        for(int i = 2; i < n; i++){
            array[i] = (int)((Math.random() * i));
        }
        return array;
    }

    public int[] makeArr2(int n){
        int[] array = new int[n];
        for(int i = 2; i < n; i++){
            array[i] = (int)((Math.random() * 10));
        }
        return array;
    }
}
