package Controller;

import java.util.ArrayList;
import model.*;

public class InheritanceController
{

	private ArrayList<Gaymes> gaymesList;
	
	public InheritanceController()
	{
		gaymesList = new ArrayList<Gaymes>();
		
		setupGaymesList();
	}
	
	private void setupGaymesList()
	{
		gaymesList.add(new Chipping());
		gaymesList.add(new Driving());
	}
}
