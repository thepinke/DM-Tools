
public class BaseAttackBonus {
	private int bab;
	private int level;
	public BaseAttackBonus()
	{
		bab = 0;
		level = 0;
	}
	public BaseAttackBonus(int l)
	{
		level = l;
	}
	
	public void setBab(String c)
	{
		if (c == "Fighter" || c == "Barbarian" || c == "Paladin" || c == "Ranger")
		{
			bab = level;
		}
		else if (c == "Cleric" || c == "Druid" || c == "Rogue" || c == "Bard" || c== "Monk")
		{
			if (level == 1)
				bab = 0;
			if (level == 2)
				bab = 1;
			if (level == 3)
				bab = 2;
			if (level == 4 || level == 5)
				bab = 3;
			if (level == 6)
				bab = 4;
			if (level == 7)
				bab = 5;
			if (level == 8 || level == 9)
				bab = 6;
			if (level == 10)
				bab = 7;
			if (level == 11)
				bab = 8;
			if (level == 12 || level == 13)
				bab = 9;
			if (level == 14)
				bab = 10;
			if (level == 15)
				bab = 11;
			if (level == 16 || level == 17)
				bab = 12;
			if (level == 18)
				bab = 13;
			if (level == 19)
				bab = 14;
			if (level == 20)
				bab = 15;
		}
		else if (c == "Wizard" || c == "Sorcerer")
		{
			if (level == 1)
				bab = 0;
			if (level == 2 || level == 3)
				bab = 1;
			if (level == 4 || level == 5)
				bab = 2;
			if (level == 6 || level == 7)
				bab = 3;
			if (level == 8 || level == 9)
				bab = 4;
			if (level == 10 || level == 11)
				bab = 5;
			if (level == 12 || level == 13)
				bab = 6;
			if (level == 14 || level == 15)
				bab = 7;
			if (level == 16 || level == 17)
				bab = 8;
			if (level == 18 || level == 19)
				bab = 9;
			if (level == 20)
				bab = 10;
		}
	}
	public int getBab()
	{ return bab; }
}
