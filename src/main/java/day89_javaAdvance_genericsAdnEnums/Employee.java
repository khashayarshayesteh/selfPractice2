package day89_javaAdvance_genericsAdnEnums;

import lombok.Data;

@Data
public class Employee {
    String firstName;
    String lastName;
    Long salary;

    public Employee(String firstName, String lastName, Long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {

    }
}
