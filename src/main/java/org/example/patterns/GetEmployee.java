package org.example.patterns;

import static java.lang.System.*;

/** An example of Builder design pattern.
 *
 * The Builder pattern is a creational design pattern that allows you to construct complex objects step by step.
 * It is used when you need to create objects with many parameters or when the object construction process is complex.
 *
 * The Builder pattern helps when you need flexibility in creating complex objects while avoiding constructor
 * telescoping (many parameters).
 *
 */
class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private String designation;
    private String department;
    private boolean isInHR;

    Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.employeeId = employeeBuilder.employeeId;
        this.department = employeeBuilder.department;
        this.designation = employeeBuilder.designation;
        this.isInHR = employeeBuilder.isInHR;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int employeeId;
        private String designation;
        private String department;
        private boolean isInHR;
        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder designation(String designation) {
            this.designation = designation;
            return this;
        }

        public EmployeeBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder isInHR(boolean isInHR) {
            this.isInHR = isInHR;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }
}

public class GetEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .firstName("Barak")
                .lastName("Obama")
                .employeeId(1)
                .designation("President")
                .isInHR(false)
                .department("Strategy")
                .build();

        out.println(employee.getFirstName());
    }
}
