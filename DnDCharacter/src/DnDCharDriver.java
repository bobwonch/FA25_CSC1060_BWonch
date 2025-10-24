
public class DnDCharDriver {

    public static void main(String[] args) {
	Character hero = new Character();
	Character me = new Character(18, 18, 10, 17, 18, 15);
	System.out.println(hero);
	System.out.println(Character.checkClass(hero));
	
	System.out.println(me);
	System.out.println(Character.checkClass(me));

    }

}
