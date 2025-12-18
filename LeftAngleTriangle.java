import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= i; j++) {    // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
