package ac.za.cput.domain.user;

public class EmployeeGender {

    private String empNumber, genderID;

    private EmployeeGender(){}


    public EmployeeGender(Builder builder)
    {
        this.empNumber = builder.empNumber;
        this.genderID = builder.genderID;
    }


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

    public static class Builder {
        private String empNumber, genderID;

        public Builder empNumber(String empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public Builder genderID(String genderID) {
            this.genderID = genderID;
            return this;

        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }

    }
}
