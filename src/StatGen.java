import java.util.Random;


public class StatGen {
	private int mainStat;
	private int secondStat;
	private int thirdStat;
	private int dump1;
	private int dump2;
	private int dump3;
	private int roll(){
		Random randomNumber = new Random();
		return (randomNumber.nextInt(5)+2) + (randomNumber.nextInt(5)+2)+ (randomNumber.nextInt(5)+2);
	}
	public StatGen()
	{
		mainStat = 0;
		secondStat = 0;
		thirdStat = 0;
		dump1 = 0;
		dump2 = 0;
		dump3 = 0;
	}
	public void setStats(){
		mainStat = roll();
		secondStat = roll();
		thirdStat = roll();
		dump1 = roll();
		dump2 = roll();
		dump3 = roll();
		sortStats();
	}
	public int statBonus(int stat)
	{
		int bonus = 0;
		if (stat >= 10)
			bonus = (stat - 10) / 2;
		else
			bonus = (stat - 11) / 2;
		return bonus;
	}
	public int getMain()
	{ return mainStat; }
	public int getSecond()
	{ return secondStat; }
	public int getThird()
	{ return thirdStat; }
	public int getDump1()
	{ return dump1; }
	public int getDump2()
	{ return dump2; }
	public int getDump3()
	{ return dump3; }
 	private void sortStats(){
		int swap = 0;
		if (mainStat < secondStat)
		{
			swap = mainStat;
			mainStat = secondStat;
			secondStat = swap;
		}
		if (mainStat < thirdStat)
		{
			swap = mainStat;
			mainStat = thirdStat;
			thirdStat = swap;
		}
		if (mainStat < dump1)
		{
			swap = mainStat;
			mainStat = dump1;
			dump1 = swap;
		}
		if (mainStat < dump2)
		{
			swap = mainStat;
			mainStat = dump2;
			dump2 = swap;
		}
		if (mainStat < dump3)
		{
			swap = mainStat;
			mainStat = dump3;
			dump3 = swap;
		}
		
		if (secondStat < thirdStat)
		{
			swap = secondStat;
			secondStat = thirdStat;
			thirdStat = swap;
		}
		if (secondStat < dump1)
		{
			swap = secondStat;
			secondStat = dump1;
			dump1 = swap;
		}
		if (secondStat < dump2)
		{
			swap = secondStat;
			secondStat = dump2;
			dump2 = swap;
		}
		if (secondStat < dump3)
		{
			swap = secondStat;
			secondStat = dump3;
			dump3 = swap;
		}
		
		if (thirdStat < dump1)
		{
			swap = thirdStat;
			thirdStat = dump1;
			dump1 = swap;
		}
		if (thirdStat < dump2)
		{
			swap = thirdStat;
			thirdStat = dump2;
			dump2 = swap;
		}		
		if (thirdStat < dump3)
		{
			swap = thirdStat;
			thirdStat = dump3;
			dump3 = swap;
		}
	}
	
}
