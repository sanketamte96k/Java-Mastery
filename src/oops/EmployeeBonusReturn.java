package oops;

public class EmployeeBonusReturn {
    public static void main(String[] args) {

        Employeeee[] employees = {
                new Employeeee("Rahul", 50000),
                new Managerrr("Sanket", 60000),
                new Developerrr("Rohan", 65000)
        };

        double totalBonus = 0;

        for (Employeeee e : employees) {

            double bonus = e.calculateBonus();

            System.out.println(e.name + " Bonus = " + bonus);

            totalBonus = totalBonus + bonus;
        }

        System.out.println("Total Bonus = " + totalBonus);
    }
}

class Employeeee {

    protected String name;
    protected double salary;

    Employeeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 10 / 100;
    }
}

class Managerrr extends Employeeee {

    Managerrr(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 20 / 100;
    }
}

class Developerrr extends Employeeee {

    Developerrr(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 15 / 100;
    }
}