package com.jml.rules.engine;

import com.jml.rules.engine.entity.Application;
import com.jml.rules.engine.entity.Gender;
import com.jml.rules.engine.entity.Result;

public class GenderRule extends Rule<Application, Application> {

	public GenderRule(Boolean enable) {
		super.setEnable(enable);
	}
	
	@Override
	public Application verify(Application input) {
		System.out.println("In Gender Rule Verification: input " + input);
		if(this.getEnable()) {
			// Reject if gender is neutral
			if(input.getGender().equals(Gender.NEUTRAL)) {
				input.setResult(new Result("rejected", "Failed at gender rule"));
			}else {
				input.setResult(new Result("passed", "passed the gender rule"));
				super.verifyNext(input);
			}
		}
		return input;
	}

}
