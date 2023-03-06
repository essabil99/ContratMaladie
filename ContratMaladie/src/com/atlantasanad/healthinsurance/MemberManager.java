package com.atlantasanad.healthinsurance;

import java.util.ArrayList;
import java.util.List;


public class MemberManager {

    public List<member> members;
    private String phone;

    public MemberManager() {
        this.members = new ArrayList<>();
    }

    public void createMember(String name, String email, String phone, String login, String password) {
        member member = new member(name, email, phone, login, password);
        members.add(member);

        String message = "You have been added to the health insurance plan. Your login is " +
                login + " and your password is " + password;
        sendSMS(phone, message);
        sendEmail(email, message);
    }
    public void deleteMember(member member) {
        members.remove(member);
    }

    private void sendSMS(String phone, String message) {
        // Code to send SMS goes here
        this.phone = phone;
    }

    private void sendEmail(String email, String message) {
        // Code to send email goes here
    }
}
