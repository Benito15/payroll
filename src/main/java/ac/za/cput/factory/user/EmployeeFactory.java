package ac.za.cput.factory.user;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.gender.GenderFactory;
import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String fname, String lname )
    {
                                                            //String gender
      //  Gender g = GenderFactory.buildGender(gender);

        //take out all the gender kak
        return new Employee.Builder()
                .empFirstName(Misc.generateID())
                .empFirstName(fname)
                .empLastName(lname)
                //.gender(g)
                .build();
    }

}
