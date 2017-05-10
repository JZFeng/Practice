package com.jz.design.strategy;

public class Client {

	public static void main(String[] args) {
		MemberStrategy m = new AdvancedMemberStrategy();
		Price p = new Price(m);
		System.out.println(p.getPrice(30));

		
	}

}
