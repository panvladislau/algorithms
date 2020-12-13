package by.bsu.mmf.algorithms.main;

import by.bsu.mmf.algorithms.floid.Floid;

public class Main {
    public static void main(String[] args) {
        int houses = 5;
        int roads = 6;
        int[][] ways = {{1,1,2},{1,2,3},{1,3,4},{2,4,5},{4,4,5},{2,1,2}};
        Floid floid = new Floid(houses, roads, ways);
        System.out.println(floid.shortestPath());
    }
}
