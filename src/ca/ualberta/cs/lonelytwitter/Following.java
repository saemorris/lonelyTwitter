package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;


public class Following extends User
{
	ArrayList<User> following = new ArrayList<User>();

	@Override
	public void setName(String name) throws IOException
	{
		this.name = name;
	}
	
	public ArrayList<User> getFollowing()
	{
		return following;
	}


	public void setFollowing(ArrayList<User> following)
	{
		this.following = following;
	}

	public void follow(User u){
		following.add(u);
	}
	
	public void unfollow(User u){
		following.remove(u);
	}

}
