package com.mahendra.demo;

public class InterestCalculator {
	private static final double MIN=10000;
	private double principle;
	private double rateOfInt;
	private int duration;
	
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		if(principle < MIN )
			this.principle = 0;
		else
			this.principle = principle;
	}
	public double getRateOfInt() {
		return rateOfInt;
	}
	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double calcInterest() {
		return principle * (rateOfInt /12 /100) * duration;
	}
}
