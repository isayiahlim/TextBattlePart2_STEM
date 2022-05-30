/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a StrenghPotion object which is an Item. It must contain all of the fields 
 * and methods detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */
public class StrengthPotion extends Item
{
	public StrengthPotion(String rarity)
	{
		super("Strength Potion", rarity);
		if(super.getPoints() == 0)
			super.setRarity(rarity);
	}
	public void use(Player player)
	{
		System.out.println(player.getName() + " used a " + super.getRarity() + " Strength Potion "
				+ "increasing their min and max damage by " + getPoints() + " points.");
	}
}