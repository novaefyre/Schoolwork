package sort;

public class Pokemon {
	
	@SuppressWarnings("unused")
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	

	public Pokemon(String name, int level)
	{
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}


	public void lapse() {
		// TODO Auto-generated method stub
		if(poisoned)
		{
			hp -= 15; 
		}
	}

	public void setPoisoned(boolean b) {
		// TODO Auto-generated method stub
		poisoned = b;
	}


	public void setHP(int newHP) {
		// TODO Auto-generated method stub
		hp = newHP;
	}


	public String getName() {
		return name;
		
	}

	public int getHp() {
		return hp;
		
	}

	public  void iChooseYou() {
		// TODO Auto-generated method stub
			System.out.println(name + " " + name);
		
	}
	
	public void attack(Pokemon target, Attack attack)
	{
		if(Math.random() < 0.9)
		{
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else
		{
			System.out.println("The attack missed");
		}
	}



}
