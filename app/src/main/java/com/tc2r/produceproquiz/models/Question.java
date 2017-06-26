package com.tc2r.produceproquiz.models;

/**
 * Created by Tc2r on 6/26/2017.
 * <p>
 * Description:
 */

public class Question {
	String question;
	String key;
	String details;

	public Question(String question, String key, String details) {
		this.question = question;
		this.key = key;
		this.details = details;

	}

	public Question(String question, String key) {
		this.question = question;
		this.key = key;
		this.details = "";

	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
