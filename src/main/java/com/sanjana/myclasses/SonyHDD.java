package com.sanjana.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonyHDD implements IHarddisk {

	@Override
	public void poweronHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Sony Hard-disk is Power ON");
	}

	@Override
	public void powerreadHDD() {
		// TODO Auto-generated method stub
		System.out.println("Reading from Sony 1TB @ 500 mbps");
	}

	@Override
	public void poweroffHDD() {
		// TODO Auto-generated method stub
		System.out.println("My Sony Hard-disk is Power OFF");
	}

}
