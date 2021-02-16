package game;

import action.Action;
import action.InvalidActionException;
import rule.Validator;

public class GameModel {
	
	private Validator validator;
	private State state;
	
	public GameModel() {
		validator = new Validator();
		state = new State();
	}
	
	public Result doAction(Action action) throws InvalidActionException {
		try {
			action.validateAction(state);
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
