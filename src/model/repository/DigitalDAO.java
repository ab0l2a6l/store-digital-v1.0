package model.repository;

import model.entity.Digital;

import java.util.ArrayList;
import java.util.List;

public class DigitalDAO implements InterfaceDAO {
    List<Digital> digitals = new ArrayList<>();

    @Override
    public void save(Digital digital) {
        digitals.add(digital);
    }

    @Override
    public List<Digital> getListOfDigitalsFromDB() {
        return digitals;
    }

}