package controler;

import common.StaticScanner;
import model.Service;

import java.util.Scanner;

public class Main {
    static Service service = new Service();
    public static void mainForSave(String[] args) {
        Scanner input = StaticScanner.getData();

        Service service = new Service();
        service.digitalService(input.nextLine());


    }


    public static void mainForRead(String[] args) {
        System.out.println("Show data saved in DB: " + service.getListFromDAO().toString());
    }


}