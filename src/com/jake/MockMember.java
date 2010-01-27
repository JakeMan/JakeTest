package com.jake;

public class MockMember implements IMember {
	private final String name;

	public MockMember(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
