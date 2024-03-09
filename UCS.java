import java.util.*;

public class UCS {

    public boolean isEqual2(Node node1, Set<Node> nodes2) {
        GameBoard3 board1 = node1.state;
        int cost1 = node1.cost;

        for (Node node2 : nodes2) {
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

    public int ucs(int[][] graph, GameBoard3 start) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        Set<Node> visited = new HashSet<>();
        Node startNode = new Node(start, 0, null);
        priorityQueue.add(startNode);
        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();

            GameBoard3 currentState = currentNode.state;
            if (!isEqual2(currentNode, visited)) {
                visited.add(currentNode);
                // System.out.println(currentState.board[0].length - 2);

                if (currentState.ballj == currentState.board[0].length - 2) {
                currentNode.cost -= 5;
                }
                if (currentState.ballj == 1) {
                currentNode.cost -= 10;
                }
                if (currentState.balli == 1) {
                currentNode.cost -= 10;
                }
                if (currentState.isfinal2()) {
                    System.out.println("Done");
                    currentState.printstate(currentState.board);
                    System.out.println("______________");
                    printPath(currentNode);
                    System.out.println("______________");
                    return currentNode.cost;

                }

                List<Node> nextNodes = currentState.GetNextNode(currentNode);
                // currentState.printstate(currentState.board);

                for (Node nextNode : nextNodes) {
                    if (!isEqual2(nextNode, visited)) {
                        int newCost = currentNode.cost + nextNode.cost;
                        Node newNode = new Node(nextNode.state, newCost, currentNode);
                        priorityQueue.add(newNode);
                    }
                }
            }
        }
        return -1;
    }

    private void printPath(Node node) {
        List<GameBoard3> path = new ArrayList<>();
        while (node != null) {
            path.add(node.state);
            node = node.parent;
        }

        // System.out.println("Path:");
        System.out.println(path.size());
        for (int i = path.size() - 1; i >= 0; i--) {
            path.get(i).printstate(path.get(i).board);
            System.out.println();
        }
    }

}
