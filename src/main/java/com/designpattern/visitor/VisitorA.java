package com.designpattern.visitor;

public class VisitorA implements Visitor {
	  @Override
	    public void visit(NodeA node) {
	        System.out.println("VisitorA:"+node.operationA());
	    }
	    /**
	     * 对应于NodeB的访问操作
	     */
	    @Override
	    public void visit(NodeB node) {
	        System.out.println("VisitorA:"+node.operationB());
	    }
}
