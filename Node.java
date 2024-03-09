public  class Node implements Comparable<Node> {
    GameBoard3 state;
    GameBoard4 state2;

    public Node(GameBoard4 state2, int cost, Node parent) {
        this.state2 = state2;
        this.cost = cost;
        this.parent = parent;
    }

    int cost;
    Node parent;

    public Node(GameBoard3 state, int cost, Node parent) {
        this.state = state;
        this.cost = cost;
        this.parent = parent;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.cost, other.cost);
    }
   
}