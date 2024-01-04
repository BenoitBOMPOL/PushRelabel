package Graphs;

public class Arc {
    private int tail;
    private int head;

    public Arc(int tail, int head) {
        this.tail = tail;
        this.head = head;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return this.tail + " --> " + this.tail;
    }
}
