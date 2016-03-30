package model;

import java.util.ArrayList;

public class Chipping extends GolfStroke
{

	public Chipping()
	{
		this.setGreenLevel("Flat");
		this.setGreenSpeed("Medium");
		this.setStrokes(setupStrokes());
	}
	


	private ArrayList<String> setupStrokes()
	{
	
		ArrayList<String> distance = new ArrayList<String>();
		
		distance.add("150 yards");
		distance.add("100 yards");
		distance.add("50 yards");
		distance.add("200 yards");

		return distance;
	}

	@Override
	public boolean isFun()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSeries()
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isMulitplayer()
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void gameRate(int rating)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gameCatagory(String catagory)
	{
		// TODO Auto-generated method stub
		
	}
}
