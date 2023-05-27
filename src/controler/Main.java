package controler;

import common.StaticScanner;
import model.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        Service service = new Service();
        service.digitalService(input.nextLine());

    }
}