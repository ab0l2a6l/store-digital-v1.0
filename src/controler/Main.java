package controler;

import common.StaticScanner;
import model.entity.Digital;
import model.repository.DigitalDAO;
import model.repository.InterfaceDAO;
import view.DigitalView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        Digital digital = new Digital();
        digital.setStoreWare(input.nextLine());

        DigitalDAO digitalDAO = new DigitalDAO();
        digitalDAO.setDigitalToSave(digital);
        digitalDAO.save();

        DigitalView.showDetail(digitalDAO.getDigitals());
    }
}