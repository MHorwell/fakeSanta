package fakesanta;

public class Box{
	
	private String boxDescription;
	private boolean isOpen;
	private int xCoordinate;
	private int yCoordinate;
	
	public Box(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.boxDescription =  "It's a box wrapped in black wrapping paper with a gold ribbon that's been stained red by something...";
		this.isOpen = false;
	}

	public String getBoxDescription() {
		return boxDescription;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public void setBoxDescription(String boxDescription) {
		this.boxDescription = boxDescription;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	

}
