package eu.senla.task4;

public class Main {

    public static final int MATRIX_SIZE = 10;
    public static final int ELEMENT_SIZE = 6;

    public static void main(String[] args) {

        Matrix matrix = new Matrix(MATRIX_SIZE, ELEMENT_SIZE);
        System.out.println(matrix);

        StringBuilder stringBuilder = new StringBuilder();
        String[] mainDiag = matrix.getMain();
        Double[] arr = new Double[34];
        int k = 0;
        int len = 0;
        for (int i = 0; i < mainDiag.length; i++){
            if (StringUtil.isNumber(mainDiag[i])){
                Double value = Double.parseDouble(mainDiag[i]);
                if (value >= 1.7) {
                    value = Math.ceil(value);
                    len++;
                }else{
                    value = Math.floor(value);
                    len++;
                }
                arr[k++] = value;
            } else{
                stringBuilder.append(mainDiag[i].substring(1, 4));
                stringBuilder.append(", ");
            }

        }
        System.out.println(stringBuilder.toString());
        for (int i = 0; i < len; i++){
            System.out.print(arr[i]+"_");

        }
    }
}
