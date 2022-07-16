package com.designpatterns.behavioral.chainOfResponsibility;

public class Officer extends Approver{

    public Officer(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount < 100){
            System.out.println("Officer approves");
        }else if(chief != null){
            System.out.println("Amount is greater than officer can approve. Passing to chief");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
