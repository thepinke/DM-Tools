import java.util.Random;

import javax.swing.JOptionPane;


public class Fighter {
	
	private int str, dex, con, intel, wis, cha;
	private String race;
	private int level, hp;
	private int feats;
	private int skillpoints;
	private int baseAttackBonus;
	private int bonusFeats;
	private int strbonus, dexbonus, conbonus, wisbonus, intbonus, chabonus;
	private int fort, ref, will;
	
	public Fighter(int l, String r)
	{ 
		level = l;
		race = r;
		str = dex = con = intel = wis = cha = hp = 0;
		feats = skillpoints = baseAttackBonus = strbonus = dexbonus = conbonus = wisbonus = intbonus = chabonus = 0;
		fort = ref = will = 0;
	}
	public void setStats()
	{
		StatGen stats = new StatGen();
		stats.setStats();
		Random randomBool = new Random();
		boolean mainstat = randomBool.nextBoolean();
		if (mainstat)
		{
			str = stats.getMain();
			con = stats.getSecond();
			dex = stats.getThird();
		
		}
		else
		{
			dex = stats.getMain();
			con = stats.getSecond();
			str = stats.getThird();
		}
		intel = stats.getDump1();
		wis = stats.getDump2();
		cha = stats.getDump3();
		strbonus = stats.statBonus(str);
		dexbonus = stats.statBonus(dex);
		conbonus = stats.statBonus(con);
		wisbonus = stats.statBonus(wis);
		intbonus = stats.statBonus(intel);
		chabonus = stats.statBonus(cha);
	}
	public void setSaves()
	{
		Saves save = new Saves();
		save.setSaves("Fighter", level);
		ref = save.getDump1() + dexbonus;
		fort = save.getMain() + conbonus;
		will = save.getDump2() + wisbonus;
		
	}


	public void setFeats()
	{
			feats = 1 + (level/3);	
			bonusFeats = level/2 + 1;
			feats += bonusFeats;
			if (race == "Human")
				feats ++;
	}

	public void setSkills()
	{
		skillpoints = ((2 + intbonus) * 4) + ((2 + intbonus) * level);
		if (skillpoints <= 0)
			skillpoints = 4 + level;
		if (race == "Human")
			skillpoints += (4 + level);
	}
/*
	public void setHp()
	{
		hp = 10 + conbonus;
		for (int count = 0; count < (level - 1); count++)
		{
			//System.out.println("hp: " + hp);
			hp += hitpoints(10);
		}
	}
	*/
	/*
	private int hitpoints(int hitDie)
	{
		Random randomNumber = new Random();
		int hitp = (randomNumber.nextInt(hitDie) + 1 + conbonus);
		if (hitp <= 0)
			hitp = 1;
		return hitp;
}*/

	public void display()
	{
		BaseAttackBonus base = new BaseAttackBonus(level);
		base.setBab("Fighter");
		HitPoints hits = new HitPoints();
		hits.setHitpoints(level, conbonus, 10, "Fighter");
	
		String bab;

		//base attack bonus
		baseAttackBonus = base.getBab();
		bab = "Base attack bonus: + " + String.valueOf(baseAttackBonus);
		baseAttackBonus -= 5;
		while (baseAttackBonus > 0)
		{
			bab += ("/+" + String.valueOf(baseAttackBonus));
			baseAttackBonus -= 5;
		
		}
		JOptionPane.showMessageDialog(null, "Hit Points: " + hits.getHitpoints() + "\n" + "Strength: " + str + "     +" + strbonus + "\n" +
			"Dexterity: " + dex + "    +" + dexbonus + "\n" +
			"Constitution: " + con + "     +" + conbonus + "\n" +
			"Wisdom: " + wis + "     +" + wisbonus + "\n" +
			"Intelligence: " + intel + "     +" + intbonus + "\n" +
			"Charisma: " + cha + "     +" + chabonus + "\n" +
			"skillpoints " + skillpoints + "\n" +
			bab + "\n" + "Feats: " + feats + "\n" 
			+ bonusFeats + " of these are bonus feats" + "\n"
			+ "Fortitude: " + fort + "\n" + "Reflex: " + ref + "\n"
			+ "Will: " + will);

	}
	




}
