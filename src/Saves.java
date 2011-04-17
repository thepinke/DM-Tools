
public class Saves {
	private int main, dump1, dump2;
	public Saves()
	{
		main = dump1 = dump2 = 0;
	}
	public void setSaves(String c, int level)
	{
		
			if (level == 1)
				main = 2;
				
			else if (level == 2 || level == 3)
				main = 3;
				
			else if (level == 4 || level == 5)
				main = 4;
				
			else if (level == 6 || level == 7)
				main = 5;
			
			else if (level == 8 || level == 9)
				main = 6;
			else if (level == 10 || level == 11)
				main = 7;
				
			else if (level == 12 || level == 13)
				main = 8;
				
			else if (level == 14 || level == 15)
				main = 9;
				
			else if (level == 16 || level == 17)
				main = 10;
				
			else if (level == 18 || level == 19)
				main = 11;
				
			else if (level == 20)
				main = 12;
				
		if (c != "Monk")
		{
			if (level == 1 || level == 2)
				dump1 = 0;
				
			else if (level == 3 || level == 4 || level == 5)
				dump1 = 1;
				
			else if (level == 6 || level == 7 || level == 8)
				dump1 = 2;
				
			else if (level == 9 || level == 10 || level == 11)
				dump1 = 3;
				
			else if (level == 12 || level == 13 || level == 14)
				dump1 = 4;
				
			else if (level == 15 || level == 16 || level == 17)
				dump1 = 5;
				
			else if (level == 18 || level == 19 || level == 20)
				dump1 = 6;
				
			dump2 = dump1;	
		}
		else 
		{
			dump1 = main;
			dump2 = main;
		}
	}
	
	public int getMain()
	{ return main; }
	
	public int getDump1()
	{ return dump1; }
	
	public int getDump2()
	{ return dump2; }
	
}
