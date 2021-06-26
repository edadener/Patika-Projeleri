import java.util.Random;
import java.util.Scanner;

   class mineField {

    Scanner inp = new Scanner(System.in);

    public void begin() {
        System.out.print("Satır sayısını giriniz : ");
        int row = inp.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int col = inp.nextInt();
        int mineCount = (row * col) / 4;
        field(row, col, mineCount);
    }

    public void field(int row, int col, int mineCount) {
        String[][] matrix = new String[row][col];
        int[] rndArr;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = "-";
            }
        }
        for (int i = 0; i < mineCount; i++) {
            do {
                rndArr = mine(row, col);

            } while (matrix[rndArr[0]][rndArr[1]].equals("*"));
            matrix[rndArr[0]][rndArr[1]] = "*";
        }

        System.out.println("Mayınların konumu");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        line();
        play(matrix, row, col);

    }

    public int[] mine(int row, int col) {
        Random rnd = new Random();
        int[] mineLoca = {rnd.nextInt(row), rnd.nextInt(col)};
        return mineLoca;
    }

    public void line() {
        System.out.println("==========================");
    }

    public void play(String[][] matrix, int row, int col) {
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        String[][] gizliMatrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gizliMatrix[i][j] = "-";
            }
        }
        boolean status = true;
        int count = 0;
        int r, c, info = 0;
        do {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(gizliMatrix[i][j] + " ");
                }
                System.out.print("\n");
            }
            do {
                System.out.print("Satır Giriniz : ");
                r = inp.nextInt();
                System.out.print("Sutun Giriniz : ");
                c = inp.nextInt();
                if (r >= row || c >= col) {
                    System.out.println("Satır veya sutun sayısından buyuk sayı girmeyiniz. Tekrar deneyin..");
                }
            } while (r >= row || c >= col);

            if (matrix[r][c].equals("*")) {
                System.out.println("Game over!");
                status = false;
            } else {
                info = 0;
                if (r - 1 >= 0) {
                    if (matrix[r - 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c - 1 >= 0) {
                    if (matrix[r - 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c - 1 >= 0) {
                    if (matrix[r][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < col) {
                    if (matrix[r][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < col && r + 1 < row) {
                    if (matrix[r + 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < row) {
                    if (matrix[r + 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c + 1 < col) {
                    if (matrix[r - 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < row && c - 1 >= 0) {
                    if (matrix[r + 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                gizliMatrix[r][c] = String.valueOf(info);
                count++;
            }
            line();
        } while (status && count < (row * col) - ((row * col) / 4));
        if (status) {
            System.out.println("Tebrikler!! Kazandınız..");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (gizliMatrix[i][j].equals("-")) {
                        System.out.print("* ");
                    } else {
                        System.out.print(gizliMatrix[i][j] + " ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
public class main {
    public static void main(String[] args) {
        mineField game = new mineField();
        game.begin();
    }
}