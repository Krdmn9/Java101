import java.util.*;

public class MineSweeper {
    int col;
    int row;
    int[][] map;
    MineSweeper(int row, int col) {
        this.col = col;
        this.row = row;
        this.map = new int[row][col];
    }
    void mayinDiz() {
        Random r = new Random();
        int mineNumber = this.row*this.col/4;
        while(mineNumber != 0) {
            int mineRow = r.nextInt(row);
            int mineCol = r.nextInt(col);
            if(this.map[mineRow][mineCol] == 0) {
                this.map[mineRow][mineCol] = -1;
                mineNumber--;
            }
        }
    }
    boolean isWon() {
        boolean isWon = true;
        for(int i = 0; i<this.row;i++) {
            for (int k = 0; k< this.col;k++) {
                if (this.map[i][k] < -1) {
                    isWon = false;
                    break;
                }
            }
        }
        if (isWon) {
            System.out.println("Tebrikler Kazandınız!");
        }
        return isWon;
    }
    void run() {
        mayinDiz();
        for(int i = 0; i<row; i++)  {
            for(int k = 0; k<col; k++) {
                if (this.map[i][k] != -1 ) {
                    this.map[i][k] = -5;
                }
            }
        }
        System.out.println("MAYINLARIN KONUMU: ");
        printMapOpen();
        Scanner scan = new Scanner(System.in);
        int gamerRow,gamerCol;
        while (true) {
            System.out.println("==============");
            printMapClose();
            if (isWon())
                break;
            System.out.print("Satır Giriniz: ");
            gamerRow = scan.nextInt();
            System.out.print("Sütun Giriniz: ");
            gamerCol = scan.nextInt();
            if ( (gamerRow >= 0 && gamerRow < this.row)  && (gamerCol>=0 && gamerCol < this.col) ) {
                if (this.map[gamerRow][gamerCol] == -1) {
                    System.out.println("Mayına bastınız!");
                    break;
                }
                else {
                    this.map[gamerRow][gamerCol] = mineCounter(gamerRow,gamerCol);
                }
            }
            else {
                System.out.println("Belirttiğiniz nokta haritada mevcut değil.");
            }
        }
    }
    int mineCounter(int gamerRow, int gamerCol) {
        int numOfMine = 0;
        if (checkSag(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkSagAlt(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkAlt(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkSolAlt(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkSol(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkSagUst(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkUst(gamerRow,gamerCol)) {
            numOfMine++;
        }
        if (checkSolUst(gamerRow,gamerCol)) {
            numOfMine++;
        }
        return numOfMine;
    }
    boolean checkSag(int gamerRow, int gamerCol) {
        if (gamerCol+1 < this.col)
            return this.map[gamerRow][gamerCol + 1] == -1;
        return false;
    }
    boolean checkSagAlt(int gamerRow, int gamerCol) {
        if (gamerRow+1 < this.row && gamerCol+1 < this.col)
            return this.map[gamerRow + 1][gamerCol + 1] == -1;
        return false;
    }
    boolean checkAlt(int gamerRow, int gamerCol) {
        if (gamerRow+1 < this.row)
            return this.map[gamerRow + 1][gamerCol] == -1;
        return false;
    }
    boolean checkSolAlt(int gamerRow, int gamerCol) {
        if (gamerRow+1 < this.row && gamerCol-1 >= 0) {
            return this.map[gamerRow + 1][gamerCol - 1] == -1;
        }
        return false;
    }
    boolean checkSol(int gamerRow, int gamerCol) {
        if (gamerCol-1 >= 0) {
            return this.map[gamerRow][gamerCol - 1] == -1;
        }
        return false;
    }
    boolean checkSagUst(int gamerRow, int gamerCol) {
        if (gamerRow-1 >= 0 && gamerCol+1 < this.col) {
            return this.map[gamerRow - 1][gamerCol + 1] == -1;
        }
        return false;
    }
    boolean checkUst(int gamerRow, int gamerCol) {
        if (gamerRow-1 >= 0)
            return this.map[gamerRow - 1][gamerCol] == -1;
        return false;
    }
    boolean checkSolUst(int gamerRow, int gamerCol) {
        if ((gamerRow-1 > 0) && (gamerCol-1> 0))
            return this.map[gamerRow - 1][gamerCol - 1] == -1;
        return false;
    }
    void printMapOpen() {
        for(int i=0; i<row;i++) {
            for(int k = 0; k<col;k++) {
                if (map[i][k] == -5) {
                    System.out.print("-" + " ");
                }
                else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
    void printMapClose() {
        for(int i=0; i<row;i++) {
            for(int k = 0; k<col;k++) {
                if (this.map[i][k] >= 0) {
                    System.out.print(this.map[i][k] + " ");
                }
                else {
                    System.out.print("-" + " ");
                }
            }
            System.out.println();
        }
    }
}
