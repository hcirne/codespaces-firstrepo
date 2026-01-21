public class SideBySide {
    public static void main(String[] args) {
        int width = 15;
        int height = 6;

        // increase part
        for (int c = 1; c <= height; c++) {
            int gap = width - (2 * c);

            // print left side
            for (int i = 0; i < c; i++) {
                System.out.print("x");
            }

            // print gap
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }
            
            // print right side
            for (int i = 0; i < c; i++) {
                System.out.print("o");
            }
            System.out.println();
        }

        // decrease part
        for (int c = height - 1; c > 0; c--) {

            int gap = width - (2 * c);

            for (int i = 0; i < c; i++){
                System.out.print("*");
            }
            
            // print gap
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }

            // print right side
            for (int i = 0; i < c; i++){
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
