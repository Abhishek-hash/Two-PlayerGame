package twoPlayerGame;

public class Player1 {

	protected String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		
		this.name = name;
		this.weapon = weapon;
		if(health < 0 || health > 100) this.health = 100;
		else this.health = health;
	}
	
	public void damageByGun1() {
		this.health -= 30;
		if(this.health <= 0) this.health = 0;
		
		System.out.println(this.name+" is shot by gun1 and his health is reduced by 30."
				+ "Now new health is "+this.health);
		
		if(this.health == 0) System.out.println(this.name+ " is dead");
	}
	
	public void damageByGun2() {
		this.health -= 50;
		if(this.health <= 0) this.health = 0;
		if(this.health == 0) System.out.println(this.name+ " is dead");
		System.out.println(this.name+" is shot by gun2 and his health is reduced by 50."
				+ "Now new health is "+this.health);
		
		if(this.health == 0) System.out.println(this.name+ " is dead");
	}
	
	
	public void heal() {
		
		if(this.health <= 0) {
			System.out.println(this.name+" is already dead. Can not be healed now.");;
		}
		else {
			this.health = 100;
			System.out.println(this.getName()+ " is healed now. And his new health is "+ this.getHealth());
		}
	}
	
	/******** Getters and setters *********/
	
	public String getName() {
		return name;
	}

	public String getWeapon() {
		return weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
	
}
