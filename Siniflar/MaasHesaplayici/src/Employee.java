public class Employee {
    String name;
    int salary,workHours,hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.hireYear = hireYear;
        this.name = name;
        this.salary= salary;
        this.workHours=workHours;
    }
    int tax(){
        int tax = 0;
        if(this.salary <1000){
            System.out.println("Vergi uygulanmıyor");
        }else{
            tax = (int) (this.salary*0.03);
        }
        return tax;
    }
    int bonus(){
        int bonus = 30*this.workHours;
        return bonus;
    }
    int raiseSalary(){
        int exct = 2021-this.hireYear;
        int raise = 0;
        if(exct<10){
            raise = (int) (this.salary*0.05);
        }else if(exct>9 && exct<20){
            raise = (int) (this.salary*0.10);
        }else{
            raise = (int) (this.salary*0.15);
        }
        return raise;
    }
    int genelMaas(){
        int maas = this.salary-tax()+bonus();
        return maas;
    }
    int toplamMaas(){
        int total = this.salary+raiseSalary();
        return total;
    }

    public String toString(){
        return "Adı: "+this.name+
                "\nMaaşı: "+this.salary+
                "\nÇalışma Saati: "+this.workHours+
                "\nBaşlangıç Yılı: "+this.hireYear+
                "\nVergi: "+this.tax()+
                "\nBonus: "+this.bonus()+
                "\nMaaş Artışı: "+this.raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte maaş: "+genelMaas()+
                "\nToplam Maaş: "+toplamMaas();
    }
}
