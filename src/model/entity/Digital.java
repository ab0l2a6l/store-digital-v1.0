package model.entity;

public class Digital {
    private String storeWare;

    public void setStoreWare(String storeWare) {
        this.storeWare = storeWare;
    }

    public String getStoreWare() {
        return storeWare;
    }

    @Override
    public String toString() {
        return "Digital{" +
                "storeWare='" + storeWare + '\'' +
                '}';
    }
}
