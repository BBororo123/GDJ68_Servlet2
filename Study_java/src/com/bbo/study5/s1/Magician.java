package com.bbo.study5.s1;

public class Magician extends Character {
	
	
	public Magician() {
		super();//부모의 생성자를 호출
	}
	
	
	
	private int mp;
	
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
	public void getItem() {
		System.out.println("아이템 줍기");
	}
	
	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의
	//상속받은 메서드의 선언부는 동일하게 작성
	public void hit() {
		System.out.println("파이어볼");
	}
}
