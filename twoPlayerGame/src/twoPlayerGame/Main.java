package twoPlayerGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player1 player1 = new Player1("Abhishek","Sword",-10);
		System.out.println(player1.getName()+ " " +player1.getWeapon()+" " +player1.getHealth());
		
		player1.damageByGun1();
		player1.damageByGun2();
		player1.heal();
		
		Player2 player2 = new Player2("John","rifle",30,true);
		System.out.println(player2.getName()+ " " +player2.getWeapon()+" " +player2.getHealth());
		player2.damageByGun1();
		player2.damageByGun2();
		player2.heal();
	}

}
