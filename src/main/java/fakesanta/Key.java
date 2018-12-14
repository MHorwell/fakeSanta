package fakesanta;

public class Key extends Object{
	
	private boolean inInventory;
	
	public Key(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
		this.setDescription("It's a key in the shape of a Christmas tree.");
		this.inInventory = false;
	}

	public boolean isInInventory() {
		return inInventory;
	}

	public void setInInventory(boolean inInventory) {
		this.inInventory = inInventory;
	}

}
