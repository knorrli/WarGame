package warGame;

import warGame.City.Building;

public class Soldier extends Warrior {
	
	private int price = 5;
	private int HP = 1;
	private int AP = 1;
	private int movement = 4;
	private String type = "SOLDIER";
	
	public Soldier(Player player) {
		super(player);
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getHP() {
		return this.HP;
	}

	@Override
	public int getAP() {
		return this.AP;
	}

	@Override
	public int getMovement() {
		return this.movement;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public Warrior copy() {
		return new Soldier(player);
	}

	@Override
	public Building requiredBuilding() {
		return Building.CASERN;
	}

	@Override
	public String getInfo() {
		String info = "Soldier:\nPrice: 5/3\nHP: 1\nAP: 1\nMov: 4\nSoldiers are infantry troops. " +
				"A single Soldier might not be very strong, but Soldiers gain their strength from their mass. " +
				"Never underestimate the chaos and destruction a batallion of Soldiers is capable of!";
		return info;
	}
}
