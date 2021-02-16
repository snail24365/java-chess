package game;

import java.util.Scanner;

import Renderer.ConsoleRenderer;
import Renderer.Renderer;

public class GameSystem {
	public static void main(String[] args) {

		GameModel model = new GameModel();
		Scanner scanner = new Scanner(System.in);
		Renderer renderer = new ConsoleRenderer();
		State state = model.getState();
		
		String command = "";
		renderer.render(state);
		while (!command.equals("q!")) {
			command = scanner.next();
			renderer.render(state);
		}
	}
}
