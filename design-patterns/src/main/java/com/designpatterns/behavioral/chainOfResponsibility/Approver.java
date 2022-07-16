package com.designpatterns.behavioral.chainOfResponsibility;

abstract class Approver {
    Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
