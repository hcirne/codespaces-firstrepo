public class ChristmasTree {
    public static void main(String[] args) {

        int tree_width = 9;

        // top part of tree
        int t_height = 5;

        for (int i = 1; i <= t_height; i++) {
            for (int j = 0; j <= tree_width; j++) {
                if (j > tree_width/2 - i && j < tree_width/2 + i)
                    System.out.print("+");
                else 
                    System.out.print(" ");
                }
            System.out.println();
        }

        int b_height = 2;

        for (int i = 1; i <= b_height; i++) {
            for (int j = 0; j <= tree_width; j++) {
                if (j > 2 && j < 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
