package bsu.mmf.algorithms.lab5;

public class Bipartition {
    private int[][] matrix;
    private boolean[] visited;
    private int[] colors;

    public Bipartition(int[][] matrix) {
        this.matrix = matrix;
        this.colors = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            this.colors[i] = 0;
        }
    }

    public void dfs(int v, int counter) {
        this.colors[v] = counter;
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[v][i] == 1 && this.colors[i]==0) {
                counter++;
                dfs(i, counter);
            } else if (this.matrix[v][i] == 1 && this.colors[i]%2 == counter%2 && v != i){
                return;
            }
        }
    }

    public boolean biparationMethod(int v){
        dfs(v, 1);
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.colors[i] == 0) {
                dfs(i, 1);
            }
        }
        for(int i = 0; i < this.matrix.length - 1; i++){
            if(this.colors[i]%2 == this.colors[i+1]%2){
                return false;
            }
        }
        return true;
    }
}
