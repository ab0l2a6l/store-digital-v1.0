package model.repository;

import model.entity.Digital;
import view.DigitalView;

import java.util.ArrayList;
import java.util.List;

public class DigitalDAO implements InterfaceDAO {
    List<Digital> digitals = new ArrayList<>();
    public List<Digital> getDigitals(){
        return digitals;
    }
    @Override
    public void save(Digital digital) {
        digitals.add(digital);
    }

}