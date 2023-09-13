package task2;

/**
 * TODO: Доработать в рамках домашнего задания
 */

public class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary,int age)      { super(name, surName, salary, age); }

    @Override
    public double calculateSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("%s %s; лет: %d; Фрилансер; Среднемесячная заработная плата (оплата по часам): %.2f",
                surName, name, age, calculateSalary());
    }
}
