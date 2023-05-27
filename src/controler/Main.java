package controler;

import common.StaticScanner;
import model.service.DigitalService;

import java.util.Scanner;

public class Main {
    static DigitalService digitalService = new DigitalService();
    public static void mainForSave(String[] args) {
        Scanner input = StaticScanner.getData();

        DigitalService digitalService = new DigitalService();
        digitalService.digitalService(input.nextLine());


    }


    public static void mainForRead(String[] args) {
        System.out.println("Show data saved in DB: " + digitalService.getListFromDAO().toString());
    }


}