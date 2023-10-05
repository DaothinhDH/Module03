package Baitap6;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Nhập thông tin của nhân viên " +(i+1));
            employees[i].inputData();
            employees[i].setSalary(employees[i].calSalary());
        }

        System.out.println("Thông tin toàn bộ nhân viên:");
        for (Employee employee : employees) {
            employee.displayData();
        }
    }
}
