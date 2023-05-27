package controler;

import common.StaticScanner;
import model.entity.Digital;
import model.service.DigitalService;

import java.util.List;
import java.util.Scanner;

public class DigitalController {
    static DigitalService digitalService = new DigitalService();
    public void insertDataToDB(){
        Scanner input = StaticScanner.getData();
        DigitalService digitalService = new DigitalService();
        digitalService.digitalService(input.nextLine());
    }


        public List<Digital> showDB(){
            return digitalService.getListFromDAO();
        }
}


