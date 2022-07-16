package com.designpatterns.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Approver executive = new Executive();
        Approver manager = new Manager(executive);
        Approver officer = new Officer(manager);

        officer.approveLoan( 50);
        System.out.println("-----------");
        officer.approveLoan(400);
        System.out.println("-----------");
        officer.approveLoan(5000);

        /*
        * output:
        *
         Officer approves
        -----------
        Amount is greater than officer can approve. Passing to chief
        Manager approves
        -----------
        Amount is greater than officer can approve. Passing to chief
        Amount is greater than manager can approve. Passing to chief
        Executive approves
        */
    }
}
