package com.company;

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {
        BasePlusCommissionEmployeeComposition employee =
                new BasePlusCommissionEmployeeComposition("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is:", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);
        employee.setGrossSales(1000);
        employee.setCommissionRate(0.2);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                employee.toString());

    }
}
