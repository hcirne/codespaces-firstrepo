public class CheckeredBoard {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == j % 2) {
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }
            System.out.println();
        }
    }
}