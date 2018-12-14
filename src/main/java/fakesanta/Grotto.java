package fakesanta;

public class Grotto extends Object{

	private String description;
	private boolean doorUnlocked;

	public Grotto(int xCoordinate,int yCoordinate) {
		super(xCoordinate, yCoordinate);
		this.setDescription("A locked door prevents you from entering there's a window to the side but it's covered over by something.");
		this.doorUnlocked = false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDoorUnlocked() {
		return doorUnlocked;
	}

	public void setDoorUnlocked(boolean doorLocked) {
		this.doorUnlocked = doorLocked;
	}

	public String openDoor(String answer) {
		if (answer.equals("y")) {
			if (doorUnlocked = false) {
				return "The door has a heavy knob (mmm knob). You struggle to open it. You give it a quick rub - the knob remains stiff. Maybe you should go find the key";
			} else {
				return "The knob feels ready to release. As you carress it you decide to slowly penetrate the hole with your new found key.The scene that confronts you is both shocking and slightly endearing. "
						+ "The first area of the room to peak your interest is the hallway where you find the dismembered body of an elf. +"
						+ "In the next you find the toy factory, machines still working away but no one there to manage them."
						+ "Suddenly you hear a noise behind you and you turn around to see a sharpened candy cane flying towards your face. END";
			}
		}
		else {
			return "Okay then.";
		}
	}

}
