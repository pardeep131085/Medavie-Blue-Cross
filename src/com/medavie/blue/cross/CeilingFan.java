package com.medavie.blue.cross;

/**
 * Ceiling Fan
 * 
 * @author Pardeep
 *
 */
public class CeilingFan {

	// setting fan direction
	private FanDirection direction = FanDirection.FORWARD;

	// setting fan speed to 0
	private int speed = FanConstant.OFF;

	public void pullCord() {
		if (speed == FanConstant.MAX_SPEED && direction == FanDirection.FORWARD) {
			speed = FanConstant.OFF;
		} else if (speed == FanConstant.OFF && direction == FanDirection.BACKWARD) {
			speed = FanConstant.MAX_SPEED;
		} else if (getDirection() == FanDirection.FORWARD) {
			speed++;
		} else {
			speed--;
		}
	}

	public void reverseFanDirection() {
		direction = (direction == FanDirection.FORWARD) ? FanDirection.BACKWARD : FanDirection.FORWARD;
	}

	public FanDirection getDirection() {
		return direction;
	}

	public int getSpeed() {
		return speed;
	}

}
