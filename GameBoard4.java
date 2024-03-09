import java.util.*;

public class GameBoard4 {
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
    int balls[][];
    boolean scored = false;

    public GameBoard4() {
    }

    public GameBoard4(int[][] board, int basketi, int basketj, String destintion, int nob, int[][] balls) {
        this.board = board;
        this.basketi = basketi;
        this.basketj = basketj;
        this.destintion = destintion;
        this.nob = nob;
        this.balls = balls;
    }

    public GameBoard4(int[][] board, int balli, int ballj, int basketi, int basketj, int nob) {
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

    public GameBoard4(int[][] board, int balls[][], int basketi, int basketj, int nob) {
        this.board = board;
        this.basketi = basketi;
        this.basketj = basketj;
        this.nob = nob;
        this.balls = balls;
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

    // public boolean validmove3(int[][] balls, String dest) {
    //     for (int i = 0; i < balls.length; i++) {
    //         if(balls[i][0]==0)
    //             continue;
    //         switch (dest) {
    //             case "right":

    //             if (board[balls[i][0]][balls[i][1]+1] != 1)

    //             return true;
    //             break;
    //             case "left":
    //             if (board[balls[i][0]][balls[i][1]-1] != 1)
    //             return true;
    //             break;
    //             case "up":
    //             if (board[balls[i][0] -1][balls[i][1]] != 1)
    //             return true;
    //             break;
    //             case "bottom":
    //                 if (board[balls[i][0] + 1][balls[i][1]] != 1)
    //                     return true;
    //                 break;
    //         }
    //     }
    //     return false;
    // }
    
    public boolean validmove3(int[][] balls, String dest) {
        for (int i = 0; i < balls.length; i++) {
            if(balls[i][0]==0)
                continue;
            switch (dest) {
                case "right":

                    for (int j = 0; j < balls.length; j++) {
                if (board[balls[i][0]][balls[i][1]+1] != 1){
                            if(balls[i][0]==balls[j][0]&&balls[i][1]+1==balls[j][1])
                            return false;
                }
                    }

                return true;
                case "left":
              
                for (int j = 0; j < balls.length; j++) {
                    if (board[balls[i][0]][balls[i][1]-1] != 1){
                                if(balls[i][0]==balls[j][0]&&balls[i][1]-1==balls[j][1])
                                return false;
                    }
                        }
    
                    return true;
                case "up":
               
                for (int j = 0; j < balls.length; j++) {
                    if (board[balls[i][0]-1][balls[i][1]] != 1){
                                if(balls[i][0]-1==balls[j][0]&&balls[i][1]==balls[j][1])
                                return false;
                    }
                        }
                    return true;
                case "bottom":
                    
                for (int j = 0; j < balls.length; j++) {
                    if (board[balls[i][0]+1][balls[i][1]] != 1){
                                if(balls[i][0]+1==balls[j][0]&&balls[i][1]==balls[j][1])
                                return false;
                    }
                        }
    
                    return true;
            }
        }
        return false;
    }
    public void move(Pos newpos, int[][] bb) {

        // board[balli][ballj] = 0;

        // board[basketi][basketj] = 0;
        // basketi = newpos.i;
        // basketj = newpos.j;
        // board[newpos.i][newpos.j] = 3;

        // if (newpos.x == 0 && newpos.y == 0) {
        // board[newpos.x][newpos.y] = 1;
        // balli = newpos.x;
        // ballj = newpos.y;
        // } else {
        // board[newpos.x][newpos.y] = 2;
        // balli = newpos.x;
        // ballj = newpos.y;
        // }
        // for (int i = 0; i < newpos.ballsxys.length; i++) {
            
        //     // board[bb[i][0]][bb[i][1]] = 0;
        //     // board[balls[i][0]][balls[i][1]] = 0;
            
            // board[basketi][basketj] = 0;
            // basketi = newpos.i;
            // basketj = newpos.j;
            // board[newpos.i][newpos.j] = 3;
        // }
        for (int index = 0; index < board.length; index++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[index][j]==2){
                    board[index][j]=0;
                }
            }
        }
        board[basketi][basketj] = 0;
        basketi = newpos.i;
        basketj = newpos.j;
        board[newpos.i][newpos.j] = 3;
        for (int j = 0; j < bb.length; j++) {
            
        
            if (newpos.ballsxys[j][0] == 0 && newpos.ballsxys[j][1] == 0) {
                    // System.out.println("teabag");

                board[newpos.ballsxys[j][0]][newpos.ballsxys[j][1]] = 1;
                balli = newpos.ballsxys[j][0];
                ballj = newpos.ballsxys[j][1];
            } else {
                // System.out.println("doop:"+newpos.ballsxys[j][0]);
                
                board[newpos.ballsxys[j][0]][newpos.ballsxys[j][1]] = 2;
                balli = newpos.ballsxys[j][0];
                ballj = newpos.ballsxys[j][1];
                // System.out.println("doop:"+balli+":"+board[newpos.ballsxys[j][0]][newpos.ballsxys[j][1]]);
            }
          }  // System.out.println();
        

    }

