package com.dmdev.oop.task;

public class TimeInterval {

	private int seconds;
	private int minutes;
	private int hours;

	public TimeInterval(int totalSecond) {
		// 3750
		this.hours = totalSecond / 3600;
		this.minutes = totalSecond % 3600 / 60;
		this.seconds = totalSecond % 3600 % 60;
	}

	/**
	 * @param seconds
	 * @param minutes
	 * @param hours
	 */
	public TimeInterval(int seconds, int minutes, int hours) {
		super();
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public int totalSeconds() {
		return seconds + minutes * 60 + hours * 60 * 60;
	}

	
	public TimeInterval sum(TimeInterval second) {
		return new TimeInterval(this.totalSeconds()+second.totalSeconds());
	}
	
	
	public void print() {
		System.out.println("h-> " + hours + " m-> " + minutes + " s-> " + seconds);
	}
}
