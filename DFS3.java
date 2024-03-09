import java.util.*;

public class DFS3 {
    int initialboard[][];

    public DFS3(int[][] initialboard) {
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
    
    public GameBoard3 DFS3algo(GameBoard3 board) {
        Stack<GameBoard3> stack = new Stack<>(); 
        Set<GameBoard3> visited = new HashSet<>();
        stack.push(board); 
        visited.add(board);
        int count = 0;
        while (!stack.isEmpty()) {
            count++;
            GameBoard3 currentState = stack.pop();
            System.out.println();
            currentState.printstate(currentState.board);
            System.out.println();
            if (currentState.isfinal2()) { 
                System.out.println("Done");
                currentState.printstate(currentState.board);
                break; 
            } else {
                List<GameBoard3> nextStates = currentState.GetNextState();
                for (GameBoard3 nextState : nextStates) {
                    if (!isEqual2(nextState, visited)) {
                        visited.add(nextState);
                        stack.push(nextState);
                    }
                }
            }
        }
        System.out.println("Count:" + count);
        return new GameBoard3(); 
    }
}
