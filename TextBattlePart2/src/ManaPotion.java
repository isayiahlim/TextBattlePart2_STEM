/**
 * Name: 
 * Last Updated On: 
 * Mrs. Kankelborg
 * APCS Period 
 * Text Battle Project Part Two
 * 
 * This class is the represents a MagePotion object which is an Item. It must contain all of the fields
 * and methods detailed in the project spec. You 
 * may add additional fields and methods if you like.
 */

public class ManaPotion extends Item
{
	public ManaPotion(String rarity)
	{
		super("Mana Potion", rarity);
		if(super.getPoints() == 0)
			super.setRarity(rarity);
	}
	public void use(Player player)
	{
		if(player instanceof Mage)
		{
			int restore = getPoints();
			System.out.println(player.getName() + " used a " + super.getRarity() + " Mana "
				+ "Potion increasing their available mana by " + restore + " points.");
			((Mage) player).restoreMana(restore);
		}
		else
		{
			System.out.println("Only a mage can use a Mana Potion!");
		}
	}
}

