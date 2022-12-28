public class Laptop extends Electronic{
    private int RAM;
    private int hardDisk;

    public Laptop(double Voltage,String processor,int ram,int hardDisk)
    {
        super(Voltage,processor);
        this.RAM=ram;
        this.hardDisk=hardDisk;

    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public boolean isBetter(Laptop l)
    {
        if(this.RAM>l.getRAM() && this.hardDisk>l.hardDisk)
        {
            return true;

        }
        else {
            return false;
        }
    }

    public String toString() {
        return "This laptop processor is "+this.getProcessor()+" and has power "+this.getVoltage()+" and RAM "+this.getRAM()+" and HardDisk "+this.getHardDisk()+" ";
    }
}
