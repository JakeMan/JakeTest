package com.jake;

public class Member implements IMember {
	private final String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
