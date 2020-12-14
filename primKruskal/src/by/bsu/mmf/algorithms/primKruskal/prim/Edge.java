package by.bsu.mmf.algorithms.primKruskal.prim;

import java.util.ArrayList;

public class Edge {
    public int v1, v2;
    public int weight;

    public Edge() {
    }

    public Edge(int v1, int v2, int weight)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public ArrayList<Edge> randomEdgeArray(int n){
        ArrayList<Edge> result = new ArrayList<Edge>(n*n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.add(new Edge(i, j, (int)(Math.random() * 11)));
                result.add(new Edge(j, i, (int)(Math.random() * 11)));
            }
        }
        return result;
    }

    public static ArrayList<Edge> sort(ArrayList<Edge> edges){
        Edge edge;
        for (int i = 0; i < edges.size() - 1; i++) {
            if(edges.get(i).weight > edges.get(i + 1).weight){
                edge = edges.get(i);
                edges.set(i,edges.get(i + 1));
                edges.set(i + 1,edge);
            }
        }
        return edges;
    }

    public int compareTo(Edge edge) {
        if (weight != edge.weight) {return weight < edge.weight ? -1 : 1;}
        return 0;
    }
}
