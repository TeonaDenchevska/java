public class Student extends People{
    private String fNum;
    private double pik_grade;
    private double te_grade;
    private double ppe_grade;

    public Student(String name,String birthdate,String fNum,double pik,double te,double ppe){
        super(name,birthdate);
        this.fNum=fNum;
        this.pik_grade=pik;
        this.te_grade=te;
        this.ppe_grade=ppe;
    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }

    public double getPik_grade() {
        return pik_grade;
    }

    public void setPik_grade(double pik_grade) {
        System.out.println("The students new pik grade is:"+pik_grade);
        this.pik_grade = pik_grade;
    }

    public double getTe_grade() {
        return te_grade;
    }

    public void setTe_grade(double te_grade) {
        System.out.println("The students new te grade is:"+te_grade);
        this.te_grade = te_grade;
    }

    public double getPpe_grade() {
        return ppe_grade;
    }

    public void setPpe_grade(double ppe_grade) {
        System.out.println("The students new ppe grade is:"+ppe_grade);
        this.ppe_grade = ppe_grade;
    }
}
