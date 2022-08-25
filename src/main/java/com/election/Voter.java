package com.election;

/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
public class Voter {
    static final int VOTER_ELIGIBLE_AGE = 18;
    private String name;
    private int age;
    private Object voter;

    public Voter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria() {
        if (age >= 18) { // age 18 or more than that
            return name + " " + "Is Eligible to Vote";
        } else if (age > 0 && age < 18) { // age positive but not eligible
            return name + " " + "Is Not Eligible to Vote";
        } else { // age less than or equal to '0'
            return name + " " + "Age Can't Be Negative or Zero";
        }
    }
}
