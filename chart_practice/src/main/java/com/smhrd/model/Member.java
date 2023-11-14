package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
	private int no;	
	private String name;	
	private String age;	
	private String gender;
	private int height;	
	private int weight;	
	private String trainer;	
	private String photopath;	
	private String job;	
	private String address;	
	private String regist_day;	
	private String phone_number;	
	private String email;	
	private String credit_card;	
	private String kakao_id;
}
