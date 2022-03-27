import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        boolean found = false;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    int count = 0;
                    while (matrix[i][j] == 0 && count != k && j < m && !found) {
                        count++;
                        if (j + 1 < m) {
                            j++;
                        } else {
                            break;
                        }

                    }

                    if (count == k) {
                        System.out.println(i + 1);
                        found = true;
                        break;

                    }
                }

            }
        }

        if (!found) {
            System.out.println(0);
        }


    }
}