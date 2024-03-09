public  class Node2  {
    GameBoard3 state;
    Node2 parent;
    int f;
    int h;
    int cost;
    public Node2(GameBoard3 state, Node2 parent, int h,int f,int cost) {
        this.state = state;
        this.parent = parent;
        this.h = h;
        this.f=f;
        this.cost=cost;
    }

    

   
}