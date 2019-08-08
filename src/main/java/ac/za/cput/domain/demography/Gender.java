package ac.za.cput.domain.demography;

public class Gender {
    private String id, desc;

    private Gender(){}

    public Gender(Builder builder)
    {
        this.id = builder.id;
        this.desc = builder.desc;
    }



    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


    public static class Builder {
        private String id, desc;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;

        }

        public Gender build()
        {
            return new Gender(this);
        }


    }


}
