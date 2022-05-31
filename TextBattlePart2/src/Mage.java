/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a Mage object which is a Player. It must contain all of the fields and methods 
 * detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */
public class Mage extends Player
{
	private int mana;
	private int maxMana;
	public Mage(String name, int mana) 
	{
		super(name, 50, 5, 10);
		if(mana <= 0)
			this.mana = 50;
		else
			this.mana = mana;
		maxMana = this.mana;
	}
	public int attack(Monster monster)
	{
		int cost = (int)(Math.random()*(maxMana/2) + 1);
		if(mana - cost < 0)
		{
			System.out.println("Not enough mana!");
			return 0;
		}
		else
		{
			mana -= cost;
			System.out.println("Name has " + mana + " mana left.");
			return super.attack(monster);
		}
	}
	public void restoreMana(int restore)
	{
		if(mana + restore >= maxMana)
			mana = maxMana;
		else
			mana += restore;
	}
	public int getMana()
	{
		return mana;
	}
	public void useMana(int reduce)
	{
		if(mana - reduce > 0)
			mana -= reduce;
		else
			mana = 0;
	}

}

