package rpgcreature;
import java.util.Random;
public class Golem extends Monster {
	public Golem() {
		super("ゴーレム",100);
	}
	
	@Override
	public void attack(Creature opponent) {
		Random r = new Random();
		int damage=0;
		if(r.nextInt(100)<5) {
			System.out.printf("%sのクリティカル攻撃！",getName());
			damage=30;
		}else {
			damage= r.nextInt(10)+5;
		}
		opponent.damaged(damage);
		
		 displayMessage(opponent,damage);
	}
}
