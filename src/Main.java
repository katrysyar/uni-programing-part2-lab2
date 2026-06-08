public class Main {public static void main(String[] args) {
    int a = 3;

    int[][] B = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    try {
        if (B == null || B.length == 0 || B[0].length == 0) {
            System.out.println("Матриця порожня");
            return;
        }

        int rows = B.length;
        int cols = B[0].length;

        int[][] C = new int[rows][cols];

        long sum = 0;
        int count = 0;

        System.out.println("Результуюча матриця C = a * B:");

        for (int i = 0; i < rows; i++) {
            if (B[i] == null || B[i].length != cols) {
                System.out.println("Матриця має бути прямокутною.");
                return;
            }

            for (int j = 0; j < cols; j++) {
                C[i][j] = a * B[i][j];
                System.out.print(C[i][j] + "\t");

                sum += C[i][j];
                count++;
            }
            System.out.println();
        }

        double average = (double) sum / count;

        System.out.println("\nСереднє значення елементів матриці C: " + average);

    } catch (Exception e) {
        System.out.println("Помилка: " + e.getMessage());
    }
}
}
