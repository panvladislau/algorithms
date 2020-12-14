package by.bsu.mmf.algorithms.primKruskal.kruskal;

import by.bsu.mmf.algorithms.primKruskal.prim.Edge;

import java.util.ArrayList;

public class Kruskal {
    int Kruskal(int vNum, ArrayList<Edge> edges) {
        DFS dsf = new DFS(vNum); // СНМ
        Edge.sort(edges); // Сортируем ребра
        int ret = 0; // результат
        for (Edge e : edges) { // перебираем ребра в порядке возрастания
            if (dsf.union(e.v1, e.v2)) { // если ребра принадлежат разным компонентам
                ret += e.weight; // добавляем вес ребра к стоимости MST
            }
        }
        return ret;
    }
}
