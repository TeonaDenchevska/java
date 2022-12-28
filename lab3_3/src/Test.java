public class Test {
    public static void main(){
        SickPatient sp=new SickPatient("Teona","Bratya Miladinovci br22","1005098003","Flu paracetamol","Sick",360);
        sp.cure("aspirin",500);
        sp.cure("aspirin",500);
        System.out.println(sp.getInformation());
    }
}