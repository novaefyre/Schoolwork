package testing;

public class Item {
	
	private String desc;
	private boolean purchased;

	public Item(String d) {
		desc = d;
		purchased = false;
	}
	
	public void setP(boolean b){
		purchased = b;
	}

	public boolean isPurchased() {
		// TODO Auto-generated method stub
		return purchased;
	}

	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}

}
