public class Electronic {
    private double Voltage;
    private String processor;
    private boolean isWorking=false;

    public Electronic(double Voltage,String processor)
    {
        this.Voltage=Voltage;
        this.processor=processor;

    }
    public Electronic()
    {
        this.Voltage=0;
        this.processor="";
    }

    public void TurnOn(){
        if(this.isWorking){
            System.out.println("The electronic is already turn on");
        }
        else {
            this.isWorking = true;
            System.out.println("The electronic is turned on");
        }

    }
    public void TurnOff(){
        if(!this.isWorking){
            System.out.println("The electronic is already turn off");
        }
        else {
            this.isWorking = false;
            System.out.println("The electronic is turned off");
        }
    }

    public double getVoltage() {
        return Voltage;
    }

    public void setVoltage(double voltage) {
        Voltage = voltage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
