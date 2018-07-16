package com.designpattern.Composite;

public class TestMain {
	public static void main(String[] args) {
		
		//͸��ʽ���ģʽ
		ComponentLucency rootLucency = new CompositeLucency("���ڵ�");

		ComponentLucency rootChildX = new CompositeLucency("���ڵ��X�ڵ�");
		ComponentLucency rootChildY = new CompositeLucency("���ڵ��Y�ڵ�");

		rootLucency.add(rootChildX);
		rootLucency.add(rootChildY);
		
		rootChildX.add(new LeafLucency("X�ڵ�-Ҷ��"));
		rootChildX.add(new LeafLucency("X�ڵ�-Ҷ��"));

		rootChildY.add(new LeafLucency("Y�ڵ㡪Ҷ��"));

		rootLucency.display(1);
		
		
		//��ȫʽ���ģʽ
	    CompositeSafety rootSafe = new CompositeSafety("Root");
	    
	    CompositeSafety branchX = new CompositeSafety("Branch X in Root");
	    CompositeSafety branchY = new CompositeSafety("Branch Y in Root");
	    
	    rootSafe.add(branchX);
	    rootSafe.add(branchY);

	    branchX.add(new LeafSafety("Leaf A in Branch X"));
	    branchX.add(new CompositeSafety("Leaf B in Branch X"));
	    
	    branchY.add(new LeafSafety("Leaf C in Branch Y"));

	    rootSafe.display(1);
		
		
	}
}
