package com.verizontraining.springdidemocollection;

import java.util.Map;

public class StateLanguages {

	private Map<String,String> stateLanguages;

	public Map<String, String> getStateLanguages() {
		return stateLanguages;
	}

	public void setStateLanguages(Map<String, String> stateLanguages) {
		this.stateLanguages = stateLanguages;
	}

	@Override
	public String toString() {
		return "StateLanguages [stateLanguages=" + stateLanguages + "]";
	}
	
	
}
