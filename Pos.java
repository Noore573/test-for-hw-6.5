public class Pos {
    int x;
    int y;
    int i;
    int j;
    int ci;
    int cj;
    
    public Pos(int x, int y,int i,int j,int ci,int cj) {
        this.x = x;
        this.y = y;
        this.i=i;
        this.j=j;
        this.ci=ci;
        this.cj=cj;

    }
    public Pos(int x, int y,int i,int j) {
        this.x = x;
        this.y = y;
        this.i=i;
        this.j=j;

    }
    int [][]ballsxys;
    // int i;
    // int j;
    public Pos(int[][] ballsxys, int i, int j) {
        this.ballsxys = ballsxys;
        this.i = i;
        this.j = j;
    }
    public Pos(int[][] ballsxys, int i, int j,int ci,int cj) {
        this.ballsxys = ballsxys;
        this.i = i;
        this.j = j;
        this.ci=ci;
        this.cj=cj;
    }
    
    
    
    
}
