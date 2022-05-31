/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a Rogue object which is a Player. It must contain all of the fields and 
 * methods detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */
public class Rogue extends Player
{
	private double critChance;
	public Rogue(String name, double critChance)
	{
		super(name + " the Rogue", 75, 1, 10);
		if(critChance >= 1 || critChance <= 0)	
			this.critChance = 0.1;
		else
			this.critChance = critChance;
	}
	public int attack(Monster monster)
	{
		double chance = Math.random();
		if (chance < critChance)
		{
			System.out.println(getName() + " gets a critical hit!");
			return 2 * super.attack(monster);
		}
		else 
			return super.attack(monster);
	}
	public double getCrit()
	{
		return critChance;
	}
}
