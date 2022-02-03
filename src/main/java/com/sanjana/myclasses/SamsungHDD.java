package com.sanjana.myclasses;

import org.springframework.stereotype.Component;

@Component
public class SamsungHDD implements IHarddisk {

	@Override
	public void poweronHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Samsung Hard-disk is Power ON");
	}

	@Override
	public void powerreadHDD() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Samsung 500GB @ 200 mbps");
	}

	@Override
	public void poweroffHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Samsung Hard-disk is Power OFF");
	}

}
