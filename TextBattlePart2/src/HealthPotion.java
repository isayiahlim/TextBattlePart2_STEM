/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a HealthPotion object which is an Item. It must contain all of the fields and methods 
 * detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */
public class HealthPotion extends Item
{
	public HealthPotion(String rarity)
	{
		super("Health Potion", rarity);
		if(super.getPoints() == 0)
			super.setRarity(rarity);
	}
	public void use(Player player)
	{
		int heal = getPoints();
		System.out.println(player.getName() + " used a " + super.getRarity() + " Health Potion "
				+ "increasing their available health by " + heal + " points.");
		player.healDamage(heal);
	}
}
