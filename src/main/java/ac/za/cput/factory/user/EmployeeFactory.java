package ac.za.cput.factory.user;


import ac.za.cput.domain.user.Employee;

import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String fname, String lname )
    {


        return new Employee.Builder()
                .empNumber(Misc.generateID())
                .empFirstName(fname)
                .empLastName(lname)
                .build();
    }

}
