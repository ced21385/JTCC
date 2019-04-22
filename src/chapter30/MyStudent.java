package chapter30;

import java.lang.String;

public class MyStudent {

    private String firstName;
    private String lastName ;
    private String major    ;
    private int    age      ;
    private double score    ;

    public MyStudent(String firstName, String lastName, String major, int age, double score) {
        this.firstName = firstName;
        this.lastName  = lastName ;
        this.major     = major    ;
        this.age       = age      ;
        this.score     = score    ;
    }

    public String getFirstName() {return this.firstName;}
    public String getLastName () {return this.lastName ;}
    public String getMajor    () {return this.major    ;}
    public int    getAge      () {return this.age      ;}
    public double getScore    () {return this.score    ;}

}  // class MyStudent