package eu.senla.task1;

import eu.senla.task1.core.Rainbow;

import java.util.Scanner;

public class Main {

    //static int mainValue=3;


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер цвета: ");
        String num = in.nextLine();
        System.out.println("Если вы хотите вывести одиночный цвет введите 1");
        int t = in.nextInt();
        Rainbow Color = new Rainbow();
        if (t != 1) {
            //Rainbow doubleColor = new Rainbow();
            System.out.println(Color.DoubleColor(num));
        } else {
                //Rainbow oneColor = new Rainbow();
                System.out.println(Color.Color(num));
            }
        }

    }




