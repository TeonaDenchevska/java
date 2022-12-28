public class People {
    private String name;
    private String birthdate;


    public People()
    {
        this.name="";
        this.birthdate="";
    }

    public People(String n,String bd)
    {
        this.name=n;
        this.birthdate=bd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
