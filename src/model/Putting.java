package model;

import java.util.ArrayList;

public class Putting
{

	private ArrayList<String> putts;
	private int greenLevel;
	private int greenSpeed;

	public ArrayList<String> getPutts()
	{
		return putts;
	}

	public void setPutts(ArrayList<String> putts)
	{
		this.putts = putts;
	}

	public int getGreenLevel()
	{
		return greenLevel;
	}

	public void setGreenLevel(int greenLevel)
	{
		this.greenLevel = greenLevel;
	}

	public int getGreenSpeed()
	{
		return greenSpeed;
	}

	public void setGreenSpeed(int greenSpeed)
	{
		this.greenSpeed = greenSpeed;
	}
}
