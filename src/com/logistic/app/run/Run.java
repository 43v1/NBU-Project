package com.logistic.app.run;

import com.logistic.app.model.Logistic;
import com.logistic.app.resources.InMemoryResources;
import com.logistic.app.service.LogisticService;
import controller.ConsoleController;

import java.util.Scanner;

public class Run {


    public static void main(String[] args) {
        ConsoleController consoleController = new ConsoleController();

        InMemoryResources.createInMemoryLogisticList();
        menu();

//        LogisticService logisticService = new LogisticService();
//        Logistic logistic = logisticService.create("Trace");
//        //TODO
//
////        InMemoryResources.printLogisticNames();
//
////        Logistic edit = logisticService.edit("Trace", "Speedy");


    }
        private static void menu(){
        System.out.println("---------MENU------------");
        System.out.println("Списък с логистики");
        System.out.println("1. Създаване на Логистика");
        System.out.println("2. Редактиране на логиистика");
        System.out.println("3. Изтриване на логистика");
        System.out.println("------Въведете избора си------");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

        switch (choice){
            case "1":

                break;
            case "2":
                break;
            case"3":
                break;
            case"4":
                break;


        }

    }

}
