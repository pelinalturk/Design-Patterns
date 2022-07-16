package com.designpatterns.behavioral.chainOfResponsibility;

public class Executive extends Approver{

    public Executive() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Executive approves");
        return true;
    }
}
