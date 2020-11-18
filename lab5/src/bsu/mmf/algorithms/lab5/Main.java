package bsu.mmf.algorithms.lab5;

class Main {
    public static void main(String[] arr) throws Exception {
        int[][] matrix = {
                {0,1,0,0,0},
                {1,0,1,0,0},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {0,0,0,1,0}};
        Components matrix1 = new Components(matrix);
        System.out.println(matrix1.maxComponents());

        Bipartition bipartition = new Bipartition(matrix);
        System.out.println(bipartition.biparationMethod(0));
    }
}