package com.company;

public abstract class Employee extends Company {
    private String attendence, name;

    public void setAttendence() {
        attendence = Attendance.PRESENT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAttendence() {
        if(attendence == null) {
            attendence = Attendance.ABSENT;
        }
        if (attendence.equals(Attendance.PRESENT)) {
            System.out.println(name + " is " + attendence);
        } else {
            System.out.println(name + " is " + attendence);
        }
    }

    public abstract void doWork() throws Exception;
}
