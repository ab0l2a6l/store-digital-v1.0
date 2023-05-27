package model;

import model.entity.Digital;
import model.repository.DigitalDAO;
import model.repository.InterfaceDAO;

public class Service {
    public void digitalService(String carName) {
        Digital digital = new Digital();
        digital.setStoreWare(carName);

        InterfaceDAO interfaceDAO = new DigitalDAO();
        interfaceDAO.save(digital);
    }
}
