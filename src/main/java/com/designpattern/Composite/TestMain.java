package com.designpattern.Composite;

public class TestMain {
	public static void main(String[] args) {
		
		//透明式组合模式
		ComponentLucency rootLucency = new CompositeLucency("根节点");

		ComponentLucency rootChildX = new CompositeLucency("根节点的X节点");
		ComponentLucency rootChildY = new CompositeLucency("根节点的Y节点");

		rootLucency.add(rootChildX);
		rootLucency.add(rootChildY);
		
		rootChildX.add(new LeafLucency("X节点-叶子"));
		rootChildX.add(new LeafLucency("X节点-叶子"));

		rootChildY.add(new LeafLucency("Y节点—叶子"));

		rootLucency.display(1);
		
		
		//安全式组合模式
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
