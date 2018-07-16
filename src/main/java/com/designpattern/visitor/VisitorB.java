package com.designpattern.visitor;

public class VisitorB implements Visitor {
	  @Override
	    public void visit(NodeA node) {
	        System.out.println(node.operationA());
	    }
	    /**
	     * ��Ӧ��NodeB�ķ��ʲ���
	     */
	    @Override
	    public void visit(NodeB node) {
	        System.out.println(node.operationB());
	    }
}
