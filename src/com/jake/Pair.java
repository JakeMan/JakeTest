package com.jake;

import java.util.HashSet;
import java.util.Set;

public class Pair implements IPair {
	private final Set<IMember> members = new HashSet<IMember>();

	public Pair(IMember member1, IMember member2) {
		members.add(member1);
		members.add(member2);
	}

	@Override
	public Set<IMember> getMembers() {
		return members;
	}
}
