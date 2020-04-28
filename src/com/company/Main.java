package com.company;

import com.company.factory.Creator;
import com.company.factory.ProductADialog;
import com.company.factory.ProductBDialog;

import java.util.Scanner;

public class Main {
    private static Creator creator;

    public static void main(String[] args) {
        configure();
        run();

    }


    static void configure() {

        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Podaj 1 dla produktu A, Podaj 0 dla produktu B");
        a = scan.nextInt();
        if (a == 1) {
            creator = new ProductADialog();
        } else {
            creator = new ProductBDialog();
        }
    }




    static void run(){
        creator.doMath();
    }

}
