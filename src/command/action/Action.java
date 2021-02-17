package command.action;

import command.InvalidActionException;
import game.Result;
import game.State;

public interface Action {
	public void validateAction(State state) throws InvalidActionException;
	public Result resolveAction(State state);
}