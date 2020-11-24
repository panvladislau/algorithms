package by.bsu.mmf.algotithms.euler;

public class Euler {
    private String[] arr;

    public Euler(String[] arr) {
        this.arr = arr;
    }

    public static int[][] makeMatrix(String[] arr){
        int[][] matrix = new int[32][32];
        for (int i = 0; i < arr.length; i++){
            matrix[(int)arr[i].charAt(0) - 1040][(int)arr[i].charAt(arr[i].length() - 1) - 1072] = 1;
        }
        //выписывание матрицы
        /*for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/
        return matrix;
    }

    public boolean eulerMethod(){
        int[][] matrix = makeMatrix(this.arr);
        int line = 0;
        int column = 0;
        int counter = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                line += matrix[i][j];
            }
            for (int j = 0; j < matrix.length; j++){
                column += matrix[j][i];
            }
            if (line == column){
                counter++;
            }
        }
        if (counter == matrix.length){
            return true;
        }
        return false;
    }
}
