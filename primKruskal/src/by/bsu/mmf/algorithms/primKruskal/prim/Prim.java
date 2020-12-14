package by.bsu.mmf.algorithms.primKruskal.prim;

import java.util.ArrayList;

public class Prim {
    public ArrayList<Edge> prim(int numberV, ArrayList<Edge> E) {
        ArrayList<Edge> result = null;
        //неиспользованные ребра
        ArrayList<Edge> notUsedE = E;
        //использованные вершины
        ArrayList<Integer> usedV = new ArrayList<Integer>(numberV);
        //неиспользованные вершины
        ArrayList<Integer> notUsedV = new ArrayList<Integer>(numberV);
        for (int i = 0; i < numberV; i++)
            notUsedV.add(i);
        //выбираем случайную начальную вершину
        usedV.add((int)(Math.random()*(numberV + 1)));
        notUsedV.remove(usedV.get(0));
        while (notUsedV.size() > 0) {
            int minE = -1; //номер наименьшего ребра
            //поиск наименьшего ребра
            for (int i = 0; i < notUsedE.size(); i++) {
                System.out.println(notUsedE.get(i).v1 + " " + notUsedE.get(i).v2);
                if ((usedV.indexOf(notUsedE.get(i).v1) != -1) && (notUsedV.indexOf(notUsedE.get(i).v2) != -1) ||
                        (usedV.get(notUsedE.get(i).v2) != -1) && (notUsedV.indexOf(notUsedE.get(i).v1) != -1)) {
                    if (minE != -1) {
                        if (notUsedE.get(i).weight < notUsedE.get(minE).weight)
                            minE = i;
                    } else
                        minE = i;
                }
            }
            //заносим новую вершину в список использованных и удаляем ее из списка неиспользованных
            if (usedV.indexOf(notUsedE.get(minE).v1) != -1) {
                usedV.add(notUsedE.get(minE).v2);
                notUsedV.remove(notUsedE.get(minE).v2);
            } else {
                usedV.add(notUsedE.get(minE).v1);
                notUsedV.remove(notUsedE.get(minE).v1);
            }
            //заносим новое ребро в дерево и удаляем его из списка неиспользованных
            result = new ArrayList<Edge>(notUsedE.size());
            result.add(notUsedE.get(minE));
            notUsedE.remove(minE);
        }
        return result;
    }
}
