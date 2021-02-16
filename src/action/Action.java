package action;

import game.Result;
import game.State;
import rule.Rule;

public interface Action {
	public void validateAction(State state) throws InvalidActionException;
	public Result resolveAction(State state);
}