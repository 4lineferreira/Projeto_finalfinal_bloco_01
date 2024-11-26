package com.generation.helloworld.model;

public class BsmModel {

	private int id;
	private String bsm;

	public BsmModel(int id, String bsm) {
		this.id = id;
		this.bsm = bsm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBsm() {
		return bsm;
	}

	public void setBsm(String bsm) {
		this.bsm = bsm;
	}

}
