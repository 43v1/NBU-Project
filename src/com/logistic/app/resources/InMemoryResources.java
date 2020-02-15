package com.logistic.app.resources;

import com.logistic.app.model.Logistic;

import java.util.ArrayList;
import java.util.List;

public class InMemoryResources {

    private static List<Logistic> logisticList;

    public static List<Logistic> createInMemoryLogisticList() {
        logisticList = new ArrayList<>();
        return logisticList;
    }

    public static List<Logistic> selectInMemoryLogisticList() {
        return logisticList;
    }


    public static void printLogisticNames() {
        if (logisticList.size() > 0) {
            for (Logistic logistic : logisticList) {
                System.out.println(logistic.getName());
            }
        } else {
            System.out.println("In memory logistic list is empty !");
        }
    }

}
