package bsu.mmf.algorithms.lab2.search;

public class Searchs {
    public static int simpleSearch(int[] arr, int number) {
        for(int i = 0; i < arr.length; i++){
            if( number == arr[i] ){
                return i + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int number) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
            mid = (left + right) / 2;
            if (number == arr[mid]) {
               return mid + 1;
            }
            if (number < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static int interpolationSearch(int[] arr, int number) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
        while (arr[left] < number && arr[right] > number) {
            if (arr[right] == arr[left]) {
                break;
            }
            mid = left + (number * (right - left))/(arr[right] - arr[left]);
            if (arr[mid] < number)
                left = mid + 1;
            if (arr[mid] > number)
                right = mid - 1;
            if (arr[mid] == number)
                return mid + 1;
        }
        if (arr[left] == number)
            return left + 1;
        if (arr[right] == number)
            return right + 1;
        return -1;
    }
}