    // try
    public int[] checkmove3(int balli3, int ballj3, int basketi3, int basketj3, String dist) {
        int[] newballpos = new int[2];

        if(balli3==0)
        {
            newballpos[0] = 0;
            newballpos[1] = 0;
            return newballpos;
        }

        if (dist == "bottom") {

            if (board[balli3 + 1][ballj3] == 1 || board[balli3 + 1][ballj3] == 2) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (board[balli3 + 1][ballj3] == 3) {
                board[balli3][ballj3] = 0;
                newballpos[0] = 0;
                newballpos[1] = 0;
                System.out.println("test");
                nob--;
                return newballpos;
            }

            return checkmove3(balli3 + 1, ballj3, basketi3, basketj3, dist);

        }
        if (dist == "up") {
            if (board[balli3 - 1][ballj3] == 1 || board[balli3 - 1][ballj3] == 2 || board[balli3 - 1][ballj3] == 3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3(balli3 - 1, ballj3, basketi3, basketj3, dist);
        }

        if (dist == "right") {
            if (board[balli3][ballj3 + 1] == 1 || board[balli3][ballj3 + 1] == 2 || board[balli3][ballj3 + 1] == 3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            return checkmove3(balli3, ballj3 + 1, basketi3, basketj3, dist);
        }

        if (dist == "left") {

            if (board[balli3][ballj3 - 1] == 1 || board[balli3][ballj3 - 1] == 2 || board[balli3][ballj3 - 1] == 3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else {
                return checkmove3(balli3, ballj3 - 1, basketi3, basketj3, dist);
            }
        }

        return newballpos;
    }

    public int[] checkmove3sec(int balli3, int ballj3, int basketi3, int basketj3, String dist,int ballsnewpos[][]) {

        int[] newballpos = new int[4];
        
        if (dist == "bottom") {

            if (board[balli3 + 1][ballj3] == 1 ) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            } else if (balli3 + 1 == basketi3 && ballj3 == basketj3) {
                board[balli3][ballj3] = 0;
                newballpos[0] = 0;
                newballpos[1] = 0;
                System.out.println("test sec");
                nob--;
                return newballpos;
            }
            else {
                for (int i = 0; i < ballsnewpos.length; i++) {
                    if (balli3 +1== ballsnewpos[i][0] && ballj3  == ballsnewpos[i][1]) {
                        newballpos[0] = balli3;
                        newballpos[1] = ballj3;
                        newballpos[3] = 0;
                        return newballpos;
                    }
                }
            return checkmove3sec(balli3 + 1, ballj3, basketi3, basketj3, dist,ballsnewpos);

            }


        }
        if (dist == "up") {
            if (board[balli3 - 1][ballj3] == 1 
                    || balli3 - 1 == basketi3 && ballj3 == basketj3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            else {
                for (int i = 0; i < ballsnewpos.length; i++) {
                    if (balli3 -1== ballsnewpos[i][0] && ballj3  == ballsnewpos[i][1]) {
                        newballpos[0] = balli3;
                        newballpos[1] = ballj3;
                        newballpos[3] = 1;
                        // System.out.println("checked");
                        return newballpos;
                    }
                }
            return checkmove3sec(balli3 - 1, ballj3, basketi3, basketj3, dist,ballsnewpos);

            }
            // return checkmove3sec(balli3 - 1, ballj3, basketi3, basketj3, dist,ballsnewpos);
        }

        if (dist == "right") {
            if (board[balli3][ballj3 + 1] == 1 
                    || balli3 == basketi3 && ballj3 + 1 == basketj3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            // return checkmove3sec(balli3, ballj3 + 1, basketi3, basketj3, dist,ballsnewpos);
            else {
                for (int i = 0; i < ballsnewpos.length; i++) {
                    if (balli3== ballsnewpos[i][0] && ballj3 +1 == ballsnewpos[i][1]) {
                        newballpos[0] = balli3;
                        newballpos[1] = ballj3;
                        newballpos[3] = 1;
            // System.out.println("yiai");

                        return newballpos;
                    }
                }
            return checkmove3sec(balli3, ballj3+1, basketi3, basketj3, dist,ballsnewpos);

            }
        }

        if (dist == "left") {

            if (board[balli3][ballj3 - 1] == 1 || board[balli3][ballj3 - 1] == 2
                    || balli3 == basketi3 && ballj3 - 1 == basketj3) {
                newballpos[0] = balli3;
                newballpos[1] = ballj3;
                return newballpos;
            }
            //  else {
            //     return checkmove3sec(balli3, ballj3 - 1, basketi3, basketj3, dist,ballsnewpos);
            // }
            else {
                for (int i = 0; i < ballsnewpos.length; i++) {
                    if (balli3== ballsnewpos[i][0] && ballj3 +1 == ballsnewpos[i][1]) {
                        newballpos[0] = balli3;
                        newballpos[1] = ballj3;
                        newballpos[3] = 1;
                        return newballpos;
                    }
                }
            return checkmove3sec(balli3, ballj3-1, basketi3, basketj3, dist,ballsnewpos);

            }
        }

        return newballpos;
    }

    int repeat = 0;

    public int[] checkmovebaskey3(int basketi3, int basketj3, int balli3, int ballj3, String dist) {
        int[] newbasketpos = new int[4];
        newbasketpos[2] = balli3;
        newbasketpos[3] = ballj3;
        repeat++;
        if (dist == "right") {
            if (board[basketi3][basketj3 + 1] == 1 || board[basketi3][basketj3 + 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;

                return newbasketpos;
            }

            return checkmovebaskey3(basketi3, basketj3 + 1, balli3, ballj3, dist);
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1 || board[basketi3][basketj3 - 1] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3(basketi3, basketj3 - 1, balli3, ballj3, dist);
        }
        if (dist == "up") {
            if (board[basketi3 - 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            } else if (board[basketi3 - 1][basketj3] == 2) {

                return checkmovebaskey3(basketi3 - 1, basketj3, 0, 0, dist);
            }
            return checkmovebaskey3(basketi3 - 1, basketj3, balli3, ballj3, dist);
        }
        if (dist == "bottom") {
            if (board[basketi3 + 1][basketj3] == 1 || board[basketi3 + 1][basketj3] == 2) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;

                return newbasketpos;
            }
            return checkmovebaskey3(basketi3 + 1, basketj3, balli3, ballj3, dist);
        }
        return newbasketpos;
    }

    public int[] checkmovebaskey3multi(int basketi3, int basketj3, int[][] balls, String dist, int check) {
        int[] newbasketpos = new int[4];
        // newbasketpos[3] = ballj3;
        repeat++;
        if (dist == "right") {
            if (board[basketi3][basketj3 + 1] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[3] = 1;
                return newbasketpos;
            } else {
                for (int i = 0; i < balls.length; i++) {
                    if (basketi3 == balls[i][0] && basketj3 + 1 == balls[i][1]) {
                        newbasketpos[0] = basketi3;
                        newbasketpos[1] = basketj3;
                        newbasketpos[3] = 1;
                        // System.out.println("its done moving to the right:"+i);
                        return newbasketpos;
                    }
                }
            }
            return checkmovebaskey3multi(basketi3, basketj3 + 1, balls, dist, 1);
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[3] = 1;
                return newbasketpos;
            } else {
                for (int i = 0; i < balls.length; i++) {
                    if (basketi3 == balls[i][0] && basketj3 - 1 == balls[i][1]) {
                        newbasketpos[0] = basketi3;
                        newbasketpos[1] = basketj3;
                        newbasketpos[3] = 1;
                        System.out.println("its done moving to the left:"+i);
                        return newbasketpos;
                    }
                }
            }
            return checkmovebaskey3multi(basketi3, basketj3 - 1, balls, dist, 1);
        }
        if (dist == "up") {
            if (board[basketi3 - 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[2] = 99;
                newbasketpos[3] = check;
                return newbasketpos;
            }
            // else if (board[basketi3 - 1][basketj3] == 2) {
            else {
                for (int i = 0; i < balls.length; i++) {
                    if (basketi3 - 1 == balls[i][0] && basketj3 == balls[i][1]) {
                        newbasketpos[0] = basketi3 - 1;
                        newbasketpos[1] = basketj3;
                        newbasketpos[2] = i;
                        newbasketpos[3] = 0;
                        System.out.println("done its eaten");
                        return newbasketpos;
                        // return checkmovebaskey3multi(basketi3 - 1, basketj3, balls, dist,0);
                    }
                }
                return checkmovebaskey3multi(basketi3 - 1, basketj3, balls, dist, 1);

            }

        }
        if (dist == "bottom") {
            if (board[basketi3 + 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                newbasketpos[3] = 1;
                return newbasketpos;
            } else {
                for (int i = 0; i < balls.length; i++) {
                    if (basketi3 + 1 == balls[i][0] && basketj3 == balls[i][1]) {
                        newbasketpos[0] = basketi3;
                        newbasketpos[1] = basketj3;
                        newbasketpos[3] = 1;
                        return newbasketpos;
                    }
                }
            }
            return checkmovebaskey3multi(basketi3 + 1, basketj3, balls, dist, 1);
        }
        return newbasketpos;
    }

    public int[] checkmovebaskey3sec(int basketi3, int basketj3, int balli3, int ballj3, String dist) {
        int[] newbasketpos = new int[4];
        newbasketpos[2] = balli3;
        newbasketpos[3] = ballj3;

        repeat++;
        if (dist == "right") {
            if (board[basketi3][basketj3 + 1] == 1 || basketi3 == balli3 && basketj3 + 1 == ballj3) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;

                return newbasketpos;
            }

            return checkmovebaskey3sec(basketi3, basketj3 + 1, balli3, ballj3, dist);
        }
        if (dist == "left") {
            if (board[basketi3][basketj3 - 1] == 1 || basketi3 == balli3 && basketj3 - 1 == ballj3) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3sec(basketi3, basketj3 - 1, balli3, ballj3, dist);
        }
        if (dist == "up") {

            if (board[basketi3 - 1][basketj3] == 1) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            } else if (basketi3 - 1 == balli3 && basketj3 == ballj3) {

                return checkmovebaskey3sec(basketi3 - 1, basketj3, 0, 0, dist);
            }
            return checkmovebaskey3sec(basketi3 - 1, basketj3, balli3, ballj3, dist);
        }
        if (dist == "bottom") {
            if (board[basketi3 + 1][basketj3] == 1 || basketi3 + 1 == balli3 && basketj3 == ballj3) {
                newbasketpos[0] = basketi3;
                newbasketpos[1] = basketj3;
                return newbasketpos;
            }
            return checkmovebaskey3sec(basketi3 + 1, basketj3, balli3, ballj3, dist);
        }
        return newbasketpos;
    }

    // public int[] checkmovebaskey3secmulti(int basketi3, int basketj3, int
    // [][]balls, String dist) {
    // int[] newbasketpos = new int[4];

    // newbasketpos[2] = balls[];
    // newbasketpos[3] = ballj3;

    // repeat++;
    // if (dist == "right") {
    // if (board[basketi3][basketj3 + 1] == 1 || basketi3 == balli3 && basketj3 + 1
    // == ballj3) {
    // newbasketpos[0] = basketi3;
    // newbasketpos[1] = basketj3;

    // return newbasketpos;
    // }

    // return checkmovebaskey3secmulti(basketi3, basketj3 + 1, balli3, ballj3,
    // dist);
    // }
    // if (dist == "left") {
    // if (board[basketi3][basketj3 - 1] == 1 || basketi3 == balli3 && basketj3 - 1
    // == ballj3) {
    // newbasketpos[0] = basketi3;
    // newbasketpos[1] = basketj3;
    // return newbasketpos;
    // }
    // return checkmovebaskey3secmulti(basketi3, basketj3 - 1, balli3, ballj3,
    // dist);
    // }
    // if (dist == "up") {

    // if (board[basketi3 - 1][basketj3] == 1) {
    // newbasketpos[0] = basketi3;
    // newbasketpos[1] = basketj3;
    // return newbasketpos;
    // } else if (basketi3 - 1 == balli3 && basketj3 == ballj3) {

    // return checkmovebaskey3secmulti(basketi3 - 1, basketj3, 0, 0, dist);
    // }
    // return checkmovebaskey3secmulti(basketi3 - 1, basketj3, balli3, ballj3,
    // dist);
    // }
    // if (dist == "bottom") {
    // if (board[basketi3 + 1][basketj3] == 1 || basketi3 + 1 == balli3 && basketj3
    // == ballj3) {
    // newbasketpos[0] = basketi3;
    // newbasketpos[1] = basketj3;
    // return newbasketpos;
    // }
    // return checkmovebaskey3secmulti(basketi3 + 1, basketj3, balli3, ballj3,
    // dist);
    // }
    // return newbasketpos;
    // }

    List<Pos> moves2() {
        List<Pos> availablemoves = new LinkedList<>();
        // down
        // if (validmove(balli, ballj, "bottom") || validmove2(basketi, basketj,
        // "bottom")) {
        
        if (validmove3(balls, "bottom") || validmove2(basketi, basketj, "bottom")) {
            System.out.println("bottom");
            // Pos movebottom = moveall(balli, ballj, basketi, basketj, "bottom");
            Pos movebottom = moveallmultiball(balls, basketi, basketj, "bottom");

            availablemoves.add(movebottom);
        }
        if (validmove3(balls, "up") || validmove2(basketi, basketj, "up")) {
            System.out.println("up");
            // Pos movebottom = moveall(balli, ballj, basketi, basketj, "bottom");
            Pos moveup = moveallmultiball(balls, basketi, basketj, "up");

            availablemoves.add(moveup);
        }
        if (validmove3(balls, "right") || validmove2(basketi, basketj, "right")) {
            System.out.println("right");
            // Pos movebottom = moveall(balli, ballj, basketi, basketj, "bottom");
            Pos moveright = moveallmultiball(balls, basketi, basketj, "right");

            availablemoves.add(moveright);
        }
        if (validmove3(balls, "left") || validmove2(basketi, basketj, "left")) {
            System.out.println("left");
            // Pos movebottom = moveall(balli, ballj, basketi, basketj, "bottom");
            Pos moveleft = moveallmultiball(balls, basketi, basketj, "left");

            availablemoves.add(moveleft);
        }
        // if (validmove(balli, ballj, "right") || validmove2(basketi, basketj,
        // "right")) {
        // System.out.println("right");
        // // Pos moveright=checkmove3(balli, ballj,"right");
        // // Pos moveright = moveall(balli, ballj, basketi, basketj, "right");
        // // System.out.println("<<<" + moveright.x + "" + moveright.y + "" +
        // moveright.i+
        // // "" + moveright.j+ ">>>");
        // Pos mb = moveall(balli, ballj, basketi, basketj, "right");
        // // System.out.println("<<<" + mb.x + " * " + mb.y + " * " + mb.i +
        // // "* " + mb.j + ">>>" + "right");
        // // Pos moveright = moveall(mb.x, mb.y, mb.i, mb.j, "right");
        // // System.out.println("<<<" + moveright.x + "" + moveright.y + " R " +
        // // moveright.i +
        // // "" + moveright.j + ">>>");
        // availablemoves.add(mb);
        // }
        // if (validmove(balli, ballj, "left") || validmove2(basketi, basketj, "left"))
        // {
        // System.out.println("left");
        // // Pos moveright=checkmove3(balli, ballj,"left");
        // Pos moveleft = moveall(balli, ballj, basketi, basketj, "left");
        // // Pos moveright=checkmovebaskey3(basketi , basketj, "left");
        // //
        // System.out.println(moveright.x+"--"+moveright.y+"--"+moveright.i+"--"+moveright.j+"--");
        // // Pos mb= moveall(balli, ballj, basketi, basketj, "left");
        // // Pos moveleft=moveall(mb.x, mb.y, mb.i, mb.j,"left");
        // availablemoves.add(moveleft);
        // }
        // if (validmove(balli, ballj, "up") || validmove2(basketi, basketj, "up")) {
        // System.out.println("up");
        // if (basketi > balli)
        // scored = false;
        // // Pos moveright=checkmove3(balli, ballj,"up");
        // Pos moveup = moveall(balli, ballj, basketi, basketj, "up");
        // // Pos mb= moveall(balli, ballj, basketi, basketj, "up");
        // // Pos moveup=moveall(mb.x, mb.y, mb.i, mb.j,"up");
        // availablemoves.add(moveup);
        // }

        return availablemoves;

    }

    // public Pos moveall(int balli, int ballj, int basketi, int basketj, String
    // dist) {

    // int[] ballpos = new int[2];
    // ballpos[0] = balli;
    // ballpos[1] = ballj;

    // ballpos = checkmove3(balli, ballj, basketi, basketj, dist);
    // System.out.println(ballpos[0] + " <> " + ballpos[1]);
    // int[] basketpos = new int[4];
    // basketpos[0] = basketi;
    // basketpos[1] = basketj;
    // basketpos = checkmovebaskey3(basketi, basketj, ballpos[0], ballpos[1], dist);
    // int[] ballpos2 = new int[2];
    // ballpos2[0] = basketpos[2];
    // ballpos2[1] = basketpos[3];
    // if (basketpos[2] != 0)
    // ballpos2 = checkmove3sec(ballpos2[0], ballpos2[1], basketpos[0],
    // basketpos[1], dist);
    // int[] basketpos2 = new int[4];
    // basketpos2[0] = basketpos[0];
    // basketpos2[1] = basketpos[1];
    // basketpos2 = checkmovebaskey3sec(basketpos[0], basketpos[1], ballpos2[0],
    // ballpos2[1], dist);

    // // Pos pnew = new Pos(ballpos[0], ballpos[1], basketpos[0], basketpos[1]);
    // // Pos pnew = new Pos(basketpos[2], basketpos[3], basketpos[0],
    // basketpos[1]);
    // Pos pnew = new Pos(basketpos2[2], basketpos2[3], basketpos2[0],
    // basketpos2[1]);
    // return pnew;

    // }

    public Pos moveallmultiball(int balls[][], int basketi, int basketj, String dist) {
        int ballsnewxys[][] = new int[balls.length][2];
        int[][] ballscopy = balls;
        int[] basketpos2 = new int[4];
        System.out.print("initialballs");
        for (int i = 0; i < balls.length; i++) {
            System.out.print(" "+balls[i][0]+","+balls[i][1]+" - ");
        }
        for (int i = 0; i < balls.length; i++) {

            int[] ballpos = new int[2];
            ballpos[0] = balls[i][0];
            ballpos[1] = balls[i][1];

            ballpos = checkmove3(balls[i][0], balls[i][1], basketi, basketj, dist);
            // System.out.println(ballpos[0] + " --- " + ballpos[1]);

            // int[] ballpos2 = new int[2];
            // ballpos2[0] = basketpos[2];
            // ballpos2[1] = basketpos[3];
            // if (basketpos[2] != 0)
            // ballpos2 = checkmove3sec(ballpos2[0], ballpos2[1], basketpos[0],
            // basketpos[1], dist);
            // basketpos2[0] = basketpos[0];
            // basketpos2[1] = basketpos[1];
            // // basketpos2 = checkmovebaskey3sec(basketpos[0], basketpos[1], balls, dist);

            // // Pos pnew = new Pos(ballpos[0], ballpos[1], basketpos[0], basketpos[1]);
            // // Pos pnew = new Pos(basketpos[2], basketpos[3], basketpos[0],
            // basketpos[1]);
            // ballsnewxys[i][0]=basketpos2[2];
            // ballsnewxys[i][1]=basketpos2[3];

            // test

            ballsnewxys[i][0] = ballpos[0];
            ballsnewxys[i][1] = ballpos[1];

        }
        int[] basketpos = new int[4];
        basketpos[0] = basketi;
        basketpos[1] = basketj;
        basketpos = checkmovebaskey3multi(basketi, basketj, ballsnewxys, dist, 1);

        // System.out.println("----------------------------");
        // for (int j = 2; j < basketpos.length; j++) {
        // System.out.print(basketpos[j]+" <balls> ");
        // }
        // System.out.println();
        // System.out.println("----------------------------");
        if (basketpos[3] == 0) {
            System.out.println("eat");
            // ballscopy[basketpos[2]][0]=0;
            // ballscopy[basketpos[2]][1]=0;
            ballsnewxys[basketpos[2]][0] = 0;
            ballsnewxys[basketpos[2]][1] = 0;
            // ballsnewxys=pivot2DArray(ballsnewxys);

            // System.out.println();
            // for (int index = 0; index < ballsnewxys.length; index++) {
            //     System.out.print(ballsnewxys[index][0] + " *** " + ballsnewxys[index][1]);
            // }
            // System.out.println();
        }

        // sec time
        
        System.out.println("sec");
        for (int j = 0; j < balls.length; j++) {
            int[] ballpos2 = new int[2];
            ballpos2[0] = ballsnewxys[j][0];
            ballpos2[1] = ballsnewxys[j][1];

            if (ballsnewxys[j][0] != 0) {
                // System.out.println("change: "+ballsnewxys[j][0]+" - "+ballsnewxys[j][1]);
                ballpos2 = checkmove3sec(ballsnewxys[j][0], ballsnewxys[j][1], basketpos[0], basketpos[1], dist,ballsnewxys);
                ballsnewxys[j][0] = ballpos2[0];
                ballsnewxys[j][1] = ballpos2[1];
                // System.out.println("new ballpos: "+ballsnewxys[j][0]+" - "+ballsnewxys[j][1]);
            }
        }
        
        basketpos2[0] = basketpos[0];
        basketpos2[1] = basketpos[1];
        basketpos2 = checkmovebaskey3multi(basketpos[0], basketpos[1], ballsnewxys, dist, 1);

        // System.out.println("----------------------------");
        // for (int j = 0; j < basketpos.length; j++) {
        // System.out.print(basketpos[j]+" <> ");
        // }
        // System.out.println();
        // System.out.println("----------------------------");
        if (basketpos2[3] == 0) {
            // ballscopy[basketpos[2]][0]=0;
            // ballscopy[basketpos[2]][1]=0;
            ballsnewxys[basketpos[2]][0] = 0;
            ballsnewxys[basketpos[2]][1] = 0;
        }

        // if(dist=="up")
        // System.out.println(basketpos2[0] + " new basket " + basketpos2[1]);
        System.out.println();
        for (int index = 0; index < ballsnewxys.length; index++) {
            System.out.print(ballsnewxys[index][0] + " ^ " + ballsnewxys[index][1]+ " <> ");
        }
        System.out.println();

        Pos pnew = new Pos(ballsnewxys, basketpos2[0], basketpos2[1]);
        return pnew;

    }

    GameBoard4 CopyBoard() {

        GameBoard4 cgb = new GameBoard4();
        cgb.balli = this.balli;
        cgb.ballj = this.ballj;
        cgb.basketi = this.basketi;
        cgb.basketj = this.basketj;
        cgb.balls=this.balls;
        cgb.board = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                cgb.board[i][j] = this.board[i][j];
            }
        }

        return cgb;
    }

    List<GameBoard4> GetNextState() {
        List<GameBoard4> boardstate = new LinkedList<>();
        List<Pos> nextmove = moves2();

        for (Pos i : nextmove) {
            GameBoard4 gbs = CopyBoard();
            // for (int j = 0; j < i.ballsxys.length; j++) {
            //     System.out.println(i.ballsxys[j][0] + " - " + i.ballsxys[j][1]);
            // }
            gbs.move(i,i.ballsxys);
            gbs.balls=i.ballsxys;
            // System.out.println("poss :" + gbs.balli + "-" + gbs.ballj + " - " +
            // gbs.basketi + " - " + gbs.basketj);
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
            GameBoard4 gbs = CopyBoard();
            gbs.move(move,gbs.balls);
            Node node = new Node(gbs, initialCost, parent); 
            nodes.add(node);
        }
    
        return nodes;
    }
    public int calh(int balli, int ballj, int basketi, int basketj) {
        int h = 0;
        int h1 = 0;
        int h2 = 0;
        h1 = (ballj - basketj);
        if (h1 < 0)
            h1 = h1 * (-1);
        h2 = (balli - basketi);
        if (h2 < 0)
            h2 = h2 * (-1);
        return h = h1 + h2;
    }

    public void printboardstate(List<GameBoard4> states) {
        for (GameBoard4 state : states) {
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

    public int[][] pivot2DArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] pivotedArray = new int[rows][cols - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                pivotedArray[i][j - 1] = arr[i][j];
            }
        }

        return pivotedArray;
    }

}