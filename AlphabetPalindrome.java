public class AlphabetPalindrome {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (char ch = (char)('A'+i); ch >= 'A'; ch--)
                System.out.print(ch);
            for (char ch = 'B'; ch <= 'A'+i; ch++)
                System.out.print(ch);
            System.out.println();
        }
    }
}
