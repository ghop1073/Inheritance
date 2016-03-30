package model;

import java.util.ArrayList;

public abstract class GolfStroke implements Gaymes
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
}
