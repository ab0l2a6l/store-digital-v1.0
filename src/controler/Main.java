package controler;

import common.StaticScanner;
import model.entity.Digital;
import model.repository.DigitalDAO;
import view.DigitalView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        Digital digital = new Digital();
        digital.setStoreWare(input.nextLine());

        DigitalDAO digitalDAO = new DigitalDAO();
        digitalDAO.pickDigitalToSave(digital);
        digitalDAO.save();

        digitalDAO.goToDigitalView();
    }
}
