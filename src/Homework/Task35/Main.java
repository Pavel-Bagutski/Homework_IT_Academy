package Homework.Task35;
// Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную стуктуру на заводе. Реализовать
// методы по начислению зарплаты в зависимости от должности(почасовая, процентная, смешанная). Иерархия должна иметь
// хотя бы 3 уровня

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker(168, 15);

        Foreman foreman1 = new Foreman(0.98f, 3500);

        Engineer engineer1 = new Engineer(1.30f,2000,168, 20);

    }
}
