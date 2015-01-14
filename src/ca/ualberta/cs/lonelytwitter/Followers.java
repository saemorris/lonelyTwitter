package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;


public class Followers extends User
{

	ArrayList<User> followers = new ArrayList<User>();

	@Override
	public void setName(String name) throws IOException
	{
		this.name = name;
	}
	
	public void setFollowers(ArrayList<User> followers){
		this.followers = followers;
	}
	
	public ArrayList<User> getFollowers(){
		return followers;
	}

	public void addFollower(User u){
		followers.add(u);
	}
	
	public void deleteFollower(User u){
		followers.remove(u);
	}
}
