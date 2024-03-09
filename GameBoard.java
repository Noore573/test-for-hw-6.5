import java.util.*;

import javax.swing.text.Position;

public class GameBoard {
    int[][] board;
    int balli;
    int ballj;
    int basketi;
    int basketj;
    int coini;
    int coinj;

    int x = 0;
    String destintion;
    // int[] nob = new int[10];
    int nob;
    int[] bandbpos = new int[4];

    public GameBoard() {
    }
    

    public GameBoard(int[][] board, int balli, int ballj, int basketi, int basketj, int nob) {
        this.board = board;
        this.balli = balli;
        this.ballj = ballj;
        this.basketi = basketi;
        this.basketj = basketj;

        this.nob = nob;
        bandbpos[0] = balli;
        bandbpos[1] = ballj;
        bandbpos[2] = basketi;
        bandbpos[3] = basketj;

        // System.out.println("***1*");

        // System.out.println(basketi);
        // System.out.println(basketj);
        // System.out.println("***1*");
    }
    public GameBoard(int[][] board, int balli, int ballj, int basketi, int basketj, int nob,int coini,int coinj) {
        this.board = board;
        this.balli = balli;
        this.ballj = ballj;
        this.basketi = basketi;
        this.basketj = basketj;
        this.coini=coini;
        this.coinj=coinj;
        this.nob = nob;
        bandbpos[0] = balli;
        bandbpos[1] = ballj;
        bandbpos[2] = basketi;
        bandbpos[3] = basketj;

        // System.out.println("***1*");

        // System.out.println(basketi);
        // System.out.println(basketj);
        // System.out.println("***1*");
    }

    //

