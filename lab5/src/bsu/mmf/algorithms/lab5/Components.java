package bsu.mmf.algorithms.lab5;

public class Components {
    private int[][] matrix;
    private boolean[] visited;
    private int[] component;

    public Components(int[][] matrix) {
        this.matrix = matrix;
        this.visited = new boolean[matrix.length];
        this.component = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            this.visited[i] = false;
            this.component[i] = 0;
        }
    }

    public void dfs(int v, int components) {
        visited[v] = true;
        component[v] = components;

        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[v][i] == 1 && !visited[i]) {
                dfs(i, components);
            }
        }
    }

    public String maxComponents() throws Exception {
        int component = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            if (!this.visited[i]) {
                dfs(i, component);
                component++;
            }
        }
        if (component == 1) {
            return "Success";
        } else {
            int max = 0;
            int[] arr = new int[component];

            for (int i = 0; i < component; i++) {
                arr[i] = 0;
            }

            for (int i = 0; i < this.matrix.length; i++) {
                arr[this.component[i]]++;
            }

            for (int i = 0; i < component; i++) {
                if (max < arr[i]) max = arr[i];
            }

            return "Max num:" + Integer.toString(max);
        }
    }
}
