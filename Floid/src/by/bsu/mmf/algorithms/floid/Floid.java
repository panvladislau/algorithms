package by.bsu.mmf.algorithms.floid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class Floid {
    private int numHouses;
    private int numRoads;
    private int[][] matrix;

    public Floid(int numHouses, int numRoads, int[][] roads) {
        this.numHouses = numHouses;
        this.numRoads = numRoads;
        this.matrix = makeMatrix(roads);
    }

    public int[][] makeMatrix(int[][] roads){
        int size = this.numRoads;
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int[] road:roads){
            matrix[road[1]][road[2]] = road[0];
            matrix[road[2]][road[1]] = road[0];
        }

        return matrix;
    }

    public int shortestPath(){
        int size = this.numRoads;
        for (int k = 0; k < size; k++) {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    matrix[i][j] = Integer.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

        int[] e = new int[size];
        for (int i = 0; i < size; i++) {
            e[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                e[i] = Integer.max(e[i], matrix[i][j]);
            }
        }

        int rad = Integer.MAX_VALUE;
        int diam = 0;
        for (int i = 0; i < size; i++) {
            rad = Integer.min(rad, e[i]);
            diam = Integer.max(diam, e[i]);
        }

        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (e[i] == rad) {
                c.add(i);
            }
        }
        return c.get(0);
    }
}
