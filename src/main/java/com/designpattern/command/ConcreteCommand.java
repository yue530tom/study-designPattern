package com.designpattern.command;

public class ConcreteCommand implements Command {

    //������Ӧ�Ľ����߶���
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void beHereNow() {
        //ͨ����ת�������߶������Ӧ�������ý�����������ִ�й���
        receiver.gather();
    }
	@Override
	public void runFiveKM(String km) {
		receiver.run(km);
	}

}
