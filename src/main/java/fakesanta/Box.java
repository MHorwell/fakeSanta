package fakesanta;

public class Box extends Object{
	
	private boolean isOpen;
	
	public Box(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
		this.setDescription("It's a box wrapped in black wrapping paper with a gold ribbon that's been stained red by something...");
		this.isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
		if (this.isOpen == true) {
			this.setDescription("Inside the box you see a key. Take key?");
		}
	}
	

}
