package model.service;

import model.entity.Digital;

import java.util.List;

public interface DigitalServiceInteface {
    public void digitalService(String carName);
    public List<Digital> getListFromDAO();
}
