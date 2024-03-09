public class Level {
    int levelchoice = 0;
    int[][] level1 = new int[][] { //
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 2, 0, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1 },
            { 1, 1, 0, 1, 0, 1, 1, 0, 3, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 }
    };
    int[][] level2 = new int[][] { //
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 3, 1 },
            { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 2, 1, 0, 0, 0, 1 },
            { 1, 1, 0, 1, 0, 1, 1, 0, 0, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 }
    };
    int[][] leveltest = new int[][] { //
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 2, 0, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1 },
            { 1, 1, 0, 1, 0, 1, 1, 0, 0, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 3, 1 },
            { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 }
    };
    int[][] leveltest2 = new int[][] { //
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 2, 1 },
            { 1, 0, 0, 0, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1 },
            { 1, 1, 0, 1, 0, 1, 1, 0, 0, 1 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 3, 1 },
            { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 }
    };
    int[][] leveltest3 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 2, 0, 1 },
            { 1, 0, 1, 0, 1 },
            { 1, 0, 0, 3, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] leveltest4 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 2, 1, 1 },
            { 1, 2, 1, 0, 1 },
            { 1, 2, 0, 3, 1 },
            { 1, 1, 1, 1, 1 },

    };
    // int[][] gamelevel = new int[][] { //
    // {1,1,1,1,1},
    // {1,0,0,0,1},
    // {1,0,0,0,1},
    // {1,0,0,0,1},
    // {1,1,1,1,1},

    // };
    int[][] gamelevel1 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 2, 0, 1 },
            { 1, 0, 0, 0, 1 },
            { 1, 0, 3, 0, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel2 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 0, 1, 1 },
            { 1, 2, 0, 3, 1 },
            { 1, 1, 0, 0, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel3 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 1, 3, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 1, 1, 2, 0, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel4 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 1, 0, 0, 1 },
            { 1, 2, 1, 3, 1 },
            { 1, 0, 0, 0, 1 },
            { 1, 1, 1, 1, 1 },

    };
    // coin
    int[][] gamelevel5 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 1 },
            { 1, 4, 1, 3, 1 },
            { 1, 0, 0, 1, 1 },
            { 1, 1, 0, 2, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel6 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 1, 0, 1 },
            { 1, 3, 0, 0, 1 },
            { 1, 1, 2, 1, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel7 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 1, 0, 0, 3, 1 },
            { 1, 0, 2, 1, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel8 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 0, 1, 3, 1 },
            { 1, 0, 2, 0, 1 },
            { 1, 4, 1, 0, 1 },
            { 1, 0, 2, 0, 1 },
            { 1, 1, 1, 1, 1 },

    };

    int[][] gamelevel9 = new int[][] { //
            { 1, 1, 1, 1, 1 },
            { 1, 3, 1, 0, 1 },
            { 1, 2, 2, 2, 1 },
            { 1, 1, 0, 0, 1 },
            { 1, 1, 0, 1, 1 },
            { 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel10 = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 1, 3, 0, 1, 1 },
            { 1, 2, 1, 0, 0, 1 },
            { 1, 4, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 2, 1 },
            { 1, 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel11 = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 4, 0, 1 },
            { 1, 1, 3, 2, 1, 1 },
            { 1, 0, 0, 1, 0, 1 },
            { 1, 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel12 = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 3, 1, 1, 2, 1 },
            { 1, 0, 1, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 1 },
            { 1, 1, 0, 0, 1, 1 },
            { 1, 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel14 = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 1, 1 },
            { 1, 3, 1, 0, 2, 1 },
            { 1, 0, 1, 0, 4, 1 },
            { 1, 0, 0, 0, 1, 1 },
            { 1, 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel15 = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 2, 0, 1, 1, 1 },
            { 1, 1, 0, 0, 0, 1 },
            { 1, 1, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 3, 1 },
            { 1, 1, 1, 1, 1, 1 },

    };
    int[][] gamelevel2test = new int[][] { //
            { 1, 1, 1, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1 },
            { 1, 3, 1, 0, 0, 1 },
            { 1, 2, 1, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 1, },

    };
//     int[][] gamelevel2test = new int[][] { //
//         { 1, 1, 1, 1, 1 },
//         { 1, 1, 0, 1, 1 },
//         { 1, 1, 3, 1, 1 },
//         { 1, 1, 2, 1, 1 },
//         { 1, 1, 1, 1, 1 },

// };
int[][] leveltest42 = new int[][] { //
    {1,1,1,1,1},
    {1,0,2,1,1},
    {1,2,1,0,1},
    {1,2,0,3,1},
    {1,1,1,1,1},
 
 };
 int[][] gamelevel9test = new int[][] { //
    { 1, 1, 1, 1, 1 },
    { 1, 3, 1, 0, 1 },
    { 1, 2, 2, 0, 1 },
    { 1, 1, 0, 0, 1 },
    { 1, 1, 0, 2, 1 },
    { 1, 1, 1, 1, 1 },

};
int[][] gamelevel5test = new int[][] { //
    { 1, 1, 1, 1, 1 },
    { 1, 0, 0, 4, 1 },
    { 1, 0, 1, 3, 1 },
    { 1, 0, 0, 1, 1 },
    { 1, 1, 0, 2, 1 },
    { 1, 1, 1, 1, 1 },

};


    public Level(int levelchoice) {
        this.levelchoice = levelchoice;
    }

    // public int[][] Setlevel() {
    // if (levelchoice == 1) {
    // return level1;
    // } else if (levelchoice == 2) {
    // return level2;
    // }
    // else if (levelchoice == 3) {
    // return leveltest;
    // }
    // else if (levelchoice == 4) {
    // return leveltest2;
    // }
    // else if (levelchoice == 5) {
    // return leveltest3;
    // }
    // else if (levelchoice == 6) {
    // return leveltest4;
    // }
    // return level1;

    public int[][] Setlevel() {
        if (levelchoice == 1) {
            return gamelevel1;
        } else if (levelchoice == 2) {
            return gamelevel2;
        } else if (levelchoice == 3) {
            return gamelevel3;
        } else if (levelchoice == 4) {
            return gamelevel4;
        } else if (levelchoice == 5) {
            return gamelevel5;
        } else if (levelchoice == 6) {
            return gamelevel6;
        } else if (levelchoice == 7) {
            return gamelevel7;
        } else if (levelchoice == 8) {
            return gamelevel8;
        } else if (levelchoice == 9) {
            return gamelevel9;
        } else if (levelchoice == 10) {
            return gamelevel10;
        } else if (levelchoice == 11) {
            return gamelevel11;
        } else if (levelchoice == 12) {
            return gamelevel12;
        } else if (levelchoice == 13) {
            // return gamelevel13;
            return gamelevel12;
        } else if (levelchoice == 14) {
            return gamelevel14;
        } else if (levelchoice == 15) {
            return gamelevel15;
        } else if (levelchoice == 16) {
            return leveltest4;
        } else if (levelchoice == 20) {
            return gamelevel2test;
        }
        else if (levelchoice == 21) {
            return gamelevel9test;
        }
        else if (levelchoice == 22) {
            return gamelevel5test;
        }
    


        return level1;
    }
}
