package eu.senla.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String array[][] = new String[4][4];
        String m[] = new String[8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){

                Scanner in = new Scanner(System.in);
                System.out.println("введите элемент матрицы " + i + j);
                array[i][j] = in.nextLine();
            }
        }

        int p = 0;
        for (int i = 0; i < array.length; i++){

                if (array[i][i].equals(array[i][array.length -1 - i])){
                    m[i] = array[i][i];
                    m[m.length-1] = array[i][array.length -1 - i];
                    p = 0;
                }else {
                    p = 1;
                }
        }

        if (p == 1){
            System.out.println("Диагонали не равны");
        } else {
            System.out.println("Диагонали равны");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "      ");

            }
            System.out.println();
        }
            }


    }

