package com.jz.design.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("Intermediate members 10% off.");
		return 0.9*bookPrice;
	}

}
