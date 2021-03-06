package com.jml.rules.engine.entity;

public class Result {

	private String decision;
	private String reason;
	
	public Result(String decision, String reason) {
		super();
		this.decision = decision;
		this.reason = reason;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Result [decision=" + decision + ", reason=" + reason + "]";
	}
	
}
