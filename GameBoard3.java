import java.util.*;

public class GameBoard3 {
    int[][] board;
    int balli;
    int ballj;
    int basketi;
    int basketj;
    int x = 0;
    String destintion;
    // int[] nob = new int[10];
    int nob;
    int[] bandbpos = new int[4];
    boolean scored = false;

    public GameBoard3() {
    }

    public GameBoard3(int[][] board, int balli, int ballj, int basketi, int basketj, int nob) {
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

    //

    public void printstate(int[][] board) {
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

    public boolean validmove(int balli2, int ballj2, String dest) {
        switch (dest) {
            case "right":
                if (board[balli2][ballj2 + 1] != 1 && board[balli2][ballj2 + 1] != 3)
                    return true;
                break;
            case "left":
                if (board[balli2][ballj2 - 1] != 1 && board[balli2][ballj2 - 1] != 3)
                    return true;
                break;
            case "up":
                if (board[balli2 - 1][ballj2] != 1 && board[balli2 - 1][ballj2] != 3)
                    return true;
                break;
            case "bottom":
                if (board[balli2 + 1][ballj2] != 1)
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
                if (board[basketi2][basketj2 - 1] != 1 && board[basketi2][basketj2 - 1] != 2) {
                    return true;
                }
                break;
            case "up":
                if (board[basketi2 - 1][basketj2] != 1)
                    return true;
                break;
            case "bottom":
                if (board[basketi2 + 1][basketj2] != 1 && board[basketi2 + 1][basketj2] != 2)
                    return true;
                break;
        }
        return false;
    }

    public void move(Pos newpos) {

        board[balli][ballj] = 0;

        board[basketi][basketj] = 0;
        basketi = newpos.i;
        basketj = newpos.j;
        board[newpos.i][newpos.j] = 3;

        if (newpos.x == 0 && newpos.y == 0) {
            board[newpos.x][newpos.y] = 1;
            balli = newpos.x;
            ballj = newpos.y;
        } else {
            board[newpos.x][newpos.y] = 2;
            balli = newpos.x;
            ballj = newpos.y;
        }

    }

    // try
    public int[] checkmove3(int balli3, int ballj3, int basketi3, int basketj3, String dist) {

        int[] newballpos = new int[2];

        if (dist == "bottom") {

            if (board[balli3 + 1][ballj3] == 1 || board[balli3 + 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (board[balli3 + 1][ballj3] == 3) {
                // if (board[balli3+2][ballj3] == 0) {
                // return checkmove3(balli3+2, ballj3, basketi3, basketj3, dist);
                // } else {
                board[balli3][ballj3] = 0;
                // newballpos[0] = basketi3;
                // newballpos[1] = basketj3;
                newballpos[0] = 0;
                newballpos[1] = 0;

                nob--;

                return newballpos;
                // }
            } else {
                return checkmove3(balli3 + 1, ballj3, basketi3, basketj3, dist);
            }
        }
        if (dist == "up") {
            if (board[balli3 - 1][ballj3] == 1 || board[balli3 - 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (board[balli3 - 1][ballj3] == 3) {
                if (board[balli3 - 2][ballj3] == 0) {
                    return checkmove3(balli3 - 2, ballj3, basketi3, basketj3, dist);
                } else {
                    newballpos[0] = balli3;
                    newballpos[1] = ballj3;
                    return newballpos;
                }
            } else {
                return checkmove3(balli3 - 1, ballj3, basketi3, basketj3, dist);
            }
        }
        if (dist == "right") {
            // if (board[balli3][ballj3 + 1] == 1 || board[balli3][ballj3 + 1] == 3 ||
            // board[balli3][ballj3 + 1] == 2) {
            // System.out.println("(((((" + ballj3 + " - " + basketj3 + ")))");
            if (board[balli3][ballj3 + 1] == 1 || board[balli3][ballj3 + 1] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (board[balli3][ballj3 + 1] == 3) {
                if (board[balli3][ballj3 + 2] == 0) {
                    return checkmove3(balli3, ballj3 + 2, basketi3, basketj3, dist);
                } else {
                    newballpos[0] = balli3;
                    newballpos[1] = ballj3;
                    return newballpos;
                }
            } else {
                return checkmove3(balli3, ballj3 + 1, basketi3, basketj3, dist);
            }
        }
        if (dist == "left") {
            // if (board[balli3][ballj3 - 1] == 1 || board[balli3][ballj3 - 1] == 2 ||
            // board[balli3][ballj3 - 1] == 3) {
            // newballpos[0] = balli3;
            // newballpos[1] = ballj3;
            // return newballpos;
            // }
            // return checkmove3(balli3, ballj3 - 1, basketi3, basketj3, dist);
            if (board[balli3][ballj3 - 1] == 1 || board[balli3][ballj3 - 1] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (board[balli3][ballj3 - 1] == 3) {
                if (board[balli3][ballj3 - 2] == 0) {
                    return checkmove3(balli3, ballj3 - 2, basketi3, basketj3, dist);
                } else {
                    newballpos[0] = balli3;
                    newballpos[1] = ballj3;
                    return newballpos;
                }
            } else {
                return checkmove3(balli3, ballj3 - 1, basketi3, basketj3, dist);
            }
        }

        return newballpos;
    }

    public int[] checkmovebaskey3(int basketi3, int basketj3, String dist) {
        int[] newbasketpos = new int[2];
        if (dist == "bottom") {

            if (board[basketi3 - 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            } else if (board[basketi3 - 1][basketj3] == 2) {
                if (board[basketi3][basketj3 + 2] == 0) {
                    return checkmovebaskey3(basketi3, basketj3 + 2, dist);
                }
                // int temp = board[basketi3][basketj3 + 1];
                // board[basketi3][basketj3 + 1] = board[basketi3][basketj3];
                // board[basketi3][basketj3] = temp;
                // return checkmovebaskey3(basketi3, basketj3 + 2, dist);
            } else {

                return checkmovebaskey3(basketi3, basketj3 + 1, dist);
            }
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
            if (board[basketi3][basketj3 + 1] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            } else if (board[basketi3][basketj3 + 1] == 2) {
                if (board[basketi3][basketj3 + 2] == 0) {
                    return checkmovebaskey3(basketi3, basketj3 + 2, dist);
                }
                // int temp = board[basketi3][basketj3 + 1];
                // board[basketi3][basketj3 + 1] = board[basketi3][basketj3];
                // board[basketi3][basketj3] = temp;
                // return checkmovebaskey3(basketi3, basketj3 + 2, dist);
            } else {

                return checkmovebaskey3(basketi3, basketj3 + 1, dist);
            }
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1 || board[basketi3][basketj3 - 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 - 1, dist);
        }

        return newbasketpos;
    }

    int repeat = 0;

    public int[] checkmovebaskey3(int basketi3, int basketj3, int balli3, int ballj3, String dist) {
        int[] newbasketpos = new int[4];
        repeat++;
        if (dist == "right") {
            if (board[basketi3][basketj3 + 1] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;

                return newbasketpos;
            } else if (basketj3 + 1 == ballj3 && basketi3 == balli3) {
                System.out.println("yooooo");
                return checkmovebaskey3(basketi3, basketj3 + 1, balli3, ballj3 - 1, dist);

            }
            // else if (basketj3 + 1 == ballj3 && basketi3 == balli&& board[balli3][ballj3 +
            // 1] == 0) {
            // System.out.println("yooooo>> "+balli3+" <ball basket>"+basketi3);

            // newbasketpos[0] = basketi3;
            // newbasketpos[1] = basketj3;
            // newbasketpos[2] = balli3;
            // newbasketpos[3] = ballj3;
            // return newbasketpos;
            // }
            else {

                return checkmovebaskey3(basketi3, basketj3 + 1, balli3, ballj3, dist);
            }
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;
                return newbasketpos;
            } else if (basketj3 - 1 == ballj3 && basketi3 == balli3 && board[balli3][ballj3 - 1] == 0) {
                return checkmovebaskey3(basketi3, basketj3 - 1, balli3, ballj3 + 1, dist);

            } else if (basketj3 - 1 == ballj3 && basketi3 == balli3 && board[balli3][ballj3 - 1] != 0) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;
                return newbasketpos;
            } else {
                return checkmovebaskey3(basketi3, basketj3 - 1, balli3, ballj3, dist);
            }
        }
        if (dist == "up") {
            if (basketi3 - 1 == balli3 && basketj3 == ballj3 && balli3!=0&& scored == true) {
                nob--;
                return checkmovebaskey3(basketi3 - 1, basketj3, 0, 0, dist);
            } else if (basketi3 - 1 == balli3 && basketj3 == ballj3 && balli3!=0 && scored == false) {

                return checkmovebaskey3(basketi3 - 1, basketj3, balli3 + 1, ballj3, dist);
            }

            else if (board[basketi3 - 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;
                return newbasketpos;
            } else if (basketi3 - 1 == balli3 && basketj3 == ballj3 && scored == true) {
                // return checkmovebaskey3(basketi3 - 1, basketj3, balli3 + 1, ballj3, dist);
                return checkmovebaskey3(basketi3 - 1, basketj3, 0, 0, dist);
            } else {
                // int temp=board[basketi3][basketj3];
                // board[basketi3][basketj3+1]=board[basketi3][basketj3];
                // board[basketi3][basketj3]=temp;

                return checkmovebaskey3(basketi3 - 1, basketj3, balli3, ballj3, dist);
            }
        }
        if (dist == "bottom") {

            if (board[basketi3 + 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;
                return newbasketpos;
            } else if (basketi3 + 1 == balli3 && basketj3 == ballj3 && board[balli3 + 1][ballj3] == 0)
                return checkmovebaskey3(basketi3 + 1, basketj3, balli3 - 1, ballj3, dist);
            else if (basketi3 + 1 == balli3 && basketj3 == ballj3 && board[balli3 + 1][ballj3] != 0) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = balli3;
                newbasketpos[3] = ballj3;
                return newbasketpos;
            } else {

                return checkmovebaskey3(basketi3 + 1, basketj3, balli3, ballj3, dist);
            }
        }
        return newbasketpos;
    }

    List<Pos> moves2() {
        // int balli=gb.balli;int ballj=gb.ballj;
        // int basketi=gb.basketi;int basketj=gb.basketj;

        List<Pos> availablemoves = new LinkedList<>();
        // down

        if (validmove(balli, ballj, "bottom") || validmove2(basketi, basketj, "bottom")) {
            // System.out.println("bottom");
            Pos movebottom = moveall(balli, ballj, basketi, basketj, "bottom");
            // Pos mb= moveall(balli, ballj, basketi, basketj, "bottom");
            // Pos movebottom=moveall(mb.x, mb.y, mb.i, mb.j,"bottom");

            availablemoves.add(movebottom);
        }
        if (validmove(balli, ballj, "right") || validmove2(basketi, basketj, "right")) {
            // System.out.println("right");
            // Pos moveright=checkmove3(balli, ballj,"right");
            // Pos moveright = moveall(balli, ballj, basketi, basketj, "right");
            // System.out.println("<<<" + moveright.x + "" + moveright.y + "" + moveright.i+
            // "" + moveright.j+ ">>>");
            Pos mb = moveall(balli, ballj, basketi, basketj, "right");
            // System.out.println("<<<" + mb.x + " * " + mb.y + " * " + mb.i +
            // "* " + mb.j + ">>>" + "right");
            // Pos moveright = moveall(mb.x, mb.y, mb.i, mb.j, "right");
            // System.out.println("<<<" + moveright.x + "" + moveright.y + " R " +
            // moveright.i +
            // "" + moveright.j + ">>>");
            availablemoves.add(mb);
        }
        if (validmove(balli, ballj, "left") || validmove2(basketi, basketj, "left")) {
            // System.out.println("left");
            // Pos moveright=checkmove3(balli, ballj,"left");
            Pos moveleft = moveall(balli, ballj, basketi, basketj, "left");
            // Pos moveright=checkmovebaskey3(basketi , basketj, "left");
            // System.out.println(moveright.x+"--"+moveright.y+"--"+moveright.i+"--"+moveright.j+"--");
            // Pos mb= moveall(balli, ballj, basketi, basketj, "left");
            // Pos moveleft=moveall(mb.x, mb.y, mb.i, mb.j,"left");
            availablemoves.add(moveleft);
        }
        if (validmove(balli, ballj, "up") || validmove2(basketi, basketj, "up")) {
            // System.out.println("up");
            if (basketi > balli)
                scored = false;
            // Pos moveright=checkmove3(balli, ballj,"up");
            Pos moveup = moveall(balli, ballj, basketi, basketj, "up");
            // Pos mb= moveall(balli, ballj, basketi, basketj, "up");
            // Pos moveup=moveall(mb.x, mb.y, mb.i, mb.j,"up");
            availablemoves.add(moveup);
        }

        return availablemoves;

    }

    public Pos moveall(int balli, int ballj, int basketi, int basketj, String dist) {

        int[] ballpos = new int[2];
        ballpos[0] = balli;
        ballpos[1] = ballj;
        ballpos = checkmove3(balli, ballj, basketi, basketj, dist);

        int[] basketpos = new int[4];
        basketpos[0] = basketi;
        basketpos[1] = basketj;
        basketpos = checkmovebaskey3(basketi, basketj, ballpos[0], ballpos[1], dist);

        Pos pnew = new Pos(basketpos[2], basketpos[3], basketpos[0], basketpos[1]);
        return pnew;

    }

    public Pos moveall(String dist) {

        int[] ballpos = new int[2];
        ballpos[0] = balli;
        ballpos[1] = ballj;

        ballpos = checkmove3(balli, ballj, basketi, basketj, dist);

        int[] basketpos = new int[2];
        basketpos[0] = basketi;
        basketpos[1] = basketj;
        basketpos = checkmovebaskey3(basketi, basketj, dist);
        ballpos = checkmove3(balli, ballj, basketpos[0], basketpos[1], dist);
        // basketpos = checkmovebaskey3(basketpos[0], basketpos[1], dist);

        Pos pnew = new Pos(ballpos[0], ballpos[1], basketpos[0], basketpos[1]);
        return pnew;
    }

    GameBoard3 CopyBoard() {

        GameBoard3 cgb = new GameBoard3();
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

    List<GameBoard3> GetNextState() {
        List<GameBoard3> boardstate = new LinkedList<>();
        List<Pos> nextmove = moves2();

        for (Pos i : nextmove) {
            GameBoard3 gbs = CopyBoard();
            gbs.move(i);
            boardstate.add(gbs);
        }
        printboardstate(boardstate);
        return boardstate;
    }
 
    List<Node> GetNextNode(Node parent) {
    List<Node> nodes = new LinkedList<>();
    List<Pos> nextMoves = moves2();
    int initialCost = 100; 

    for (Pos move : nextMoves) {
        GameBoard3 gbs = CopyBoard();
        gbs.move(move);
        Node node = new Node(gbs, initialCost, parent); 
        nodes.add(node);
    }

    return nodes;
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
List<Node2> GetNextNode2(Node2 parent) {
    List<Node2> nodes = new LinkedList<>();
    List<Pos> nextMoves = moves2();
    int initialCost = 100; 
    for (Pos move : nextMoves) {
        GameBoard3 gbs = CopyBoard();
        gbs.move(move);
         int h=calh(gbs.balli,gbs.ballj,gbs.basketi,gbs.basketj);
        Node2 node2 = new Node2(gbs, parent,h,0,initialCost); 
        nodes.add(node2);
    }

    return nodes;
}


    public void printboardstate(List<GameBoard3> states) {
        for (GameBoard3 state : states) {
            int[][] boardstate = state.board;
            int[] posi = new int[] { state.balli, state.ballj, state.basketi, state.basketj };
            for (int i = 0; i < boardstate.length; i++) {
                for (int j = 0; j < boardstate[0].length; j++) {
                    System.out.print(boardstate[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(); 
        }

    }

}