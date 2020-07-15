package com.newthinktank;

public class Battle {
	public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
		while(true) {
			if (getAttackResult(w1, w2).equals("Game Over")) {
				System.out.println("Game Over");
				break;
			}
			if (getAttackResult(w2, w1).equals("Game Over")) {
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {
		int wAAttackAmount = wA.attack();
		int wBBlockAmount = wB.block();
		
		int damageToWarriorB = wAAttackAmount - wBBlockAmount;
		
		if (damageToWarriorB > 0) {
			wB.health = wB.health - damageToWarriorB;
		} else {
			damageToWarriorB = 0;
		}
		
		System.out.printf("%s Attacks %s and deals " 
				+ "%d Damage\n", wA.getName(), wB.getName(), damageToWarriorB);
		
		System.out.printf("%s Has %d Health\n\n", wB.getName(), wB.health);
		
		Thread.sleep(1500);
		
		if (wB.health <= 0) {
			System.out.printf("%s has Died and %s is "
					+ "Victorious\n", wB.getName(), wA.getName());
			return "Game Over";
		} else {
			return "Fight Again";
		}
	}
}
