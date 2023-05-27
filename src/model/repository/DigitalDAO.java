package model.repository;

import model.entity.Digital;
import view.DigitalView;

import java.util.ArrayList;
import java.util.List;

public class DigitalDAO implements InterfaceDAO {
    List<Digital> digitals = new ArrayList<>();
    Digital digital;

    @Override
    public void save() {
        digitals.add(digital);
    }

    public void pickDigitalToSave(Digital digital) {
        this.digital = digital;
    }

    public void goToDigitalView(){
        new DigitalView().showDetail(digitals);
    }
}