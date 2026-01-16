public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];

        // Transpose logic
        

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
       	for (int i = 0; i < T.length; i++) {
		for (int j = 0; i < T[0].length; j++) {
			System.out.print(T[i][j] + " ");
		};
		System.out.println();
	};
    };
}
