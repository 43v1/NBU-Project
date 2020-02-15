package com.logistic.app.service;

import com.logistic.app.model.Logistic;
import com.logistic.app.resources.InMemoryResources;

import java.util.List;
import java.util.Objects;

public class LogisticService {

    public Logistic create(String name) {
        Logistic logistic = new Logistic(name);
        InMemoryResources.selectInMemoryLogisticList().add(logistic);
        return logistic;
    }

    public void delete(String name) {
        List<Logistic> logistics = InMemoryResources.selectInMemoryLogisticList();
        boolean isDeleted = logistics.removeIf(logistic -> logistic.getName().equalsIgnoreCase(name));
        if (isDeleted)
            System.out.println("Deleted logistic " + name + " successfully !");
        else
            System.out.println("Cannot find logistic with name " + name + " !");
    }


    public Logistic edit(String oldName, String newName) {

        List<Logistic> logistics = InMemoryResources.selectInMemoryLogisticList();
        Logistic existingLogistic = logistics.stream()
                .filter(logistic -> logistic.getName().equalsIgnoreCase(oldName))
                .findFirst()
                .orElse(null);

        if (Objects.isNull(existingLogistic)) {
            System.out.println("Cannot change name of logistic " + oldName);
        } else {
            existingLogistic.setName(newName);
        }

        return existingLogistic;
    }
}
