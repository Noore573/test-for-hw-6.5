import java.util.*;

public class BFS3 {
    int initialboard[][];

    public BFS3(int[][] initialboard) {
        this.initialboard = initialboard;
    }



    public boolean isEqual2(GameBoard3 board1, Set<GameBoard3> board2) {
        int[][] array1 = board1.board;

        for (GameBoard3 board : board2) {
            int[][] array2 = board.board;

            if (array1.length != array2.length || array1[0].length != array2[0].length) {
                continue;
            }

            boolean isEqual = true;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    if (array1[i][j] != array2[i][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (!isEqual) {
                    break;
                }
            }
            if (isEqual) {
                return true;
            }
        }

        return false;
    }

    public GameBoard3 BFS3algo(GameBoard3 board) {
        Queue<GameBoard3> queue = new LinkedList<>();
        Set<GameBoard3> visited = new HashSet<>();
        queue.add(board);
        visited.add(board);
        int count = 0;
        while (!queue.isEmpty() && count < 150) {
            count++;
            GameBoard3 currentState = queue.poll();
            System.out.println();
            currentState.printstate(currentState.board);
            // System.out.println();
            if (currentState.isfinal2() == true) {
                System.out.println("Done");
                currentState.printstate(currentState.board);
            } else {
                List<GameBoard3> nextStates = currentState.GetNextState();
                for (GameBoard3 nextState : nextStates) {
                    if (!isEqual2(nextState, visited)) {
                        visited.add(nextState);
                        queue.add(nextState);
                    }
                }
            }
        }
        System.out.println("Count:" + count);
        return new GameBoard3();
    }
}
