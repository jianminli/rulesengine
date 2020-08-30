package com.jml.rules.engine;

import com.jml.rules.engine.entity.Application;
import com.jml.rules.engine.entity.Result;

public class AgeRule extends Rule<Application, Application> {
	
	public AgeRule(Boolean enable) {
		super.setEnable(true);
	}
	
	@Override
	public Application verify(Application input) {
		System.out.println("In Age Rule Verification: input " + input);
		if(this.getEnable()) {
			// if age > 65 or <20 then reject
			if(input.getAge()>65 || input.getAge()<20) {
				input.setResult(new Result("rejected", "Failed at age rule"));
			}else {
				System.out.println("Pass age rule");
				input.setResult(new Result("passed", "Passed age rule"));
				super.verifyNext(input);
			}
		}
		return input;
	}

}
