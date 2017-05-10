package com.jz.design.strategy;

public class Price {
	private MemberStrategy memberStrategy;
	
	Price(MemberStrategy memberStrategy)
	{
		this.memberStrategy = memberStrategy;
		
	}
	
	public double getPrice(double bookPrice)
	{
		return memberStrategy.calPrice(bookPrice);
	}
	

}
