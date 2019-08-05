package ac.za.cput.domain.user;

public class EmployeeGender {

    private String empNumber, genderID;

    public EmployeeGender(){}




    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getGenderID() {
        return genderID;
    }

    public void setGenderID(String genderID) {
        this.genderID = genderID;
    }


    //this is the method for linking the factory class, high-level abstractions.
    public EmployeeGender empGen(String empNumber, String genderID)
    {
        this.empNumber = empNumber;
        this.genderID = genderID;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "empNumber='" + empNumber + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }

    //no need for builder class, this is going to be a high level abstraction.




}
