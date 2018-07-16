package com.designpattern.command;

public class Commander {

	//�����������
    private Command command = null;

    public Commander(Command command){
        this.command = command;
    }

    public void issueOrders(){
        
        command.beHereNow();
        command.runFiveKM("5");
    }
}
