package datr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayRange {

	
	

	public static final String delimter = ",";
	public static int HighColumn = 3, LowColumn = 4;

	public static void read(String csvFile) {
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			String[] strArr;
			while ((str = br.readLine()) != null) {
				strArr = str.split(delimter);
				for (String obj : strArr) {
					System.out.print(obj + " ");
				}
				System.out.println();
			}
			br.close();
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public static void range(String csvFile) {
		try {
			List<Double> highArr = new ArrayList<Double>();
			List<Double> lowArr = new ArrayList<Double>();
			List<Double> rangeArr = new ArrayList<Double>();
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			String[] strArr;
			long lines = 0;
			String tempHigh = "", tempLow = "";
			double high = 0, low = 0, tempRange[];

			while ((str = br.readLine()) != null) {
				strArr = str.split(delimter);
				tempHigh = strArr[HighColumn];
				tempLow = strArr[LowColumn];
				try {
					high = Double.parseDouble(tempHigh);
					low = Double.parseDouble(tempLow);
				} catch (Exception e) {
					continue;
				}
				System.out.print("high :" + high);
				System.out.print("low :" + low);
				
				System.out.println((high - low));
				System.out.println();

			}

			br.close();

		} catch (IOException ioexception) {
			ioexception.printStackTrace();

		}

	}}
	
	
	

