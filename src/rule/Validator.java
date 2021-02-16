package rule;

import java.util.ArrayList;
import java.util.List;

import action.Action;
import game.State;

public class Validator {

	private List<Rule> rules;
	
	public Validator() {
		rules = new ArrayList<>();
	}
	
	public void isValid(State state, Action action) {
		for (Rule rule : rules) {
			rule.isValidAction(state, action);
		}
	}
	
}
