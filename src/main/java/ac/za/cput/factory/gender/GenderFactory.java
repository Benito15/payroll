package ac.za.cput.factory.gender;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String gender)
    {
        return new Gender.Builder().id(Misc.generateID())
                .desc(gender)
                .build();


    }
}
