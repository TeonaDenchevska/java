
public abstract class Patient {
    private String name;
    private String address;
    private String EGN;

    public Patient(String name,String address,String EGN)
    {
        this.name=name;
        this.address=address;
        this.EGN=EGN;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEGN() {
        return EGN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public void setName(String name) {
        this.name = name;
    }


}
