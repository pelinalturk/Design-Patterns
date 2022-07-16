package com.designpatterns.behavioral.chainOfResponsibility;

public class Manager extends Approver{


    public Manager(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount < 500){
            System.out.println("Manager approves");
        }else if(chief != null){
            System.out.println("Amount is greater than manager can approve. Passing to chief");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
