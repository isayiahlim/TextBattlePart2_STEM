/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a Mage object which is a Player. It must contain all of the f
 * fields and methods detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */
public class Warrior extends Player
{
	private double shieldStrength;
	public Warrior(String name, double shieldStrength)
	{
		super(name, 125, 5, 15);
		if(shieldStrength >= 1 || shieldStrength <= 0)	
			this.shieldStrength = 0.1;
		else
			this.shieldStrength = shieldStrength;
	}
	public void takeDamage(int damage)
	{
		int reduce = (int)(damage * shieldStrength);
		if(reduce < 1)
			reduce = 1;
		System.out.println(getName() + " blocks " + reduce + " points of damage.");
		super.takeDamage(damage - reduce);
	}
	public double getBlock()
	{
		return shieldStrength;
	}
}

