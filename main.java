import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int levelchoice = 1;
        int Gametype;
        int balli = 1;
        int ballj = 2;
        int balli1 = 1;
        int ballj1 = 2;
        int balli2 = 1;
        int ballj2 = 2;
        int BasketI = 3;
        int BasketJ = 2;
        int coini = 0;
        int coinj = 0;
        int nob = 3;
        // int[][] balls = new int[][]{ {1,2},{3,1}};
        int[][] balls = new int[][] { { 1, 2 }, { 2, 1 }, { 3, 1 } };
        int[][] board;
        System.out.println("Choose gametype \n1-userplay:\n2-bfs\n3-dfs\n4-UCS\n5-A Star");
        Gametype = scanner.nextInt();
        while (levelchoice != 99) {
            System.out.println("Choose the level");
            levelchoice = scanner.nextInt();
            switch (levelchoice) {
                case 1:
                    levelchoice = 1;
                    // balls[0][0] = balli;
                    // balls[0][1] = ballj;
                    int ballstemp3[][] = new int[1][2];
                    ballstemp3[0][0] = balli;
                    ballstemp3[0][1] = ballj;
                    balls = ballstemp3;
                    nob = 1;
                    break;
                case 2:
                    levelchoice = 2;
                    balli = 2;
                    ballj = 1;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 2;
                    BasketJ = 3;
                    break;
                case 3:
                    levelchoice = 3;
                    balli = 3;
                    ballj = 2;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 1;
                    BasketJ = 2;
                    break;
                case 4:
                    levelchoice = 4;
                    balli = 2;
                    ballj = 1;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 2;
                    BasketJ = 3;
                    break;
                case 5:
                    levelchoice = 5;
                    balli = 4;
                    ballj = 3;
                    coini = 2;
                    coinj = 1;
                    int ballstemp4[][] = new int[1][2];
                    ballstemp4[0][0] = balli;
                    ballstemp4[0][1] = ballj;
                    balls = ballstemp4;
                    BasketI = 2;
                    BasketJ = 3;
                    nob=1;
                    break;
                case 6:
                    levelchoice = 6;
                    balli = 3;
                    ballj = 2;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 2;
                    BasketJ = 1;
                    break;
                case 7:
                    levelchoice = 7;
                    balli = 4;
                    ballj = 2;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 3;
                    BasketJ = 3;
                    break;
                case 9:
                    levelchoice = 9;
                    balli = 2;
                    ballj = 1;
                    balli1 = 2;
                    ballj1 = 2;
                    balli2 = 2;
                    ballj2 = 3;
                    int ballstemp[][] = new int[3][2];
                    ballstemp[0][0] = balli;
                    ballstemp[0][1] = ballj;
                    ballstemp[1][0] = balli1;
                    ballstemp[1][1] = ballj1;
                    ballstemp[2][0] = balli2;
                    ballstemp[2][1] = ballj2;
                    balls = ballstemp;
                    nob = 3;
                    BasketI = 1;
                    BasketJ = 1;
                    break;
                case 21:
                    levelchoice = 21;
                    balli = 2;
                    ballj = 1;
                    balli1 = 2;
                    ballj1 = 2;
                    balli2 = 4;
                    ballj2 = 3;

                    int ballstemp2[][] = new int[3][2];
                    ballstemp2[0][0] = balli;
                    ballstemp2[0][1] = ballj;
                    ballstemp2[1][0] = balli1;
                    ballstemp2[1][1] = ballj1;
                    ballstemp2[2][0] = balli2;
                    ballstemp2[2][1] = ballj2;
                    balls = ballstemp2;
                    nob = 3;
                    BasketI = 1;
                    BasketJ = 1;
                    break;
                case 12:
                    levelchoice = 12;
                    balli = 1;
                    ballj = 4;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 1;
                    BasketJ = 1;
                    break;
                case 8:
                    levelchoice = 8;
                    balli = 2;
                    ballj = 2;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 1;
                    BasketJ = 1;
                    coini = 3;
                    coinj = 1;
                    break;
                case 11:
                    levelchoice = 11;
                    balli = 3;
                    ballj = 3;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 3;
                    BasketJ = 2;
                    coini = 2;
                    coinj = 3;
                    break;
                case 14:
                    levelchoice = 14;
                    balli = 2;
                    ballj = 4;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 3;
                    BasketJ = 1;
                    coini = 3;
                    coinj = 4;
                    break;
                case 15:
                    levelchoice = 15;
                    balli = 1;
                    ballj = 1;
                    balls[0][0] = balli;
                    balls[0][1] = ballj;
                    BasketI = 4;
                    BasketJ = 4;
                    break;
                case 20:
                    levelchoice = 20;
                    // balli = 3;
                    // ballj = 2;
                    // BasketI = 2;
                    // BasketJ = 2;
                    balli = 3;
                    ballj = 1;
                    BasketI = 2;
                    BasketJ = 1;
                    break;
                case 16:
                    levelchoice = 16;
                    balli = 1;
                    ballj = 2;
                    // {1,2},{3,1}
                    // balls={1,2},{3,2}
                    BasketI = 3;
                    BasketJ = 3;
                    break;
                     case 22:
                    levelchoice =22;
                    balli = 4;
                    ballj = 3;
                    coini = 1;
                    coinj = 3;
                    int ballstemp5[][] = new int[1][2];
                    ballstemp5[0][0] = balli;
                    ballstemp5[0][1] = ballj;
                    balls = ballstemp5;
                    BasketI = 2;
                    BasketJ = 3;
                    nob=1;
                    break;
                default:
                    break;
            }
            Level l = new Level(levelchoice);
            board = l.Setlevel();

            System.out.println("-------------------------");
            System.out.println("**********************");
            if (Gametype == 2) {
                if (levelchoice == 1 || levelchoice == 2 || levelchoice == 3 || levelchoice == 4 || levelchoice == 6
                        || levelchoice == 7 || levelchoice == 12 || levelchoice == 15) {
                    // GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // // gm.printstate(board);
                    // // List<GameBoard3> states = gm.GetNextState();
                    // BFS3 b = new BFS3(board);
                    // b.BFS3algo(gm);
                    // // DFS3 d=new DFS3(board);
                    // // d.DFS3algo(gm);
                    GameBoard4 gm = new GameBoard4(board, balls, BasketI, BasketJ, nob);
                    gm.printstate(board);
                    List<GameBoard4> states = gm.GetNextState();
                    BFS4 b = new BFS4(board);
                    b.BFS4algo(gm);

                }
                if (levelchoice == 5 || levelchoice == 11 || levelchoice == 14) {
                    GameBoard gm = new GameBoard(board, balli, ballj, BasketI, BasketJ, 1, coini, coinj);
                    List<GameBoard> states = gm.GetNextState();
                    // BFS b = new BFS(board);
                    // b.BFSalgo(gm);

                }
                if (levelchoice == 20) {
                    // GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // List<GameBoard3> states = gm.GetNextState();
                    GameBoard2 gm = new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    gm.printstate(board);

                    List<GameBoard2> states = gm.GetNextState();
                }
                if (levelchoice == 9) {
                    GameBoard2 gm = new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    gm.printstate(board);
                    List<GameBoard2> states = gm.GetNextState();

                    // BFS2 b = new BFS2(board);
                    // b.BFS3algo(gm);
                    // GameBoard4 gm = new GameBoard4(board,balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                } else if (levelchoice == 16) {
                    // GameBoard4 gm = new GameBoard4(board,balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                }
            } else if (Gametype == 1) {
                Checkmove cm = new Checkmove(board, balli, ballj, BasketI, BasketJ);
                cm.printstate();
                String input = "r";
                boolean playing = true;
                while (playing) {
                    System.out.println("Enter your move:");
                    input = scanner.nextLine();
                    switch (input) {

                        case "w":
                            if (cm.isfinal()) {
                                playing = false;
                            } else {
                                cm.NextMove("up");
                                cm.NextMove("up");
                                if (cm.isfinal()) {
                                    cm.NextMove("up");
                                    playing = false;
                                    cm.NextMove("up");

                                }
                                cm.printstate();
                            }
                            break;
                        case "a":
                            cm.NextMove("left");
                            cm.NextMove("left");
                            cm.printstate();
                            break;
                        case "s":
                            if (cm.isfinal()) {
                                playing = false;
                            } else {
                                cm.NextMove("bottom");
                                cm.NextMove("bottom");
                                if (cm.isfinal()) {
                                    playing = false;
                                    cm.NextMove("bottom");
                                }
                                cm.printstate();
                            }

                            break;
                        case "d":
                            cm.NextMove("right");
                            cm.NextMove("right");
                            cm.printstate();
                            break;
                        case "p":
                            cm.printstate();

                        default:
                            break;
                    }

                }

                System.out.println("-------------------------");
            } else if (Gametype == 3) {
                if (levelchoice == 1 || levelchoice == 2 || levelchoice == 3 || levelchoice == 4 || levelchoice == 6
                        || levelchoice == 7 || levelchoice == 12 || levelchoice == 15) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // gm.printstate(board);
                    // List<GameBoard3> states = gm.GetNextState();
                    // BFS3 b = new BFS3(board);
                    // b.BFS3algo(gm);
                    DFS3 d = new DFS3(board);
                    d.DFS3algo(gm);

                }
                if (levelchoice == 5 || levelchoice == 11 || levelchoice == 14) {
                    GameBoard gm = new GameBoard(board, balli, ballj, BasketI, BasketJ, 1, coini, coinj);
                    List<GameBoard> states = gm.GetNextState();
                }
                if (levelchoice == 20) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    gm.printstate(board);
                    List<GameBoard3> states = gm.GetNextState();
                    // GameBoard2 gm=new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // List<GameBoard2> states = gm.GetNextState();
                }
                if (levelchoice == 9) {
                    GameBoard2 gm = new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    gm.printstate(board);
                    List<GameBoard2> states = gm.GetNextState();
                    // BFS2 b = new BFS2(board);
                    // b.BFS3algo(gm);
                }
            } else if (Gametype == 4) {
                if (levelchoice == 1 || levelchoice == 2 || levelchoice == 3 || levelchoice == 4 || levelchoice == 6
                        || levelchoice == 7 || levelchoice == 12 || levelchoice == 15) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // gm.printstate(board);
                    // List<GameBoard3> states = gm.GetNextState();
                    // BFS3 b = new BFS3(board);
                    // b.BFS3algo(gm);
                    // DFS3 d=new DFS3(board);
                    // d.DFS3algo(gm);
                    UCS u = new UCS();
                    // u.ucs(board, gm);

                    int result = u.ucs(board, gm);
                    System.out.println("Result: " + result);

                }
                if (levelchoice == 5 || levelchoice == 11 || levelchoice == 14) {
                    // GameBoard4 gm = new GameBoard4(board, balli, ballj, BasketI, BasketJ, 1, coini, coinj);
                    GameBoard4 gm = new GameBoard4(board, balli, ballj, BasketI, BasketJ, 1);
                    List<GameBoard4> states = gm.GetNextState();
                    
                    // u.ucs(board, gm);

                    // int result = u.ucs(board, gm);
                    // System.out.println("Result: " + result);
                    // BFS b = new BFS(board);
                    // b.BFSalgo(gm);

                }
                if (levelchoice == 20) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    gm.printstate(board);
                    List<GameBoard3> states = gm.GetNextState();
                    // GameBoard2 gm=new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // List<GameBoard2> states = gm.GetNextState();
                }
                if (levelchoice == 9) {
                    // GameBoard2 gm = new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // gm.printstate(board);
                    // List<GameBoard2> states = gm.GetNextState();

                    // BFS2 b = new BFS2(board);
                    // b.BFS3algo(gm);
                    // GameBoard4 gm = new GameBoard4(board, balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                    GameBoard4 gm = new GameBoard4(board, balls, BasketI, BasketJ, nob);
                    gm.printstate(board);
                    List<GameBoard4> states = gm.GetNextState();
                    // u.ucs(board, gm);
                    UCS2 u = new UCS2();
                    int result = u.ucs(board, gm);
                    System.out.println("Result: " + result);
                }
            } else if (Gametype == 5) {
                if (levelchoice == 1 || levelchoice == 2 || levelchoice == 3 || levelchoice == 4 || levelchoice == 6
                        || levelchoice == 7 || levelchoice == 12 || levelchoice == 15) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // gm.printstate(board);
                    // List<GameBoard3> states = gm.GetNextState();
                    // BFS3 b = new BFS3(board);
                    // b.BFS3algo(gm);
                    // DFS3 d=new DFS3(board);
                    // d.DFS3algo(gm);
                    // u.ucs(board, gm);
                    Astar a = new Astar();

                    int result = a.Astar(board, gm);
                    System.out.println("Result: " + result);

                }
                if (levelchoice == 5 || levelchoice == 11 || levelchoice == 14) {
                    GameBoard gm = new GameBoard(board, balli, ballj, BasketI, BasketJ, 1, coini, coinj);
                    List<GameBoard> states = gm.GetNextState();
                    // BFS b = new BFS(board);
                    // b.BFSalgo(gm);

                }
                if (levelchoice == 20) {
                    GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    gm.printstate(board);
                    List<GameBoard3> states = gm.GetNextState();
                    // GameBoard2 gm=new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // List<GameBoard2> states = gm.GetNextState();
                }
                if (levelchoice == 9) {
                    // GameBoard2 gm = new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // gm.printstate(board);
                    // List<GameBoard2> states = gm.GetNextState();

                    // BFS2 b = new BFS2(board);
                    // b.BFS3algo(gm);
                    // GameBoard4 gm = new GameBoard4(board, balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                }
            } else if (Gametype == 6) {
                if (levelchoice == 1 || levelchoice == 2 || levelchoice == 3 || levelchoice == 4 || levelchoice == 6
                        || levelchoice == 7 || levelchoice == 12 || levelchoice == 15) {
                    GameBoard4 gm = new GameBoard4(board, balli, ballj, BasketI, BasketJ, 1);
                    gm.printstate(board);
                    List<GameBoard4> states = gm.GetNextState();

                }
                if (levelchoice == 5 || levelchoice == 11 || levelchoice == 14|| levelchoice == 22) {
                    GameBoard5 gm = new GameBoard5(board,balls, BasketI, BasketJ, coini, coinj,nob);
                    gm.printstate(board);
                    // List<GameBoard5> states = gm.GetNextState();
                    BFS5 b = new BFS5(board);
                    b.BFS5algo(gm);

                }
                if (levelchoice == 20) {
                    // GameBoard3 gm = new GameBoard3(board, balli, ballj, BasketI, BasketJ, 1);
                    // List<GameBoard3> states = gm.GetNextState();
                    // GameBoard2 gm=new GameBoard2(board, nob, balls, BasketI, BasketJ);
                    // gm.printstate(board);
                    // List<GameBoard2> states = gm.GetNextState();
                    GameBoard4 gm = new GameBoard4(board, balli, ballj, BasketI, BasketJ, 1);
                    gm.printstate(board);
                    List<GameBoard4> states = gm.GetNextState();
                }
                if (levelchoice == 9 || levelchoice == 21) {
                    GameBoard4 gm = new GameBoard4(board, balls, BasketI, BasketJ, nob);
                    gm.printstate(board);
                    List<GameBoard4> states = gm.GetNextState();
                    BFS4 b = new BFS4(board);
                    b.BFS4algo(gm);
                    // GameBoard4 gm = new GameBoard4(board,balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                } else if (levelchoice == 16) {
                    // GameBoard4 gm = new GameBoard4(board,balls, BasketI, BasketJ,nob);
                    // gm.printstate(board);
                    // List<GameBoard4> states = gm.GetNextState();
                }
            }

            // }
            // gm.BFS(gm);
            // BFS b=new BFS(board);
            // b.BFSalgo(gm);
            // // states.forEach((state) -> System.out.println(state));
            // for ( int k : states.forEach(null);) {

            // }
            // gm.printboardstate(states);
            // for (GameBoard state : states) {
            // int[][] boardstate = state.board;

            // // Print the board array
            // for (int i = 0; i < boardstate.length; i++) {
            // for (int j = 0; j < boardstate[0].length; j++) {
            // System.out.print(boardstate[i][j] + " ");
            // }
            // System.out.println();
            // }

            // System.out.println(); // Add a new line between each board
            // }

        }

    }
}
