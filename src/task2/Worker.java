package task2;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee {

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; лет: %d; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, age, calculateSalary());
    }
}
