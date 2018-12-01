package com.finals_4itf_lacap;

public class Student {

    String fname, lname;
    Long ave;

    public Student(String fname, String lname, Long ave) {
        this.fname = fname;
        this.lname = lname;
        this.ave = ave;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Long getAve() {
        return ave;
    }
}
