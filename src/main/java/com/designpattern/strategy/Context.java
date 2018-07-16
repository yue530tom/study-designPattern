package com.designpattern.strategy;

public class Context {
    // ����һ��������ԵĶ���
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String contextMethod(){
        
        return strategy.strategyMethod();
    }
}
