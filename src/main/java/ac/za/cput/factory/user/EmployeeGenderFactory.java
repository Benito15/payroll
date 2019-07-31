package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empID, String genderID)
    {
        return new EmployeeGender.Builder().empNumber(empID).genderID(genderID).build();

    }

}
