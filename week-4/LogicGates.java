public class LogicGates {
    public static void main(String[] args) {
        
        // AND gate
        for (int a = 1; a >= 0; a--) {
            for (int b = 1; b >= 0; b--) {
                System.out.print(a);
                System.out.print(b);
                System.out.println((a == 1 && b == 1) ? 1 : 0);        
            }
        }
    }
}