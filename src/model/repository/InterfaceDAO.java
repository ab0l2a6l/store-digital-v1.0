package model.repository;

import model.entity.Digital;

import java.util.List;

public interface InterfaceDAO {
    void save(Digital digital);

    List<Digital> getListOfDigitalsFromDB();
}
