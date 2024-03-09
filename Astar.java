import java.util.*;

public class Astar {
    public boolean isEqual2(Node2 node1, Set<Node2> nodes2) {
        GameBoard3 board1 = node1.state;
        int cost1 = node1.cost;

        for (Node2 node2 : nodes2) {
            GameBoard3 board2 = node2.state;
            int cost2 = node2.cost;

            if (isEqualBoard(board1, board2) && cost1 == cost2) {
                return true;
            }
        }

        return false;
    }

    public boolean isEqualBoard(GameBoard3 board1, GameBoard3 board2) {
        int[][] array1 = board1.board;
        int[][] array2 = board2.board;

        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    public int Astar(int[][] graph, GameBoard3 start) {
        PriorityQueue<Node2> priorityQueue = new PriorityQueue<>();
        Set<Node2> visited = new HashSet<>();
        
        Node2 startNode = new Node2(start, null, 0,0,100);
        priorityQueue.add(startNode);
        while (!priorityQueue.isEmpty()) {
            Node2 currentNode = priorityQueue.poll();

            GameBoard3 currentState = currentNode.state;
            if (!isEqual2(currentNode, visited)) {
                visited.add(currentNode);
                System.out.println(currentState.board[0].length - 2);

                if (currentState.isfinal2()) {
                    System.out.println("Done");
                    currentState.printstate(currentState.board);
                    System.out.println("______________");
                    // printPath(currentNode);
                    System.out.println("______________");
                    return currentNode.f;
                }
                List<Node2> nextNodes = currentState.GetNextNode2(currentNode);

                for (Node2 nextNode : nextNodes) {
                    if (!isEqual2(nextNode, visited)) {
                        // int newCost = currentNode.cofst + nextNode.cost;
                        int h=nextNode.h;
                        int g=nextNode.cost;
                        int f=h+g;
                        int newCost = currentNode.cost + nextNode.cost;
                        Node2 newNode = new Node2(nextNode.state,  currentNode,h,f,newCost);
                        priorityQueue.add(newNode);
                    }
                }
            }
        }
        return -1;
    }
    public int calh(int balli,int ballj,int basketi,int basketj){
        int h=0;
        int h1=0;int h2=0;
            h1=(ballj-basketj);
            if(h1<0)
                h1=h1*(-1);
            h2=(balli-basketi);
            if(h2<0)
                h2=h2*(-1);
        return h=h1+h2;
    }

}
