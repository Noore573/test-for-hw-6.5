import java.util.*;

public class BFS4 {
    int initialboard[][];

    public BFS4(int[][] initialboard) {
        this.initialboard = initialboard;
    }

    public boolean isEqual2(GameBoard4 board1, Set<GameBoard4> board2) {
        int[][] array1 = board1.board;

        for (GameBoard4 board : board2) {
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

    public GameBoard4 BFS4algo(GameBoard4 board) {
        Queue<GameBoard4> queue = new LinkedList<>();
        Set<GameBoard4> visited = new HashSet<>();
        queue.add(board);
        visited.add(board);
        int count = 0;
        while (!queue.isEmpty() && count < 10000) {
            count++;
            GameBoard4 currentState = queue.poll();
            System.out.println();
            currentState.printstate(currentState.board);
            System.out.println();
            System.out.print("(( ");
            for (int index = 0; index < currentState.balls.length; index++) {
                System.out.print(currentState.balls[index][0] + " " + currentState.balls[index][1]);
            }
            System.out.print(" ))");
            System.out.println();
            // System.out.println();
            if (currentState.isfinal2() == true) {
                System.out.println("Done");
                currentState.printstate(currentState.board);
                System.out.println("Count:" + count);
                return currentState;
            } else {
                List<GameBoard4> nextStates = currentState.GetNextState();

                for (GameBoard4 nextState : nextStates) {
                    if (!isEqual2(nextState, visited)) {
                        visited.add(nextState);
                        queue.add(nextState);
                    }
                }
            }
        }
        System.out.println("Count:" + count);
        return new GameBoard4();
    }
}
