package datr;
import datr.Result1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import datr.DayRange;
import datr.Range29th;
public class CSVoutput {

	
		 public static void main(String args[]) throws IOException 
		   {
			 File file =new File("C:\\\\Users\\\\user\\\\Desktop\\\\out12.csv");
			  FileWriter csvFile=new FileWriter(file);
			  BufferedWriter br = new BufferedWriter(csvFile);
			  boolean exists = file.exists();
			if(exists)
			{
		   br.write("Range1");
		    br.write(",");
		    br.write("Range2");
		   br.write(",");
		  br.write("Range3");
		 // br.write(",");
		  //br.write("Range4");
		  DayRange day1=new DayRange();
		  for(int a=0;a<day1.rangeArr.size();a++)
			   {
			  
			    csvFile.write((day1.rangeArr.get(a)));
			    }  	
		  }
		    
		   
	br.flush();
	br.close();
		 
	}
		  /*  for(int a=0;a<day.rangeArr.size();a++)
		}    {
		    csvFile.write((day.rangeArr.get(a)));
		    }
		   */


		 
	
	}


