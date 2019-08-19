package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;


public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empID, String genderID)
    {
        return new EmployeeGender().empGen(empID, genderID);
    }

}

//    public static Employee buildEmployee(String fname, String lname )
//    {
//
//
//        return new Employee.Builder()
//                .empNumber(Misc.generateID())
//                .empFirstName(fname)
//                .empLastName(lname)
//                .build();
//    }