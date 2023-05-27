package view;


import model.entity.Digital;

import java.util.List;

public class DigitalView {
    public static void showDetail(List<Digital> digital){
        for (Digital result: digital ){
            System.out.println(result.getStoreWare() + " added.");
        }
    }
}
