package com.setup;
import java.util.*;
import java.io.*;

public class PropertiesUtils 
{

public static String getLocator(String locatorName) 
	    
	{
	        Properties locatorvalue=new Properties();
	        FileReader fr;
			try 
			{
				fr = new FileReader("resources/Constants.properties");
		        locatorvalue.load(fr);        

			} 
			catch (FileNotFoundException e) 
			{	
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	        String s=locatorvalue.getProperty(locatorName);
			return s;
	             
    }
}
