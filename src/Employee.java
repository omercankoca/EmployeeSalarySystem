public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        ;
        double fee;
        if (this.salary > 1000) {
            fee = this.salary * 0.03;
        } else {
            fee = 0;
        }
        return fee;

    }

    int bonus() {
        int hourBonus;
        if (this.workHours >= 40) {
            hourBonus = (this.workHours - 40) * 30;
        } else {
            hourBonus = 0;
        }
        return hourBonus;
    }

    double raiseSalary() {
        double raise;
        if ((2021 - this.hireYear) < 10 && (2021 - this.hireYear) > 0) {
            raise = this.salary * 0.005;
        } else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20) {
            raise = this.salary * 0.01;
        } else if ((2021 - this.hireYear) >= 20) {
            raise = this.salary * 0.15;
        } else {
            raise = 0;
        }
        return raise;
    }

    public String toString() {
        double calculatedTax = tax();
        int calculatedBonus = bonus();
        double calculatedRaise = raiseSalary();
        double salaryWithBonusTax = this.salary + calculatedBonus - calculatedTax;
        double totalSalary = salaryWithBonusTax + calculatedRaise;
        return  "Employe Name : " + this.name +
                "\nSalary : " + this.salary +
                "\nWorking Hours : " + this.workHours +
                "\nStarting Year : " + this.hireYear +
                "\nTax : " + calculatedTax +
                "\nBonus : " + calculatedBonus +
                "\nSalary Raise : " + calculatedRaise +
                "\nSalary with Bonus and Raise : " + salaryWithBonusTax +
                "\nTotal Salary : " + totalSalary;
    }

}

