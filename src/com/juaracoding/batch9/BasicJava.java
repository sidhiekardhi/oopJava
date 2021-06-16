package com.juaracoding.batch9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Heroes hero= new Heroes();
//		hero.sound();
//		
//		
//		hero= new Monster();
//		hero.sound();
		
//		hero.healtpoint=0;
//		
//		if (hero.healtpoint <= 0) {
//			System.out.println("matiii");
//		} else {
//			System.out.println("hidup");
//		}
		
//		Monster monster = new Monster();
//		monster.healtpoint=70;
//		
//		monster.soundMonster();
		
		
		
		 
//		TampilBangunDatar bangun = new TampilBangunDatar();
//		bangun.luasSegitiga();
		
		RumusBangunDatar bangun2 = new RumusBangunDatar();
		bangun2.luasSegitiga();
		bangun2.luasSegitiga("Siku siku");
		bangun2.luasSegitiga(6, 7);
	}
	
	
	
	static void LuasPersegi() {
		int sisi= 5;
		int luas = sisi*sisi;
		System.out.println(luas);
	}
	
	static int LuasPersegipanjang2(int p) {
		int l= 10;
//		System.out.println(p);
//		System.out.println(l);
		return p*l;
	}
}

class PersegiPanjang{
	double LuasPersegipanjang(int p, int l) {
		System.out.println(p);
		System.out.println(l);
		return p*l;
	}
	
	int LuasPersegipanjang2(int p) {
		int l= 10;
		System.out.println(p);
		System.out.println(l);
		return p*l;
	}
}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}


//Scanner sc =new Scanner(System.in);
//System.out.println("masukkan baris");
//int baris = sc.nextInt();
//System.out.println("masukkan kolom ");
//int kolom= sc.nextInt();
//int matriks [][]= new int[baris] [kolom];
//
//for (int i = 0; i < baris; i++) {
//	for (int j = 0; j < kolom; j++) {
//		System.out.println("Masukkan array ke ["+i+"]"+"["+j+"]");
//		matriks[i][j]= sc.nextInt();	
//	}
//}
//
//for (int i = 0; i < baris; i++) {
//	for (int j = 0; j < kolom; j++) {
//		System.out.print(matriks[i][j]);
//	}
//	System.out.println();
//}




//int number[]= {1,3,4,5,7,5};
//System.out.println(number.length);
//System.out.println(number[5]);
//
//String buah [] = {"manggis", "semangka", "pisang", "jeruk"};
//
////System.out.println(buah[1]);
//
//for (int i = 0; i < buah.length; i++) {
////	System.out.println("nama nama buah " + buah[i]);
//}
//
//ArrayList<String> sayur = new ArrayList();
//sayur.add("kangkung");
//sayur.add("bayam");
//sayur.add("kubis");
//sayur.add("kol");
//sayur.add("wortel");
//
//sayur.remove("bayam");
//
////System.out.println(sayur);
//
//ArrayList<Integer> numberr= new ArrayList();
//numberr.add(4);
//numberr.add(1);
//numberr.add(2);
//numberr.add(5);
////System.out.println("ini integer "+numberr);
//
//List<String> buahh = new ArrayList();
//buahh.add("rambutan");
//buahh.add("Jambu");
////System.out.println(buahh);
//
// Person person= new Person("sidik", 25);
//// System.out.println(person.name);
//// System.out.println(person.age);
// 
// PersegiPanjang pp = new PersegiPanjang();
//// System.out.println(pp.LuasPersegipanjang(5, 7));
//// System.out.println(pp.LuasPersegipanjang2(6));
//
// System.out.println(LuasPersegipanjang2(3));
// LuasPersegi();


//class Animal {
//	  public void animalSound() {
//	    System.out.println("The animal makes a sound");
//	  }
//	  
//	}
//
//	class Pig extends Animal {
//	  public void animalSound() {
//	    System.out.println("The pig says: wee wee");
//	  }
//	}
//
//	class Dog extends Animal {
//	  public void animalSound() {
//	    System.out.println("The dog says: bow wow");
//	  }
//	}

//	class Main {
//	  public static void main(String[] args) {
//	    Animal myAnimal = new Animal();
//	    Animal myPig = new Pig();
//	    Animal myDog = new Dog();
//	        
//	    myAnimal.animalSound();
//	    myPig.animalSound();
//	    myDog.animalSound();
//	  }
//	}



