public class Main {
    public static void main(String[] args) {

        Multiprocessor m1=new Multiprocessor(4,5,1.2);
        System.out.println("Number of processors: "+m1.getNumber_of_processors()+" Number of cores: "+m1.getNumber_of_cores()+" Clock frequency:"+ m1.getClock_frequency());
        System.out.println("Multiprocessor clock frequency:"+m1.setMultiClock_frequency(m1.getClock_frequency()));
        System.out.println("Time:"+m1.time(5));

    }
}