package view;

import common.StaticScanner;
import controler.DigitalController;
import model.service.DigitalService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        DigitalController digitalController = new DigitalController();

        for (; ; ) {
            System.out.println("1.insert\n2.show list");
            int requestForInsertOrShowList = input.nextInt();
            switch (requestForInsertOrShowList) {
                case 1 -> {
                    System.out.println("insert: ");
                    digitalController.insertDataToDB();
                }

                case 2 -> {
                    System.out.println("Show data saved in DB: " + digitalController.showDB().toString());
                }
            }
        }
    }
}