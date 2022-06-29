public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(int salary) {
        if (this.salary > 1000) {
            return this.salary*0.03;
        }
        else {
            return 0;
        }
    }

    double bonus(int workHours) {
        if (this.workHours > 40) {
            return ( this.workHours - 40 )*30;
        }
        else {
            return 0;
        }
    }

    double riseSalary(int salary) {
        if (2021-this.hireYear < 10) {
            return this.salary*0.05;
        }
        else if (2021-this.hireYear<20) {
            return this.salary*0.1;
        }
        else {
            return this.salary*0.15;
        }
    }

    public String toString() {
        return  "Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + this.tax(this.salary) + "\n" +
                "Bonus: " + this.bonus(this.workHours) + "\n" +
                "Maaş Artışı: " + this.riseSalary(this.salary) + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax(this.salary) + this.bonus(this.workHours)) + "\n" +
                "Toplam Maaş: " + (this.salary - this.tax(this.salary) + this.bonus(this.workHours) + riseSalary(this.hireYear));
    }
}
