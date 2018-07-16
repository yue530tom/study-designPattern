package com.designpattern.facade;

public class ComputerSupplier {
	private Cpu cpu;
	private Board board;
	private Disk disk;
	private ComputerCase computerCase;

	public Cpu getCpu() {
		return cpu;
	}

	public Board getBoard() {
		return board;
	}

	public Disk getDisk() {
		return disk;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public void getComputer() {
		setCpu(new Cpu());
		setDisk(new Disk());
		setBoard(new Board());
		setComputerCase(new ComputerCase());
	}
}
