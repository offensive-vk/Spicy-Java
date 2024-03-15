public class LoopExamples {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k < 5);

        // Enhanced For Loop (For-Each Loop)
        System.out.println("\nEnhanced For Loop (For-Each Loop):");
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println("Element: " + num);
        }

        // Nested Loop (For Loop)
        System.out.println("\nNested Loop (For Loop):");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("Iteration " + m + "-" + n);
            }
        }
    }
}
