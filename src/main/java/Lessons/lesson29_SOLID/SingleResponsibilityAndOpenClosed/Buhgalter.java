package Lessons.lesson29_SOLID.SingleResponsibilityAndOpenClosed;

public class Buhgalter {

    public void changeSalary(Employee employee, double k) {
        employee.setSalary(employee.getSalary() * k);
    }
}
