package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void buildEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("Justin", "bieber");
        String name = employee.getEmpFirstName();
        Assert.assertEquals(employee.getEmpFirstName(), name);

    }
}