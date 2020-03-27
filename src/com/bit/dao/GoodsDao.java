package com.bit.dao;

import java.util.ArrayList;

public class GoodsDao {
	public int insertGoods(String item, int price) {
		System.out.println("상품을 등록하였습니다.");
		return 1;
	}
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("딸기");
		list.add("참외");
		list.add("수박");
		System.out.println(list.get(100));//의도적으로 예외를 발생시킴
		return list;
	}
}
