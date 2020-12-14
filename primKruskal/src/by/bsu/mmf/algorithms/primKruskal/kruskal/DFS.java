package by.bsu.mmf.algorithms.primKruskal.kruskal;

public class DFS {
    int[] set; // номер множества
    int[] rnk; // ранг

    DFS(int size) {
        set = new int [size];
        rnk = new int [size];
        for (int i = 0; i < size; i++) {
            set[i] = i;
        }
    }

    /* Возвращает множество, которому принадлежит x */
    public int set(int x) {
        return x == set[x] ? x : (set[x] = set(set[x]));
    }

    /* Если u и v лежат в разных множествах, то сливаем их и возвращаем true */
    public boolean union(int u, int v) {
        if ((u = set(u)) == (v = set(v))) {return false;}

        if (rnk[u] < rnk[v]) {
            set[u] = v;
        } else {
            set[v] = u;
            if (rnk[u] == rnk[v]) {rnk[u]++;}
        }
        return true;
        }
}
