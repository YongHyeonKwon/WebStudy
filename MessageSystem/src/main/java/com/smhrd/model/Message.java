package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Message {
	
	private int num;
	private String sendName;
	private String receiveEmail;
	private String message;
	private String m_date;
	
}
