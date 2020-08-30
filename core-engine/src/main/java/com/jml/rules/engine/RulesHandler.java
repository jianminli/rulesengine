package com.jml.rules.engine;

public class RulesHandler<I, O> {

	Rule<I, O> currentRule;
	
	public RulesHandler(Rule<I,O> rule) {
		currentRule = rule;
	}
	
	public O verifyRules(I input) {
		
		return currentRule.verify(input);
		
	}
	
}
