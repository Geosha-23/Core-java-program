package com.tnsif.day7.overriding;

public class SBI extends RBI{
	@Override
	public float getRateOfInterest()
    {
  	  return 6.1f;
    }

	public SBI getObject() {
		return this;
	}
}
