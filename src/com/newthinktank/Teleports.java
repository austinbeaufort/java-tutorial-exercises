package com.newthinktank;

public interface Teleports {
	String teleport();
}

class CanTeleport implements Teleports {
	public String teleport() {
		return "Teleports Away";
	}
}

class CannotTeleport implements Teleports {
	public String teleport() {
		return "Fails at Teleporting";
	}
}
