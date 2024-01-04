package Graphs;

import java.util.HashSet;

public class Digraph {
    private HashSet<Integer> vertices;
    private HashSet<Arc> arcs;

    public Digraph() {
        vertices = new HashSet<Integer>();
        arcs = new HashSet<Arc>();
    }

    public void add_arc(int head, int tail){
        vertices.add(head);
        vertices.add(tail);
        arcs.add(new Arc(tail, head));
    }

    @Override
    public String toString() {
        StringBuilder base = new StringBuilder("Vertices : " + vertices.toString() + "\n");
        for (Arc a : arcs){
            base.append("\t").append(a.toString()).append("\n");
        }
        return base.toString();
    }

    public static void main(String[] args) {
        Digraph d = new Digraph();
        d.add_arc(0, 1);
        d.add_arc(0, 2);
        d.add_arc(0, 4);
        d.add_arc(1, 3);
        d.add_arc(1, 5);
        d.add_arc(2, 1);
        d.add_arc(2, 4);
        d.add_arc(3, 5);
        d.add_arc(4, 1);
        d.add_arc(4, 3);
        d.add_arc(4, 5);
        System.out.println(d);


    }
}
