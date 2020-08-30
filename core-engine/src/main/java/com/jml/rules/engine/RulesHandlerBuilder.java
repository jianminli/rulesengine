package com.jml.rules.engine;

public class RulesHandlerBuilder<I,O> {

	Rule<I, O> currentRule;
	
	public RulesHandlerBuilder<I, O> register(Rule<I,O> rule) {
		if (null == currentRule) {
			currentRule = rule;
		} else {
			currentRule.setNext(rule);
		}
		return this;
	}
	
	public RulesHandler<I, O> build() {
		return new RulesHandler<I, O>(currentRule);
	}
	
}
