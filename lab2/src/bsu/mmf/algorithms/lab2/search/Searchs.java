package bsu.mmf.algorithms.lab2.search;

public class Searchs {
    public static int simpleSearch(int[] arr, int number) {
        for(int i = 0; i < arr.length; i++){
            if( number == arr[i]){
                return i + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int number) {
        int left = 0;
        int right = arr.length;
        int search = -1;
        while (left <= right) // пока левая граница не "перескочит" правую
        {
            int mid = (left + right) / 2; // ищем середину отрезка
            if (number == arr[mid]) {  // если ключевое поле равно искомому
                search = mid;     // мы нашли требуемый элемент,
                break;            // выходим из цикла
            }
            if (number < arr[mid])     // если искомое ключевое поле меньше найденной середины
                right = mid - 1;  // смещаем правую границу, продолжим поиск в левой части
            else                  // иначе
                left = mid + 1;   // смещаем левую границу, продолжим поиск в правой части
        }
        if (search == -1)     // если индекс элемента по-прежнему -1, элемент не найден
            return -1;
        else          // иначе выводим элемент, его ключ и значение
           return search + 1;
    }

    public static int interpolationSearch(int[] sortedArray, int toFind) {
        // Возвращает индекс элемента со значением toFind или -1, если такого элемента не существует
        int mid;
        int low = 0;
        int high = sortedArray.length - 1;

        while (sortedArray[low] < toFind && sortedArray[high] > toFind) {
            if (sortedArray[high] == sortedArray[low]) // Защита от деления на 0
                break;
            mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);

            if (sortedArray[mid] < toFind)
                low = mid + 1;
            else if (sortedArray[mid] > toFind)
                high = mid - 1;
            else
                return mid + 1;
        }

        if (sortedArray[low] == toFind)
            return low + 1;
        if (sortedArray[high] == toFind)
            return high + 1;

        return -1; // Not found
    }


}
