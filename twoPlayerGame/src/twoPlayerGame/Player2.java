package twoPlayerGame;

public class Player2 extends Player1 {
	
	private int health;
	private boolean armour;

	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
		
	}

	
	public void damageByGun1() {
		
		if(armour) {
			
			this.health -= 20;
			if(this.health <= 0) this.health = 0;
			if(this.health == 0) System.out.println(this.name+ " is dead");
			System.out.println("Armour is on. "+this.name+" is shot by gun1 and his health is reduced by 20."
					+ "Now new health is "+this.health);
		}
		
		if(!armour) {
			
			this.health -= 30;
			if(this.health <= 0) this.health = 0;
			if(this.health == 0) System.out.println(this.name+ " is dead");
			System.out.println("Armour is on. "+this.name+" is shot by gun1 and his health is reduced by 30."
					+ "Now new health is "+this.health);
		}
		
	}

	public void damageByGun2() {
		
		if(armour) {
			
			this.health -= 40;
			if(this.health <= 0) this.health = 0;
			
			System.out.println("Armour is on. "+this.name+" is shot by gun1 and his health is reduced by 40."
					+ "Now new health is "+this.health);
		}
		
		if(!armour) {
			
			this.health -= 50;
			if(this.health <= 0) this.health = 0;
			
			System.out.println("Armour is on. "+this.name+" is shot by gun2 and his health is reduced by 50."
					+ "Now new health is "+this.health);
		}
		
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
	

	
}
