package model.service;

import model.entity.Digital;
import model.repository.DigitalDAO;
import model.repository.InterfaceDAO;

import java.util.List;

public class DigitalService implements DigitalServiceInteface{
    InterfaceDAO interfaceDAO = new DigitalDAO();
    public void digitalService(String carName) {
        Digital digital = new Digital();
        digital.setStoreWare(carName);


        interfaceDAO.save(digital);
    }

    public List<Digital> getListFromDAO(){
        return interfaceDAO.getListOfDigitalsFromDB();
    }


}
