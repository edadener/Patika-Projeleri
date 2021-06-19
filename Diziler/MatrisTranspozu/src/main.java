import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        int m, n, c, d;

        Scanner inp = new Scanner(System.in);
        System.out.println("Matrisin satir ve sutun sayilarini girin");
        m = inp.nextInt();
        n = inp.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Matrisin elemanlarını girin");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                matrix[c][d] = inp.nextInt();

        int transpose[][] = new int[n][m];
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];

        System.out.println("Matrisin tersi:");

        for (c = 0; c < n; c++)
        {
            for (d = 0; d < m; d++)
                System.out.print(transpose[c][d]+"\t");

            System.out.print("\n");
        }
    }
}

