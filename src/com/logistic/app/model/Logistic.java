package com.logistic.app.model;

import com.logistic.app.model.delivery.Delivery;
import com.logistic.app.model.employee.Employee;
import com.logistic.app.model.vehicle.Vehicle;

import java.util.List;

public class Logistic {

    private String name;

    private List<Employee> employees;

    private List<Vehicle> vehicles;

    private List<Delivery> deliveries;

    public Logistic() {
    }

    public Logistic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}
