package com.jake;

import static org.junit.Assert.*;

import org.junit.Test;


public class MemberTest {
	@Test
	public void name() throws Exception {
		Member member = new Member("Jake");
		String name = member.getName();
		assertEquals("Jake", name);
	}
}
