public class LogicGates {
    public static void main(String[] args) {
        
        // AND gate
        System.out.println("This is the logic gate for AND: ");
        for (int a = 1; a >= 0; a--) {
            for (int b = 1; b >= 0; b--) {
                System.out.print(a);
                System.out.print(b);
                System.out.println((a == 1 && b == 1) ? 1 : 0);        
            }
        }
        System.out.println();

        // OR gate
        System.out.println("This is the logic gate for OR: ");
        for (int a = 1; a >= 0; a--) {
            for (int b = 1; b >= 0; b--) {
                System.out.print(a);
                System.out.print(b);
                System.out.println((a == 1 || b == 1) ? 1 : 0);
            }
        }
        System.out.println();

        // NOT Gate
        // NAND Gate
        // NOR Gate
        // XOR Gate
        // XNOR Gate
    }
}