public class Person{            //person class
    private String name;
    private String surename;
    private int age;

    public Person(String n){    //constructor
        name=n;
    }

    public void displayName(){        //display name method
        System.out.println(name);
    }

    public void setSurname(String s){
        surename=s;
    }

    public void setAge(int num){
        age=num;
    }

    public String getSurname(){
        return surename;
    }

    public int getAge(){
        return age;
    }


}