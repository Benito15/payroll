package ac.za.cput.util;

import java.util.UUID;

public class Misc {

    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }

}
