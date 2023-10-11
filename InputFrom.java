package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class InputFrom {

    private Scanner scanner = new Scanner(System.in);

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    public void inputFromConsole(Order order){
        order.clientName = prompt("Имя клиента: ");
        order.product = prompt("Продукт: ");
        order.qnt = Integer.parseInt(prompt("Кол-во: "));
        order.price = Double.parseDouble(prompt("Цена: "));
    }
    
}
