package com.hashedin;
  

public class Ratings{
	
 private int userid,movieid, ratings, timestamp;

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}
public int getTimestamp() {
	return timestamp;
}
public void setTimestamp(int timestamp) {
	this.timestamp = timestamp;
}



@Override
public String toString() {

	return "Ratings [userid=" + userid + ", movieid=" + movieid + ", ratings="
			+ ratings + ", timestamp=" + timestamp + "]";

}
 
 
	
	
}