package com.example.model;

import java.util.List;


public class Devices {
	private List<Device> devices;
	private String brandName;
	public Devices(List<Device> devices, String brandName) {
		super();
		this.devices = devices;
		this.brandName = brandName;
	}
	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	

}