    public static void printstate(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public boolean isfinal2(String dist) {
    // if (board[balli][ballj] == board[basketi -
    // 1][basketj]&&(dist=="up"||dist=="bottom")) {
    // System.out.println("You did it!");
    // printstate(board);
    // return true;
    // } else {
    // return false;
    // }
    // }
    public boolean isfinal2() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2)

                    return false;
            }
        }
        return true;
    }

    public boolean isfinal() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[balli][ballj] == board[basketi - 1][basketj]) {
                    // nob--;

                    return true;
                }
            }
        }
        return false;
    }
    public boolean isfinalcoin() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[coini][coinj] == board[basketi - 1][basketj]) {
                    // nob--;

                    return true;
                }
            }
        }
        return false;
    }

    // List<Pos> CheckMove() {

    //     List<Pos> availablemoves = new LinkedList<>();
    //     // ball
    //     // up
    //     if (board[balli - 1][ballj] == 0) {
    //         availablemoves.add(new Pos(balli - 1, ballj, basketi, basketj));
    //     }
    //     // bottom
    //     if (board[balli + 1][ballj] == 0) {
    //         availablemoves.add(new Pos(balli + 1, ballj, basketi, basketj));
    //     }
    //     // right
    //     if (board[balli][ballj + 1] == 0) {
    //         availablemoves.add(new Pos(balli, ballj + 1, basketi, basketj));
    //     }
    //     // left
    //     if (board[balli][ballj - 1] == 0) {
    //         availablemoves.add(new Pos(balli, ballj - 1, basketi, basketj));
    //     }

    //     // basket
    //     // up
    //     if (board[basketi - 1][basketj] == 0) {
    //         availablemoves.add(new Pos(balli, ballj, basketi - 1, basketj));
    //     }
    //     // bottom
    //     if (board[basketi + 1][basketj] == 0) {
    //         availablemoves.add(new Pos(balli, ballj, basketi + 1, basketj));
    //     }
    //     // right
    //     if (board[basketi][basketj + 1] == 0) {
    //         availablemoves.add(new Pos(balli, ballj, basketi, basketj + 1));
    //     }
    //     // left
    //     if (board[basketi][basketj - 1] == 0) {
    //         availablemoves.add(new Pos(balli, ballj, basketi, basketj - 1));
    //     }
    //     return availablemoves;
    // }

    // List<Pos> CheckMove2(int balli1, int ballj1, int basketi1, int basketj1) {

    //     List<Pos> availablemoves = new LinkedList<>();
    //     // ball
    //     // up
    //     if (validmove(balli1, ballj1, "up")) {
    //         while (validmove(balli1, ballj1, "up")) {
    //             if (validmove(balli1 - 1, ballj1, "up") == false) {
    //                 availablemoves.add(new Pos(balli - 1, ballj1, basketi, basketj));
    //             }
    //             balli1--;
    //         }
    //     }
    //     // bottom
    //     if (validmove(balli1, ballj1, "bottom")) {
    //         while (validmove(balli1, ballj1, "bottom")) {
    //             if (validmove(balli1 + 1, ballj1, "bottom") == false) {
    //                 availablemoves.add(new Pos(balli + 1, ballj1, basketi, basketj));
    //             }
    //             balli1++;
    //         }
    //     }
    //     // right
    //     if (validmove(balli1, ballj1, "right")) {
    //         while (validmove(balli1, ballj1, "right")) {
    //             if (validmove(balli1, ballj1 + 1, "right") == false) {

    //                 availablemoves.add(new Pos(balli, ballj1 + 1, basketi, basketj));
    //             }
    //             ballj1++;
    //         }
    //     }

    //     // left
    //     if (validmove(balli1, ballj1, "left")) {
    //         while (validmove(balli1, ballj1, "left")) {

    //             if (validmove(balli1, ballj1 - 1, "left") == false) {

    //                 availablemoves.add(new Pos(balli, ballj1 - 1, basketi, basketj));
    //             }
    //             ballj1--;
    //             System.out.println("++++++++++++++++++++++");

    //             // System.out.println(ballj1);

    //         }
    //     }
    //     // basket

    //     // up
    //     if (validmove2(basketi, basketj, "up")) {
    //         while (validmove2(basketi1, basketj1, "up")) {

    //             if (validmove2(basketi1 - 1, basketj1, "up") == false) {

    //                 availablemoves.add(new Pos(balli, ballj, basketi1 - 1, basketj));
    //             }
    //             basketi1--;
    //         }
    //     }

    //     // bottom
    //     if (validmove2(basketi, basketj, "bottom")) {
    //         while (validmove2(basketi1, basketj1, "bottom")) {

    //             if (validmove2(basketi1 + 1, basketj1, "bottom") == false) {

    //                 availablemoves.add(new Pos(balli, ballj, basketi1 + 1, basketj));
    //             }
    //             basketi1++;
    //         }
    //     }
    //     // right
    //     if (validmove2(basketi, basketj, "right")) {
    //         while (validmove2(basketi1, basketj1, "right")) {

    //             if (validmove2(basketi1, basketj1 + 1, "right") == false) {

    //                 availablemoves.add(new Pos(balli, ballj, basketi, basketj1 + 1));
    //             }
    //             basketj1++;
    //         }
    //     }
    //     // left
    //     if (validmove2(basketi, basketj, "left")) {
    //         while (validmove2(basketi1, basketj1, "left")) {

    //             if (validmove2(basketi1, basketj1 - 1, "left") == false) {
    //                 availablemoves.add(new Pos(balli, ballj, basketi, basketj1 - 1));
    //             }
    //             basketj1--;
    //         }
    //     }

    //     return availablemoves;
    // }

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

    public boolean validmove2(int basketi2, int basketj2, String dest) {

        switch (dest) {
            case "right":
                if (board[basketi2][basketj2 + 1] != 1 && board[basketi2][basketj2 + 1] != 2)
                    return true;
                break;
            case "left":
                // System.out.println("++");
                // System.out.println(basketi2);
                // System.out.println(basketj2);
                if (board[basketi2][basketj2 - 1] != 1 && board[basketi2][basketi2 + 1] != 2) {

                    System.out.println("tt");
                    return true;
                }
                break;
            case "up":
                if (board[basketi2 - 1][basketj2] != 1)
                    return true;
                break;
            case "bottom":
                if (board[basketi2 + 1][basketj2] != 1)
                    return true;
                break;
        }
        return false;
    }

    public void move(Pos newpos) {
        // System.out.println(newpos.x + "--" + newpos.y + "--" + newpos.i + "--" +
        // newpos.j + "--");
        // System.out.println("?? "+basketi+" ?? "+basketj);
        // moving the ball
        board[balli][ballj] = 0;
        board[newpos.x][newpos.y] = 2;
        balli = newpos.x;
        ballj = newpos.y;
        //moving the coin
        board[coini][coinj] = 0;
        board[newpos.ci][newpos.cj] = 4;
        coini = newpos.ci;
        coinj = newpos.cj;
        // moving the basket
        board[basketi][basketj] = 0;
        board[newpos.i][newpos.j] = 3;
        basketi = newpos.i;
        basketj = newpos.j;
    }

    // GameBoard CopyBoard(){

    // GameBoard cgb=new GameBoard();
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
        if (dist == "bottom") {
            if (isfinal()) {
                board[balli3][ballj3] = 0;
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                // nob--;
                return newballpos;
            } else if (board[balli3 + 1][ballj3] == 1||board[balli3 + 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3(balli3 + 1, ballj3, dist);
        }
        if (dist == "up") {
            if (board[balli3 - 1][ballj3] == 1||board[balli3 - 1][ballj3] == 3||board[balli3 - 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;

                return newballpos;
            }
            return checkmove3(balli3 - 1, ballj3, dist);
        }
        if (dist == "right") {
            if (board[balli3][ballj3 + 1] == 1||board[balli3][ballj3 + 1] == 3||board[balli3][ballj3 + 1] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
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

        return newballpos;
    }

    public int[] checkmovebaskey3(int basketi3, int basketj3, String dist) {
        int[] newbasketpos = new int[2];
        if (dist == "bottom") {
            if (board[basketi3 + 1][basketj3] == 1||board[basketi3 + 1][basketj3] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3 + 1, basketj3, dist);
        }
        if (dist == "up") {
            if (board[basketi3 - 1][basketj3] == 1) {
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
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 - 1, dist);
        }

        return newbasketpos;
    }
    public int[] checkmove3coin(int balli3, int ballj3, String dist) {
        int[] newballpos = new int[2];
        if (dist == "bottom") {
            if (isfinalcoin()) {
                board[balli3][ballj3] = 0;
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                // nob--;
                return newballpos;
            } else if (board[balli3 + 1][ballj3] == 1||board[balli3 + 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3coin(balli3 + 1, ballj3, dist);
        }
        if (dist == "up") {
            if (board[balli3 - 1][ballj3] == 1||board[balli3 - 1][ballj3] == 3||board[balli3 - 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;

                return newballpos;
            }
            return checkmove3coin(balli3 - 1, ballj3, dist);
        }
        if (dist == "right") {
            if (board[balli3][ballj3 + 1] == 1||board[balli3][ballj3 + 1] == 3||board[balli3][ballj3 + 1] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3coin(balli3, ballj3 + 1, dist);
        }
        if (dist == "left") {
            if (board[balli3][ballj3 - 1] == 1||board[balli3][ballj3 - 1] == 2||board[balli3][ballj3 - 1] == 3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3coin(balli3, ballj3 - 1, dist);
        }

        return newballpos;
    }


    List<Pos> moves2() {
        // int balli=gb.balli;int ballj=gb.ballj;
        // int basketi=gb.basketi;int basketj=gb.basketj;

        List<Pos> availablemoves = new LinkedList<>();
        // down

        if (validmove(balli, ballj, "bottom") || validmove(basketi, basketj, "bottom")||validmove(coini, coinj, "bottom")) {
            // Pos movebottom=checkmove3(balli, ballj,"bottom");
            Pos movebottom = moveall(balli, ballj, basketi, basketj,coini,coinj, "bottom");
            availablemoves.add(movebottom);
        }
        if (validmove(balli, ballj, "right") || validmove(basketi, basketj, "right")||validmove(coini, coinj, "right")) {
            // Pos moveright=checkmove3(balli, ballj,"right");
            Pos moveright = moveall(balli, ballj, basketi, basketj,coini,coinj, "right");
            availablemoves.add(moveright);
        }
        if (validmove(balli, ballj, "left") || validmove(basketi, basketj, "left")||validmove(coini, coinj, "left")) {
            // Pos moveright=checkmove3(balli, ballj,"left");
            Pos moveright = moveall(balli, ballj, basketi, basketj,coini,coinj, "left");
            // Pos moveright=checkmovebaskey3(basketi , basketj, "left");
            // System.out.println(moveright.x+"--"+moveright.y+"--"+moveright.i+"--"+moveright.j+"--");
            availablemoves.add(moveright);
        }
        if (validmove(balli, ballj, "up") || validmove(basketi, basketj, "up")||validmove(coini, coinj, "up")) {
            // Pos moveright=checkmove3(balli, ballj,"up");
            Pos moveright = moveall(balli, ballj, basketi, basketj,coini,coinj, "up");
            availablemoves.add(moveright);
        }
        // basket
        // if(validmove(basketi, basketj, "bottom")) {
        // // Pos movebottom=checkmovebaskey3(basketi, basketj,"bottom");
        // Pos moveright=moveall(balli, ballj, basketi, basketj, "bottom");
        // availablemoves.add(moveright);
        // }
        // if(validmove(basketi, basketj, "right")) {
        // // Pos moveright=checkmovebaskey3(basketi, basketj,"right");
        // Pos moveright=moveall(balli, ballj, basketi, basketj, "right");
        // availablemoves.add(moveright);
        // }
        // if(validmove(basketi, basketj, "left")) {
        // // Pos moveright=checkmovebaskey3(basketi, basketj,"left");
        // Pos moveright=moveall(balli, ballj, basketi, basketj, "left");
        // availablemoves.add(moveright);
        // }
        // if(validmove(basketi, basketj, "up")) {
        // // Pos moveright=checkmovebaskey3(basketi, basketj,"up");
        // Pos moveright=moveall(balli, ballj, basketi, basketj, "up");
        // availablemoves.add(moveright);
        // }
        // System.out.println("&&&&&&&&&&&&&&&");
        // System.out.println(moveup.x);
        // System.out.println(moveup.y);
        // System.out.println("&&&&&&&&&&&&&&&");

        return availablemoves;

    }

    public Pos moveall(int balli, int ballj, int basketi, int basketj,int coini,int coinj, String dist) {

        int[] ballpos = new int[2];
        ballpos[0] = balli;
        ballpos[1] = ballj;
        int[] coinpos = new int[2];
        coinpos[0] = coini;
        coinpos[1] = coinj;

        ballpos = checkmove3(balli, ballj, dist);
        coinpos = checkmove3coin(coini, coinj, dist);
        // coinpos = checkmove3coin(coini, coinj, dist);

        int[] basketpos = new int[2];
        basketpos[0] = basketi;
        basketpos[1] = basketj;
        basketpos = checkmovebaskey3(basketi, basketj, dist);
        // System.out.println("<<<" + coinpos[0] + "" + coinpos[1] + "" + basketpos[0] +
        // "" + basketpos[0] + ">>>");
        Pos pnew = new Pos(ballpos[0], ballpos[1], basketpos[0], basketpos[1],coinpos[0],coinpos[1]);
        return pnew;
    }

    GameBoard CopyBoard() {

        GameBoard cgb = new GameBoard();
        cgb.balli = this.balli;
        cgb.ballj = this.ballj;
        cgb.basketi = this.basketi;
        cgb.basketj = this.basketj;
        cgb.coini = this.coini;
        cgb.coinj = this.coinj;
        cgb.board = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                cgb.board[i][j] = this.board[i][j];
            }
        }

        return cgb;
    }

    List<GameBoard> GetNextState() {
        // System.out.println("&&&&&" + balli + "" + ballj + "" + basketi + "" + basketj
        // + "&&&&");
        List<GameBoard> boardstate = new LinkedList<>();

        // List<Pos> nextmove = CheckMove();
        // List<Pos> nextmove = CheckMove2(balli,ballj,basketi,basketj);

        List<Pos> nextmove = moves2();

        for (Pos i : nextmove) {
            GameBoard gbs = CopyBoard();

            // gbs.move(i, basketi, basketj);
            gbs.move(i);
            // System.out.println("**********&&&*******");
            // System.out.println(gbs.coini+" --- "+gbs.coinj);
            // System.out.println("**********&&&*******");

            boardstate.add(gbs);
        }
        // System.out.println("size=:" + boardstate.size());
        printboardstate(boardstate);

        return boardstate;
    }

    public void printboardstate(List<GameBoard> states) {
        // x++;
        // System.out.println("X:" + x);
        for (GameBoard state : states) {
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

    public GameBoard BFS(GameBoard board) {
        Queue<GameBoard> q = new LinkedList<>();
        Set<GameBoard> visited = new HashSet<>();
        q.add(board);
        visited.add(board);
        while (!q.isEmpty()) {
            GameBoard currentstate = q.poll();

            if (isfinal() == false)
                return currentstate;
            List<GameBoard> nextstates = GetNextState();
            for (GameBoard nextstatess : nextstates) {
                if (!visited.contains(nextstatess)) {
                    visited.add(nextstatess);
                    q.add((GameBoard) nextstatess);

                }
            }

            System.out.println("Target not found");
        }
        return new GameBoard();

    }

}