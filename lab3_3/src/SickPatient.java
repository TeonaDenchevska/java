public class SickPatient extends Patient {
    private String information;
    private String status;
    private int day;

    public SickPatient(String name,String address,String EGN,String information,String status,int day){
        super(name,address,EGN);
        this.information=information;
        this.status=status;
        this.day=day;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void cure(String name_of_pills, int dose)
    {
        this.information += name_of_pills + " " + dose + "\n";
    }

}
