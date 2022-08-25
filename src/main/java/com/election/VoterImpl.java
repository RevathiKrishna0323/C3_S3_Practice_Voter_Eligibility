/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("Revathi");
        voter.setAge(-16);
        System.out.println(voter.getAgeCriteria());
    }
}
