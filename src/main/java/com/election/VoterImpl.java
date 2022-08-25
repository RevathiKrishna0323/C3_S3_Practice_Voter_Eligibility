/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        System.out.println(voter.getName());
        System.out.println(voter.getAge());
        voter.setName("Revathi");
        voter.setAge(27);
        System.out.println(voter.getAgeCrieteria());

    }
}
