public class MatrixOperations {
    public static void main(String[] args) {
        try {
            char[][] B = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'j', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
            };
            char[][] C = transposeMatrix(B);
            System.out.println("Матриця C (транспонована матриця B):");
            printMatrix(C);
            int sumEvenRows = 0; 
            int sumOddRows = 0; 

            for (int i = 0; i < C.length; i++) {
                char[] row = C[i];
                char extremeValue = row[0];
            
                for (char element : row) {
                    if ((i + 1) % 2 == 0) {
                        if (element > extremeValue) {
                            extremeValue = element;
                        }
                    } else {
                        if (element < extremeValue) {
                            extremeValue = element;
                        }
                    }
                }
                
                if ((i + 1) % 2 == 0) {
                    sumEvenRows += extremeValue;
                } else {
                    sumOddRows += extremeValue;
                }
            }


            System.out.println("Сума найбільших елементів в парних рядках: " + sumEvenRows);
            System.out.println("Сума найменших елементів в непарних рядках: " + sumOddRows);

        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static char[][] transposeMatrix(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        char[][] transposed = new char[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
