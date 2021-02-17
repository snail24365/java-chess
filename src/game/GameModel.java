package game;

import command.InvalidActionException;
import command.action.Action;

public class GameModel {
	
	private State state;
	
	public GameModel() {
		state = new State();
	}
	
	public Result doAction(Action action) throws InvalidActionException {
		try {
			action.throwIfInvalid(state);
		} catch (InvalidActionException e) {
			throw e;
		}
		Result result = action.resolveAction(state);
		return result;
	}
	
	public State getState() {
		return state;
	}
}
