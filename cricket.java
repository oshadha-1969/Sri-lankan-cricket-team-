// cricket.java

import java.util.*;

public class cricket
{   //class fields
	private String name;
	private int age ;
	private String type;
	private double statistics;
	
	
	
	// With Parameters Constructor
	public cricket(String pName, int pAge,String pType, double pStatistics )
	{
		name = pName;
		age = pAge;
		type = pType;
	    statistics = pStatistics;
		
		
	}
	// Copy Constructor
	public cricket(cricket pCricket)
	{
		name = pCricket.getName();
		age = pCricket.getAge();
		type = pCricket.getType();
		statistics = pCricket.getStatistics();
	
	}
	// Default Constructor
	public cricket()
	{
		name = "Dawid Malan";
		age = 34;
		type = "batter";
                statistics =915.0;
		
		
		
	}
	
	// Following are the Accessors (getters)
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getStatistics()
	{
		return statistics;
	}
	
	//Following are the Mutators (setters)
	public void setName(String pName)
	{
		name = pName;
	}
	
	public void setAge(int pAge)
	{
		age = pAge;
	}
	
	public void setType(String pType)
	{
		type = pType;
	}
	
	public void setStatisics(double pStatistics)
	{
		statistics = pStatistics;
	}
	
    }

		
		
		
