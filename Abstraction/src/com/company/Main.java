package com.company;

public class Main {

    public static void main(String[] args) throws Exception{
	Employee savita = new EmployeeBackEnd();
    savita.setName("Savita Bhabhi");
    savita.showAttendence();
    savita.doWork(); //polymorphism
    Employee ajgar = new EmployeeFrontEnd();
    ajgar.setName("Ajgar");
    ajgar.setAttendence();
    ajgar.showAttendence();
    ajgar.doWork(); //polymorphism
    }
}
