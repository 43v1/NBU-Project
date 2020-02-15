package com.logistic.app.model.delivery.type;

public class CargoDelivery implements DeliveryType {

    private String cargo;

    private Double weigth;

    public CargoDelivery() {
    }

    public CargoDelivery(String cargo, Double weigth) {
        this.cargo = cargo;
        this.weigth = weigth;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }
}
