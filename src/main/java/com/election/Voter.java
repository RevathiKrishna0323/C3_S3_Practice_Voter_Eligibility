package com.election;

/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;
    private Object voter;
    public Voter() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCrieteria() {
        if (age >= 18) {
            return this.setName(String name) + "Is Eligible to Vote";
        }
        if (age <= 18) {
            return this.setName(String name) + "Is Not Eligible to Vote";
        } else {
            return this.setName(String name) + "Age Can't Be Negative or Zero";
        }
    }
}
