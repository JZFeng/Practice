package com.jz.design.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("Advanced members 30% off.");
		return 0.7*bookPrice;
	}

}
