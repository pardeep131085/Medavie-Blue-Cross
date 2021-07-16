package com.medavie.blue.cross;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test 
 * @author Pardeep
 *
 */
public class CeilingFanTest {

	@Test
	public void testPullCord() {
		CeilingFan ceilingFan = new CeilingFan();
		Assert.assertEquals(ceilingFan.getSpeed(), FanConstant.OFF);
	}
	
	@Test
	public void testPullCordOneTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), 1);
	}
	
	@Test
	public void testPullCordTwoTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), 2);
	}
	
	@Test
	public void testPullCordThreeTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), FanConstant.MAX_SPEED);
	}
	
	@Test
	public void testPullCordFourTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), FanConstant.OFF);
	}
	
	@Test
	public void testPullCordReverseOneTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.reverseFanDirection();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), FanConstant.MAX_SPEED);
	}
	
	@Test
	public void testPullCordReverseOwoTime() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.reverseFanDirection();
		ceilingFan.pullCord();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), 2);
	}
	
	@Test
	public void testPullCordReverseForward() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.reverseFanDirection();
		ceilingFan.pullCord();
		ceilingFan.reverseFanDirection();
		ceilingFan.pullCord();
		Assert.assertEquals(ceilingFan.getSpeed(), FanConstant.OFF);
	}

	@Test
	public void testReverseFanDirection() {
		CeilingFan  ceilingFan = new CeilingFan();
		Assert.assertEquals(FanDirection.FORWARD, ceilingFan.getDirection());
		
		ceilingFan.reverseFanDirection();
		Assert.assertEquals(FanDirection.BACKWARD, ceilingFan.getDirection());
		
	}

}
