package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        InputFrom inputFrom = new InputFrom();
        SaveTo saveTo = new SaveTo();

        inputFrom.inputFromConsole(order);
        saveTo.saveToJson(order);

    }

}
