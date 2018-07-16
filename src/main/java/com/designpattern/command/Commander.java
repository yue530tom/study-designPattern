package com.designpattern.command;

public class Commander {

	//持有命令对象
    private Command command = null;

    public Commander(Command command){
        this.command = command;
    }

    public void issueOrders(){
        
        command.beHereNow();
        command.runFiveKM("5");
    }
}
