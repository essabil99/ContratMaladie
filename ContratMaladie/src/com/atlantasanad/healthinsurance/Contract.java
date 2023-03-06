package com.atlantasanad.healthinsurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;
import java.util.List;


public class Contract<member> {

    private final int number;
    private final Date dateOfCreation;
    private final List<member> members;


    public Contract(int number) {
        this.number = number;
        this.dateOfCreation = new Date ();
        this.members = new ArrayList<> ();
    }

    public int getNumber() {
        return number;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public List<member> getMembers() {
        return members;
    }

    public void addMember(member member) {
        members.add (member);
    }

    public void removeMember(member member) {
        members.remove (member);
    }

    public <E> void add(E contract) {
    }
}
