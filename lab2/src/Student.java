public class Student extends Person{
    private String fNum;
    public Student(){
        super();
    }
    public Student(String name, String egn, String f){
        super(name, egn);
        this.fNum = f;
    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }
}