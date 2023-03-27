package eu.senla.task4;

public class Matrix {

    private static String[][] matrix;

    public Matrix(int matrixSize, int elementSize) {
        matrix = new String[matrixSize][matrixSize];

        int counter = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (counter++ % 3 == 0) {
                    matrix[i][j] = Double.toString(Math.random()).substring(0, elementSize);
                } else {
                    matrix[i][j] = StringUtil.getRandomString(elementSize);

                }
                counter++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public String[] getMain() {
        String[] result = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public String[] getNotMain(){
        String[] result = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][matrix.length-i-1];
        }
        return result;
    }
}

