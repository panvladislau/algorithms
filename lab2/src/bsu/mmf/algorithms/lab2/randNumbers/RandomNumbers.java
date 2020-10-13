package bsu.mmf.algorithms.lab2.randNumbers;

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
        int a = (int)((Math.random() * 10));
        array[0] = a;
        a = (int)((Math.random() * 100));
        array[1] = a;
        for(int i = 2; i < n; i++){
            a = (int)((Math.random() * 1000));
            if(array[i - 1] < a){
                array[i] = a;
            }
            else {
                array[i] = array[i - 1];
            }
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
