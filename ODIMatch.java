package com.cg.prg1;

public class ODIMatch extends Match {

final int totalOvers=50;
	
	@Override
	public float calculateRunrate() {
		// TODO Auto-generated method stub
		float reqRunRate = (getTargetScore()-getCurrentScore())/(totalOvers - getCurrentOver());
		return reqRunRate;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		
	int remainingBalls = (int) ((totalOvers*6)-(getCurrentOver()*6));
		return remainingBalls;
	}
}
