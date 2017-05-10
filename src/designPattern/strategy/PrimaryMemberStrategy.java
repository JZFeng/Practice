package com.jz.design.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("Prime members do not have discount.");
		return bookPrice;
	}

}
