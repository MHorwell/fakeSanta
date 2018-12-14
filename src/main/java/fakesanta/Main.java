package fakesanta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TerrainMap m = new TerrainMap();
		m.generateMap();

		Scanner s = new Scanner(System.in);
		int xCo = 4;
		int yCo = 5;
		int gxCo = 2;
		int gyCo = 3;
		Player player = new Player(xCo, yCo);
		Grotto grotto = new Grotto(gxCo, gyCo);
		Box present = new Box(1, 2);
		Key key = new Key(present.getxCoordinate(), present.getyCoordinate());
		Movement move = new Movement();

		m.placeGrotto(grotto);
		m.placePlayer(player);
		while (xCo == 4) {
			System.out.println("Move? N,S,E,W!");
			
			m.clearPlayer(player);
			move.checkInput(s.nextLine(), player);
			if(player.getxCoordinate() == grotto.getxCoordinate() && player.getyCoordinate() == grotto.getyCoordinate()) {
				if (key.isInInventory() == true) {
					System.out.println("Open the door?");
					String answer = s.nextLine();
					System.out.println(grotto.openDoor(answer));
					if (answer.equals("y")){
						break;
					}
				}
				else {
					System.out.println(grotto.getDescription());
				}
			}
			if(player.getxCoordinate() == present.getxCoordinate() && player.getyCoordinate() == present.getyCoordinate()) {
				System.out.println(present.getDescription());
				System.out.println("Open the box?");
				String open = s.nextLine();
				if (open.equals("y")){
					present.setOpen(true);
					System.out.println(present.getDescription());
					String takeKey = s.nextLine();
					if (takeKey.equals("y")){
						key.setInInventory(true);
					}
					
				}
			}
			m.placePlayer(player);
			
			//updateMovement();
			
			m.printMap();
		}
		s.close();
	}
}
