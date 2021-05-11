package com.tts.addressBook;

import java.util.Comparator;

public class Entry {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString() {
        return
                "\nFirst_Name= " + firstName + '\n' +
                "LastName= " + lastName + '\n' +
                "Phone_Number= " + Validation.formatPhoneNumber(phoneNumber) + '\n' +
                "Email_Address= " + emailAddress + '\n';
    }
 public String tableDisplay(){
     return
             "firstName= " + firstName + '\t' +
             "lastName= " + lastName + '\t' +
             "phoneNumber= " + Validation.formatPhoneNumber(phoneNumber) + '\n' +
             "emailAddress= " + emailAddress + '\t' +
             "*************************************\t\n"
             ;
 }



//*********************** Comparator for sorting the list by Entry First Name*/***********************************
    public static Comparator<Entry> EntryNameComparator = new Comparator<Entry>() {

        public int compare(Entry e1, Entry e2) {
            String firstname1 = e1.getFirstName().toUpperCase();
            String firstname2 = e2.getFirstName().toUpperCase();

            return firstname1.compareTo(firstname2);


        }};



}
