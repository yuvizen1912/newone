import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int stars;

            if (i <= mid)
                stars = 2 * i + 1;         
            else
                stars = 2 * (n - i) - 1;    

            int spaces = Math.abs(mid - i);

            for (int s = 0; s < spaces; s++)
                System.out.print("   ");

            for (int j = 0; j < stars; j++)
                System.out.print("*  ");

            System.out.println();
        }

        sc.close();
    }
}