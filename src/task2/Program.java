package task2;

import java.util.Arrays;
import java.util.Random;

public class Program {


    private static Random random = new Random();
    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int age = random.nextInt(18,65);

        if (random.nextInt(0,2) == 0) {
            int salaryIndex = random.nextInt(200,500);
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        }
            else {
                int salaryIndex = random.nextInt(100,400);
                return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        }
    }

    /*public static Worker[] generateWorker(int count) {
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }

    public static void main(String[] args) {
        Worker[] workers = generateWorker(12);

        for (Worker worker : workers) {
            System.out.println(worker);
        }*/

    public static void main(String[] args) {
        Employee[] employees = new Employee[12];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }


        Arrays.sort(employees/*, new SalaryComporator()*/, new AgeComporator());

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
