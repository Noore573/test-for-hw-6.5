import java.util.*;

import javax.swing.text.Position;

public class GameBoard2 {
    int[][] board;
    int balli;
    int ballj;
    int basketi;
    int basketj;
    int x = 0;
    String destintion;
    // int[] nob = new int[10];
    int nob;
    // int[] bandbpos = new int[4];

    // List<Ball> balls;
    int[][] balls=new int[nob][2];

    public GameBoard2() {
    }

    public GameBoard2(int[][] board, int balli, int ballj, int basketi, int basketj, int nob) {
        this.board = board;
        this.balli = balli;
        this.ballj = ballj;
        this.basketi = basketi;
        this.basketj = basketj;

        this.nob = nob;
        // bandbpos[0] = balli;
        // bandbpos[1] = ballj;
        // bandbpos[2] = basketi;
        // bandbpos[3] = basketj;

        // System.out.println("***1*");

        // System.out.println(basketi);
        // System.out.println(basketj);
        // System.out.println("***1*");
    }

    //

    public GameBoard2(int[][] board, int nob, int[][] balls, int basketi, int basketj) {
        this.board = board;
        this.nob = nob;
        this.balls = balls;

        this.basketi = basketi;
        this.basketj = basketj;
    }

    public static void printstate(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isfinal2() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2)

