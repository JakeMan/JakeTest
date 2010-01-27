package com.jake;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;


public class PairTest {
	@Test
	public void createAPair() throws Exception {
		MockMember member1 = new MockMember("Jake");
		MockMember member2 = new MockMember("Tom");
		Pair pair = new Pair(member1, member2);
		Set<IMember> members = pair.getMembers();
		assertTrue(members.contains(member1));
		assertTrue(members.contains(member2));
	}
}
