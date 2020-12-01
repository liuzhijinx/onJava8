package graph.algorithm;

import graph.dataStructure.Vertex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathProblem {

    private List<Vertex> vertexList = new ArrayList<>();

    // breadth-first search for unweighted shortest path problem
    public void unweighted(Vertex start) {
        Queue<Vertex> q = new LinkedList<>();

        for (Vertex vertex : vertexList) {
            vertex.distanceFromStart = Double.POSITIVE_INFINITY;
        }
        start.distanceFromStart = 0;
        q.add(start);

        while (!q.isEmpty()) {
            Vertex v = q.poll();
            for (Vertex w : v.adjacentList) {
                if (w.distanceFromStart == Double.POSITIVE_INFINITY) {
                    w.distanceFromStart = v.distanceFromStart + 1;
                    w.fromPath = v;
                    q.add(w);
                }
            }
        }
    }

    void printPath(Vertex v) {
        if (v.fromPath != null) {
            printPath(v.fromPath);
            System.out.println(" to ");
        }
        System.out.println(v.identification);
    }

    void dijkstra(Vertex start) {
        for (Vertex v : vertexList) {
            v.distanceFromStart = Double.POSITIVE_INFINITY;
            v.known = false;
        }

        start.distanceFromStart = 0;

        while (unknownVertexExisted()) {
            Vertex v = findSmallest();
            v.known = true;
            for (Vertex w : v.adjacentList) {
                if (!w.known) {
                    double dist = getDist();
                    if (v.distanceFromStart + dist < w.distanceFromStart) {
                        w.distanceFromStart = v.distanceFromStart + dist;
                        w.fromPath = v;
                    }
                }
            }
        }
    }

    boolean unknownVertexExisted() {
        return false;
    }

    Vertex findSmallest() {
        return null;
    }

    double getDist() {
        return 0;
    }

}
