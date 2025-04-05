package a3.midicsvparser;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import a3.midieventdata.*;

/**
 * MidiCsvParser - This class will contain methods designed to parse
 * through a .csv file, extract the data, put it in the appropriate format, and 
 * return it as a midiDataList object.
 */
public class MidiCsvParser {
	/**
	 * public static List<MidiEventData> parseCsv() - This 
	 * method will take a string as a parameter and read the file
	 * at the location determined within the string. It will parse
	 * through the data in the file, extracting what it needs into 
	 * appropriate variables before adding it all to one object and 
	 * returning it.
	 * @param f - String that should contain the path to the file you wish to read
	 * @return
	 */
	public static List<MidiEventData> parseCsv(String f) {
		//System.out.println(new File(".").getAbsolutePath());
		List<String> csvRawLines = new ArrayList<String>();
		
		try (Scanner scanner = new Scanner(new File(f))){
			while(scanner.hasNextLine()) {
				csvRawLines.add(scanner.nextLine());
			}
			
			scanner.close();
		}
		catch(Exception e) {
			System.out.println("File not found!");
		}
		
		List<MidiEventData> midiDataList = new ArrayList<>();
		
		for(String s : csvRawLines) {
			List<String> v = new ArrayList<String>();
			
			try(Scanner rowScanner = new Scanner(s)) {
				rowScanner.useDelimiter(",");
				
				while(rowScanner.hasNext()) {
					v.add(rowScanner.next());
				}
				rowScanner.close();
			}
			
			int onOff = 1;
			if(v.get(1) == "Note_off_c") {
				onOff = 0;
			}
			
			MidiEventData newData = new MidiEventData(Integer.parseInt(v.get(0)), Integer.parseInt(v.get(4)), Integer.parseInt(v.get(3)), Integer.parseInt(v.get(2)), Integer.parseInt(v.get(5)), onOff);
			midiDataList.add(newData);
		}

		return midiDataList;
	}
}
