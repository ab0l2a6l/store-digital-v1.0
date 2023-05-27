package controler;

import common.StaticScanner;
import model.entity.Digital;
import model.repository.DigitalDAO;
import view.DigitalView;

import javax.swing.text.View;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        Digital digital = new Digital();
        digital.setStoreWare(input.nextLine());

        DigitalDAO digitalDAO = new DigitalDAO();
        digitalDAO.pickDigitalToSave(digital);
        digitalDAO.save();

        DigitalView.showDetail(digitalDAO.getDigitals());
    }
}
