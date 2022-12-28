public class Main {
    public static void main(String[] args) {

        Student s1=new Student("Teona","19.10.2002","123221025",4,6,5);
        System.out.println("Name: "+s1.getName()+" Birthdate: "+s1.getBirthdate()+" F_num:"+ s1.getfNum()+" Pik grade: "+s1.getPik_grade()+" Te grade:"+s1.getTe_grade()+" Ppe grade: "+s1.getPpe_grade());
        s1.setPik_grade(4.5);
        System.out.println("Name: "+s1.getName()+" Birthdate: "+s1.getBirthdate()+" F_num:"+ s1.getfNum()+" Pik grade: "+s1.getPik_grade()+" Te grade:"+s1.getTe_grade()+" Ppe grade: "+s1.getPpe_grade());

    }
}