package rule;

import action.Action;
import game.State;

public interface Rule {
	boolean isValidAction(State state, Action action);
}
