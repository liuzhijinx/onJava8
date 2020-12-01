package graph.dataStructure;

import java.util.List;

public class Vertex {

    public String identification;

    public List<Vertex> adjacentList;

    public double distanceFromStart;

    public boolean known;

    public Vertex fromPath;
}
