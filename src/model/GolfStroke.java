package model;

import java.util.ArrayList;

public abstract class GolfStroke implements Gaymes, Comparable
{

	private ArrayList<String> strokes;
	private String greenLevel;
	private String greenSpeed;

	public ArrayList<String> getStrokes()
	{
		return strokes;
	}

	public void setStrokes(ArrayList<String> strokes)
	{
		this.strokes = strokes;
	}

	public String getGreenLevel()
	{
		return greenLevel;
	}

	public void setGreenLevel(String greenLevel)
	{
		this.greenLevel = greenLevel;
	}

	public String getGreenSpeed()
	{
		return greenSpeed;
	}

	public void setGreenSpeed(String greenSpeed)
	{
		this.greenSpeed = greenSpeed;
	}
	
	public String toString()
	{
		String golfStrokeDescription = "This is a stroke object of type "+ this.getClass().getName();
		
		return golfStrokeDescription;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Gaymes)
		{
			
		}
		return comparedValue;
	}
}
