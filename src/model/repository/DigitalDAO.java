package model.repository;

import model.entity.Digital;

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
}