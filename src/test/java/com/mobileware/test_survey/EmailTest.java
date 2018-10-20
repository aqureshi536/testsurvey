package com.mobileware.test_survey;

import com.mobileware.common.Emailer;

public class EmailTest {

	public static void main(String[] args) {
		Emailer email =new Emailer();
		email.sendEmail("aqureshi536@gmail.com", "Test", "Hello");
	}

}
