package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int x = 100;
        int y = 200;
        int z = 300;

        switch (number) {
            case 100:  System.out.print("Данное значение имеется в константах");
                break;
            case 200:  System.out.print("Данное значение имеется в константах");
                break;
            case 300:  System.out.print("Данное значение имеется в константах");
                break;
            default:  System.out.print("Такой константы нет!");
                break;
        }
        in.close();
    }
}