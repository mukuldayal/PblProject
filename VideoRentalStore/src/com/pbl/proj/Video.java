package com.pbl.proj;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	
	public Video(String name){
		this.videoName=name;
		this.checkout=false;
		this.rating=0;
	}
	 public String getName() {
		 return this.videoName;
	 }
	 public void doCheckout() {
		 this.checkout=true;
	 }
	 public void doReturn() {
		 this.checkout=false;
	 }
	 public void receiveRating(int rating) {
		 this.rating=rating;
	 }
	 public int getRating() {
		 return this.rating;
	 }
	 public boolean getCheckout() {
		 return this.checkout;
	 }
}
