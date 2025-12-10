public class Tutorialweek02 {
    public static void main(String[] args){

        Person p=new Person("Ben");       //Ben object

        //create new 3 objects
        Person p1=new Person("vikash");
        p1.setSurname("fernando");
        p1.setAge(22);

        Person p2=new Person("nisura");
        p2.setSurname("pana");
        p2.setAge(21);

        Person p3=new Person("sasindu");
        p3.setSurname("anjula");
        p3.setAge(22);

        //printing all
        p1.displayName();
        System.out.println(p1.getSurname());
        System.out.println(p1.getAge());

        p2.displayName();
        System.out.println(p2.getSurname());
        System.out.println(p2.getAge());

        p3.displayName();
        System.out.println(p3.getSurname());
        System.out.println(p3.getAge());

    }
}