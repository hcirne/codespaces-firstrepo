public class InvertedDiamond {
    public static void main(String[] args) {

        int width = 15;
        int heigth = 5;

        // leftStars + gap + rightStars = 15
        //gap = 15 - (2 × stars)

        // top half
        for (int stars = heigth; stars > 0; stars--){
            
            int gap = width - (2 * stars);

            // print left side
            for (int i = 0; i < stars; i++){
                System.out.print("*");
            }
            
            // print gap
            for (int i = 0; i < gap; i++) {
                System.out.print(" ");
            }

            // print right side
            for (int i = 0; i < stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //bottom half
        for (int stars = 1; stars <= heigth; stars++) {

            int gap = width - (2 * stars);

            // print left side
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            
            // print gap
            for (int j = 0; j < gap; j++) {
                System.out.print(" ");
            }

            // print right side
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
