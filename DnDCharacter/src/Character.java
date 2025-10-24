
public class Character {
    
    private int str;
    private int intl;
    private int dex;
    private int cha;
    private int cons;
    private int wis;
    
    
    public Character() {
	str = Dice.roll(6, 3);//composition is what Dice is
	intl = Dice.roll(6, 3);
	dex = Dice.roll(6, 3);
	cha = Dice.roll(6, 3);
	cons = Dice.roll(6, 3);
	wis = Dice.roll(6, 3);
    }

    public static String checkClass(Character c)
    {
	String type = "Rogue";
	if(c.str > 12) type = "Barbarian";
	if(c.cha > c.str) type = "Bard";
	if(c.wis > c.cha) type = "Wizard";
	else if (c.dex > c.wis) type = "Theif";
	
	return type;
    }
    public Character(int str, int intl, int dex, int cha, int cons, int wis) {
	super();
	this.str = str;
	this.intl = intl;
	this.dex = dex;
	this.cha = cha;
	this.cons = cons;
	this.wis = wis;
    }
   
    public int getStr() {
        return str;
    }
    public int getIntl() {
        return intl;
    }
    public int getDex() {
        return dex;
    }
    public int getCha() {
        return cha;
    }
    public int getCons() {
        return cons;
    }
    public int getWis() {
        return wis;
    }
    
    @Override
    public String toString() {
	return "Character [str=" + str + ", intl=" + intl + ", dex=" + dex + ", cha=" + cha + ", cons=" + cons
		+ ", wis=" + wis + "]";
    }
    
    

}