                    return false;
            }
        }
        return true;
    }

    // public boolean isfinal() {
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board[0].length; j++) {
    //             if (board[balli][ballj] == board[basketi - 1][basketj]) {
    //                 // nob--;

    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public boolean isfinal  (int balli,int ballj,int basketi,int basketj) {
        if (board[balli][ballj] == board[basketi - 1][basketj]) {
            return true;
        }
        return false;
    }

    public boolean validmove(int balli2, int ballj2, String dest) {
        switch (dest) {
            case "right":
                if (board[balli2][ballj2 + 1] != 1 && board[balli2][ballj2 + 1] != 3)
                    return true;
                break;
            case "left":
                if (board[balli2][ballj2 - 1] != 1 && board[balli2][ballj2 + 1] != 3)
                    return true;
                break;
            case "up":
                if (board[balli2 - 1][ballj2] != 1 && board[balli2][ballj2 + 1] != 3)
                    return true;
                break;
            case "bottom":
                if (board[balli2 + 1][ballj2] != 1 && board[balli2][ballj2 + 1] != 3)
                    return true;
                break;
        }
        return false;
    }

    // public boolean validmove(int [][]balls, String dest) {
    // for (int i = 0; i < balls.length; i++) {
    // for (int j = 0; j < balls[0].length; j++) {
    // switch (dest) {

    // case "right":
    // if (board[balls[i][j]][balls[i][j+1]+ 1] != 1 &&
    // board[balls[i][j]][balls[i][j] + 1] != 3)
    // return true;
    // break;
    // case "left":
    // if (board[balls[i][j]][balls[i][j+1] - 1] != 1 &&
    // board[balls[i][j]][balls[i][j+1] + 1] != 3)
    // return true;
    // break;
    // case "up":
    // if (board[balls[i][j] - 1][balls[i][j+1]] != 1 &&
    // board[balls[i][j]][balls[i][j]+1 + 1] != 3)
    // return true;
    // break;
    // case "bottom":
    // if (board[balls[i][j] + 1][balls[i][j+1]] != 1 &&
    // board[balls[i][j]][balls[i][j+1] + 1] != 3)
    // return true;
    // break;
    // }
    // }

    // }

    // return false;
    // }

    public void move(Pos newpos, int[][] balls) {
        // System.out.println("*******************************");
        // System.out.print(newpos.ballsxys[0][0] + " ##### " + newpos.ballsxys[0][1]+"
        // &&& " + newpos.ballsxys[1][0]+" &&& " + newpos.ballsxys[1][1]);
        // System.out.println("*******************************");
        // for (int i = 0; i < newpos.ballsxys.length; i++) {
        //     for (int j = 0; j < 1; j++) {
        //         // moving the ball
        //         // System.out.print(newpos.ballsxys[i][j] + " ##### " + newpos.ballsxys[i][j+1]);
        //         System.out.println(newpos.ballsxys.length+" #");
                
        //         board[balls[i][j]][balls[i][j + 1]] = 0;
        //         board[newpos.ballsxys[i][j]][newpos.ballsxys[i][j + 1]] = 2;
        //         balli = newpos.ballsxys[i][j];
        //         ballj = newpos.ballsxys[i][j + 1];
        //     }

        // }

        // System.out.println(newpos.x + "--" + newpos.y + "--" + newpos.i + "--" +
        // newpos.j + "--");
        // System.out.println("?? "+basketi+" ?? "+basketj);
        board[balli][ballj] = 0;
        board[newpos.x][newpos.y] = 2;
        balli = newpos.x;
        ballj = newpos.y;
        // moving the basket
        board[basketi][basketj] = 0;
        board[newpos.i][newpos.j] = 3;
        basketi = newpos.i;
        basketj = newpos.j;
        
    }

    // GameBoard2 CopyBoard(){

    // GameBoard2 cgb=new GameBoard2();
    // cgb.balli=this.balli;
    // cgb.ballj=this.ballj;
    // for (int i = 0; i < board.length; i++)
    // for (int j = 0; j < board[0].length; j++)
    // cgb.board[i][j]=this.board[i][j];
    // return cgb;
    // }
    // try
    public int[] checkmove3(int balli3, int ballj3, String dist) {
       
        int[] newballpos = new int[2];
        // for (int i = 0; i < balls.length; i++) {
        // for (int j = 0; j < 1; j++) {
        // if (validmove(balli3, ballj3, dist)) {
        if (dist == "bottom") {
            // System.out.println("uo");
        if (isfinal(balli3,ballj3,basketi,basketj)) {
            
        board[balli3][ballj3] = 0;
        newballpos[0] = balli3;
        newballpos[1] = ballj3;
        // nob--;
        return newballpos;
        }

         else if (board[balli3+ 1][ballj3] == 1|board[balli3 + 1][ballj3] == 2) {
                
        newballpos[0] = balli3;
        newballpos[1] = ballj3;
        System.out.println(newballpos[0] + " ,,," + newballpos[1]+" dist:"+dist);

        // System.out.println(newballpos[0] + " ^^^" + newballpos[1]);
        return newballpos;
        }
        // System.out.println(balli3+" **** "+ballj3);
        return checkmove3(balli3 + 1, ballj3, dist);
        }
        if (dist == "up") {
            // System.out.println();
            // System.out.println(balli3+" **#** "+ballj3);
            // System.out.println();
        if (board[balli3 - 1][ballj3] == 1||board[balli3 - 1][ballj3] == 2||board[balli3 - 1][ballj3] == 3) {
        newballpos[0] = balli3;
        newballpos[1] = ballj3;

        return newballpos;
        }
        return checkmove3(balli3 - 1, ballj3, dist);
        }
        if (dist == "right") {

            if (board[balli3][ballj3 + 1] == 1 || board[balli3][ballj3 + 1] == 3||board[balli3][ballj3 + 1] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                // System.out.println(newballpos[0] + " ^^^" + newballpos[1]);

                return newballpos;
            }
            return checkmove3(balli3, ballj3 + 1, dist);
        }
    
        if (dist == "left") {
        if (board[balli3][ballj3 - 1] == 1||board[balli3][ballj3 - 1] == 2||board[balli3][ballj3 - 1] == 3) {
        newballpos[0] = balli3;
        newballpos[1] = ballj3;
        return newballpos;
        }
        return checkmove3(balli3, ballj3 - 1, dist);
        }
        
        // }
        // }

        return newballpos;
    }

    public int[] checkmovebaskey3(int basketi3, int basketj3, String dist) {
        int[] newbasketpos = new int[2];
        if (dist == "bottom") {
            if (board[basketi3 + 1][basketj3] == 1||board[basketi3 + 1][basketj3] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3; 
                // System.out.println(basketi3+" () "+basketj3+" () "+dist);

                return newbasketpos;
            }
            return checkmovebaskey3(basketi3 + 1, basketj3, dist);
        }
        if (dist == "up") {
            if (board[basketi3 - 1][basketj3] == 1||board[basketi3 - 1][basketj3] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3 - 1, basketj3, dist);
        }
        if (dist == "right") {
            if (board[basketi3][basketj3 + 1] == 1||board[basketi3][basketj3 + 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 + 1, dist);
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1||board[basketi3][basketj3 - 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                System.out.println(newbasketpos[1]+"<<<<");
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 - 1, dist);
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1||board[basketi3][basketj3 - 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 - 1, dist);
        }
        

        return newbasketpos;
    }

    List<Pos> moves2() {
        // for (int i = 0; i < balls.length; i++) {
        // for (int j = 0; j < balls[0].length; j++) {
        // }

        // }
        System.out.println();

        List<Pos> availablemoves = new LinkedList<>();
        // for (int i = 0; i < nob; i++) {
        // for (int j = 0; j < 1; j++) {
        // int balli=balls[i][0];int ballj=balls[i][1];

        // down
        // if (validmove(balls, "bottom") || validmove(basketi, basketj, "bottom")) {
        // Pos movebottom=checkmove3(balli, ballj,"bottom");
        // System.out.println("((((----"+balls[0][1]+")))))))");
        for (int index = 0; index < nob; index++) {
            for (int i = 0; i < 1; i++) {
            // System.out.println(balls[index][i]+"--"+balls[index][i+1]);
                
            }
            
        }
        Pos movebottom = moveall(balls, basketi, basketj, "bottom");
        availablemoves.add(movebottom);
        // }
        // if (validmove(balls ,"right") || validmove(basketi, basketj, "right")) {
        // Pos moveright=checkmove3(balls"right");

        Pos moveright = moveall(balls, basketi, basketj, "right");
        // System.out.println();
        // for (int i = 0; i < moveright.ballsxys.length; i++) {
        // for (int j = 0; j < 1; j++) {
        // System.out.print(moveright.ballsxys[i][j] + " <> " +
        // moveright.ballsxys[i][j+1]);

        // }
        // }
        // System.out.println();
        availablemoves.add(moveright);
        // }
        // if (validmove(balls, "left") || validmove(basketi, basketj, "left")) {
        // Pos moveright=checkmove3(balls"left");
        Pos moveleft = moveall(balls, basketi, basketj, "left");
        // Pos moveright=checkmovebaskey3(basketi , basketj, "left");
        // System.out.println(moveright.x+"--"+moveright.y+"--"+moveright.i+"--"+moveright.j+"--");
        availablemoves.add(moveleft);
        // }
        // if (validmove(balls, "up") || validmove(basketi, basketj, "up")) {
        // Pos moveright=checkmove3(balls"up");
        Pos moveup = moveall(balls, basketi, basketj, "up");
        // Pos moveup2=moveall(moveup.ballsxys, basketi, basketj, "up");
        availablemoves.add(moveup);
        // }

        // }
        // }
        return availablemoves;

    }

    // public Pos moveall(int balli, int ballj, int basketi, int basketj, String
    // dist) {

    // int[] ballpos = new int[2];
    // ballpos[0] = balli;
    // ballpos[1] = ballj;

    // ballpos = checkmove3(balli, ballj, dist);
    // int[] basketpos = new int[2];
    // basketpos[0] = basketi;
    // basketpos[1] = basketj;
    // basketpos = checkmovebaskey3(basketi, basketj, dist);
    // // System.out.println("<<<" + ballpos[0] + "" + ballpos[1] + "" +
    // basketpos[0] +
    // // "" + basketpos[0] + ">>>");
    // Pos pnew = new Pos(ballpos[0], ballpos[1], basketpos[0], basketpos[1]);
    // return pnew;
    // }
    public Pos moveall(int[][] balls, int basketi, int basketj, String dist) {
        int[][] newballpos = new int[nob][2];
        int[] basketpos = new int[2];
        for (int i = 0; i < balls.length; i++) {
            for (int j = 0; j < 1; j++) {

                int[] ballpos;
                // ballpos[i][j] = balls[i][j];
                // ballpos[i][j] = balls[i][j+1];

                // ballpos = checkmove3(balli, ballj, dist);

                ballpos  = checkmove3(balls[i][j], balls[i][j + 1], dist);
                // ballpos=checkmove3(ballpos1[0], ballpos1[1], dist);

                // System.out.println(ballpos[0] + "-" + ballpos[1]+" > "+i+" ><"+dist);
                newballpos[i][j] = ballpos[0];
                newballpos[i][j + 1] = ballpos[1];
                // System.out.println("*******************************");
                // System.out.print(newballpos[i][j] + "&&&&&&&" + newballpos[i][j+1]);
                // System.out.println("*******************************");

                // System.out.println("<<<" + ballpos[0] + "" + ballpos[1] + "" + basketpos[0] +
                // "" + basketpos[0] + ">>>");
                // System.out.print(newballpos[i][j]+"-");
            }

        }
        System.out.println();
        basketpos[0] = basketi;
        basketpos[1] = basketj;
        // System.out.println(basketi+" %%% "+basketj+" %%% "+basketpos[0]+" %%% "+basketpos[1]+" %%% ");
        basketpos = checkmovebaskey3(basketi, basketj, dist);
        // System.out.println("*******************************");
        // System.out.print(newballpos[0][0] + " &&& " + newballpos[0][1]+" &&& " +
        // newballpos[1][0]+" &&& " + newballpos[1][1]);
        // System.out.println(basketi+" () "+basketj+" () "+basketpos[0]+" () "+basketpos[1]+" () ");
        // System.out.println("*******************************");
        Pos pnew = new Pos(newballpos, basketpos[0], basketpos[1]);
        return pnew;
    }

    GameBoard2 CopyBoard() {

        GameBoard2 cgb = new GameBoard2();
        cgb.balli = this.balli;
        cgb.ballj = this.ballj;

        cgb.basketi = this.basketi;
        cgb.basketj = this.basketj;

        cgb.board = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                cgb.board[i][j] = this.board[i][j];
            }
        }
        return cgb;
    }

    List<GameBoard2> GetNextState() {
        // System.out.println("&&&&&" + balli + "" + ballj + "" + basketi + "" + basketj
        // + "&&&&");
        List<GameBoard2> boardstate = new LinkedList<>();

        // List<Pos> nextmove = CheckMove();
        // List<Pos> nextmove = CheckMove2(balli,ballj,basketi,basketj);

        List<Pos> nextmove = moves2();

        for (Pos i : nextmove) {
            GameBoard2 gbs = CopyBoard();

            // gbs.move(i, basketi, basketj);
            gbs.move(i, balls);
            boardstate.add(gbs);
        }
        // System.out.println("size=:" + boardstate.size());

        printboardstate(boardstate);

        return boardstate;
    }

    public void printboardstate(List<GameBoard2> states) {
        // x++;
        // System.out.println("X:" + x);
        for (GameBoard2 state : states) {
            int[][] boardstate = state.board;
            int[] posi = new int[] { state.balli, state.ballj, state.basketi, state.basketj };

            // Print the board array
            for (int i = 0; i < boardstate.length; i++) {
                for (int j = 0; j < boardstate[0].length; j++) {
                    System.out.print(boardstate[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println(); // Add a new line between each board
            // for (int i = 0; i < posi.length; i++) {
            // System.out.print(posi[i]+"<---");
            // System.out.println();
            // }
        }

    }

}