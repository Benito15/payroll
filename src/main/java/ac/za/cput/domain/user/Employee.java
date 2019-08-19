package ac.za.cput.domain.user;

import java.util.Objects;

public class Employee {

    private String empNumber, empFirstName, empLastName;

    private Employee (){}

    public Employee(Builder builder)
    {
        this.empNumber = builder.empNumber;
        this.empFirstName = builder.empFirstName;
        this.empLastName = builder.empLastName;


    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public static class Builder
    {
        private String empNumber, empFirstName, empLastName;

        public Builder empNumber(String empNumber)
        {
            this.empNumber = empNumber;
            return this;
        }

        public Builder empFirstName(String empFName)
        {
            this.empFirstName = empFName;
            return this;

        }

        public Builder empLastName(String empLName)
        {
            this.empLastName = empLName;
            return this;

        }




        public Employee build()
        {
            return new Employee(this);
        }


    }

    public Employee copy(Employee employee)
    {
        this.empNumber = employee.empNumber;
        this.empFirstName = employee.empFirstName;
        this.empLastName = employee.empLastName;
        return employee;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empNumber, employee.empNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber);
    }
}
