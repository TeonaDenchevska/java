public class Multiprocessor {
    private int number_of_processors;
    private int number_of_cores;
    private double clock_frequency;

    public Multiprocessor(int np,int nc,double cf){
        this.number_of_processors=np;
        this.number_of_cores=nc;
        this.clock_frequency=cf;
    }

    public int getNumber_of_processors() {
        return number_of_processors;
    }

    public void setNumber_of_processors(int number_of_processors) {
        this.number_of_processors = number_of_processors;
    }

    public int getNumber_of_cores() {
        return number_of_cores;
    }

    public void setNumber_of_cores(int number_of_cores) {
        this.number_of_cores = number_of_cores;
    }

    public double getClock_frequency() {
        return clock_frequency;
    }

    public void setClock_frequency(double clock_frequency) {
        this.clock_frequency = clock_frequency;
    }

    public double setMultiClock_frequency(double clock_frequency) {
        if (this.number_of_cores >= 1 && this.number_of_processors >= 1) {
            clock_frequency = (0.7 * this.number_of_cores) * (0.8 * this.number_of_processors) * clock_frequency;
        } else {
            clock_frequency = (0.7 * 1) * (0.8 * 1) * clock_frequency;
        }
        return clock_frequency;
    }
    public double time(int time)
    {
        double t=0;
        t=time*getClock_frequency()/setMultiClock_frequency(getClock_frequency());
        return t;
    }

}
