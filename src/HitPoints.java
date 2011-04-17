import java.util.Random;


public class HitPoints {
	private int hitPoints;
	
	public HitPoints()
	{
		hitPoints = 0;
	}
	
	public void setHitpoints(int level, int conBonus, int hitDie, String c)
	{
		Random random = new Random();
		int ran;
		hitPoints = hitDie + conBonus;
		for (int count = 0; count < level-1; count++)
		{
			ran = random.nextInt(hitDie);
			if ((ran + conBonus) >= 1)
				hitPoints += (conBonus + ran);
			else
				hitPoints += 1;
		}
	}
	public int getHitpoints()
	{ return hitPoints; }
	
}
