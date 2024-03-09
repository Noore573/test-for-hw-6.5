// import java.util.Scanner;
public class Checkmove  {
    private static int map[][];
    private static int playerI;
    private static int playerJ;
    private static int BasketI;
    private static int BasketJ;
    private static int coini;
    private static int coinj;

    public Checkmove(int[][] level, int playerI, int playerJ,int BasketI,int BasketJ) {
        this.map = level;
        this.playerI = playerI;
        this.playerJ = playerJ;
        this.BasketI=BasketI;
        this.BasketJ=BasketJ;
        
    }
   
    public  boolean MoveLeft() {
        if (CheckMoveLeft()) {
            int temp = map[playerI][playerJ - 1];
            map[playerI][playerJ - 1] = map[playerI][playerJ];
            map[playerI][playerJ] = temp;
            playerJ = playerJ - 1;
            return true;
        } else {
            return false;
        }
    }
    public boolean MoveRight() {
        if (CheckMoveRight()) {
            int temp = map[playerI][playerJ + 1];
            map[playerI][playerJ + 1] = map[playerI][playerJ];
            map[playerI][playerJ] = temp;
            this.playerJ = playerJ + 1;
            return true;
        } else {
            return false;
        }
    }
    public boolean MoveUp() {
        if (CheckMoveUp()) {
            int temp = map[playerI - 1][playerJ];
            map[playerI - 1][playerJ] = map[playerI][playerJ];
            map[playerI][playerJ] = temp;
            playerI=playerI-1;
            return true;
        } else {
            return false;
        }
    }
    public boolean MoveBottom() {
        if (CheckMoveBottom()) {
            int temp = map[playerI + 1][playerJ];
            map[playerI + 1][playerJ] = map[playerI][playerJ];
            map[playerI][playerJ] = temp;
            this.playerI=playerI+1;
            return true;
        } else {
            return false;
        }
    }
    
    public  boolean MoveLeftBasket() {
        if (CheckMoveLeftBasket()) {
            int temp = map[BasketI][BasketJ - 1];
            map[BasketI][BasketJ - 1] = map[BasketI][BasketJ];
            map[BasketI][BasketJ] = temp;
            BasketJ = BasketJ - 1;
            return true;
        } else {
            return false;
        }
    }
    public  boolean MoveRightBasket() {
        if (CheckMoveRightBasket()) {
            int temp = map[BasketI][BasketJ + 1];
            map[BasketI][BasketJ + 1] = map[BasketI][BasketJ];
            map[BasketI][BasketJ] = temp;
            BasketJ = BasketJ + 1;
            return true;
        } else {
            return false;
        }
    }
    public  boolean MoveUpBasket() {
        if (CheckMoveUpBasket()) {
            int temp = map[BasketI-1][BasketJ ];
            map[BasketI-1][BasketJ] = map[BasketI][BasketJ];
            map[BasketI][BasketJ] = temp;
            BasketI=BasketI-1;
            return true;
        } else {
            return false;
        }
    }
    public  boolean MoveBottomBasket() {
        if (CheckMoveBottomBasket()) {
            int temp = map[BasketI+1][BasketJ ];
            map[BasketI+1][BasketJ] = map[BasketI][BasketJ];
            map[BasketI][BasketJ] = temp;
            BasketI=BasketI+1;
            return true;
        } else {
            return false;
        }
    }

    public static boolean CheckMoveLeft() {
        if (map[playerI][playerJ - 1] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CheckMoveRight() {
        if (map[playerI][playerJ + 1] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CheckMoveUp() {
        if (map[playerI - 1][playerJ] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CheckMoveBottom() {
        if (map[playerI + 1][playerJ] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckMoveLeftBasket() {
        if (map[BasketI][BasketJ - 1] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckMoveRightBasket() {
        if (map[BasketI][BasketJ + 1] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckMoveUpBasket() {
        if (map[BasketI-1][BasketJ] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean CheckMoveBottomBasket() {
        if (map[BasketI+1][BasketJ] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isfinal(){
      if(map[playerI][playerJ]==map[BasketI-1][BasketJ]){
        System.out.println("You did it!");
        map[playerI][playerJ]=0;
        // printstate();
        return true;
      }
      else{
        return false;

      }
    }
    public void printstate(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(" "+map[i][j]+" ");
            }
            System.out.println();

        }
    }
    public void printstate(int [][]map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(" "+map[i][j]+" ");
            }
            System.out.println();

        }
    }
    public  void NextMove(String choice){
       
        switch (choice) {
            case "up":
            while (CheckMoveUpBasket()) {
                MoveUpBasket();   
            }
            while (CheckMoveUp()) {
                MoveUp(); 
            }
           
            break;
            case "bottom":
            while (CheckMoveBottom()) {
                MoveBottom();
            }
            while (CheckMoveBottomBasket()) {
                MoveBottomBasket();
            }
            break;
            case "right":
            while (CheckMoveRight()) {
                MoveRight(); 
            }
            while (CheckMoveRightBasket()) {
                MoveRightBasket();
            }
                break;
            case "left":
            while (CheckMoveLeft()) {
                MoveLeft(); 
            }
            while (CheckMoveLeftBasket()) {
                MoveLeftBasket();
            }
                break;
        
            default:
                break;
        }
    }
    // public boolean isEqual(int [][]first,int [][]sec){
    //       for (int i = 0; i < first.length; i++) {
    //         for (int j = 0; j < first.length; j++) {
    //             if(first[i][j]!=sec[i][j]){
    //                 return false;
    //             }
                
    //         }
    //       }
    //     return false;
    //     }
       


}

