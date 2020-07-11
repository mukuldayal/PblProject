package com.pbl.proj;
//import com.pbl.proj.Video;
import java.util.*;
public class VideoStore {
	List<Video> store= new ArrayList<Video>();
	
	public void addVideo(String name) {
		Video v=new Video(name);
		store.add(v);
		System.out.println("Video \""+name+"\" added successfully.");
	}
	
	public void doCheckout(String name) {
		Iterator<Video> itr=store.iterator();
		while(itr.hasNext()) {
			Video vn=itr.next();
			if(name.equals(vn.getName())) {
				vn.doCheckout();
				System.out.println("Video \""+name+"\" checked out successfully.");
				break;
			}
		}
		
	}
	
	public void doReturn(String name) {
		Iterator<Video> itr=store.iterator();
		while(itr.hasNext()) {
			Video vn=itr.next();
			if(name.equals(vn.getName())) {
				vn.doReturn();
				System.out.println("Video \""+name+"\" returned successfully.");
				break;
			}
		}
	}
	public void receiveRating(String name,int rating) {
		Iterator<Video> itr=store.iterator();
		while(itr.hasNext()) {
			Video vn=itr.next();
			if(name.equals(vn.getName())) {
				vn.receiveRating(rating);
				System.out.println("Rating \""+rating+"\" has been mapped to the Video \""+name+"\".");
				break;
			}
		}
	}
	public void listInventory() {
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.printf("%-15s|", "Video Name");
		System.out.printf("%20s|", "Checkout Status");
		System.out.printf("%10s%n", "Rating");
		Iterator<Video> itr=store.iterator();
		while(itr.hasNext()) {
			Video vn=itr.next();
			System.out.printf("%-15s|%20s|%10s%n",vn.getName() , vn.getCheckout(), vn.getRating());
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}

}



