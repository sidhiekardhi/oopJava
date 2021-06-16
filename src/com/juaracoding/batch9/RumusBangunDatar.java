package com.juaracoding.batch9;

public class RumusBangunDatar extends TampilBangunDatar {
	
	@Override
	public void luasSegitiga() {
		System.out.println("ini rumus luas segitiga");
	}
	
	public void luasSegitiga(String nama) {
		System.out.println("ini adalah luas segitiga " + nama);
	}
	
	public void luasSegitiga(int a, int tinggi) {
		double luas= 0.5*a*tinggi;
		System.out.println("luas segitiga adalah " + luas);
	}
	
	//mantap

}
