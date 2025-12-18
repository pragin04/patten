public class HollowHourGlass {
    public static void main(String[] args) {
        int n = 3;

        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print(i==n||i==1||j==1||j==2*i-1?"* ":"  ");
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= 2*i-1; j++) 
                System.out.print(i==n||j==1||j==2*i-1?"* ":"  ");
            System.out.println();
        }
    }
}
