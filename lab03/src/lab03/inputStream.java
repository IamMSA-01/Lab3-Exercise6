package lab03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class inputStream {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "data.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double utlization = 0;
			double totalUtilization = 0;
			int noOfRecords = 0;
			int id = 0;
			String station = "";
			String district = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				id= dis.readInt();
				station = dis.readUTF();
				district = dis.readUTF();
				utlization = dis.readDouble();
				System.out.println( id + "\t" + station+ "\t" +  district + "\t" + utlization);
				
				
			}
			
			// 4. Close stream
			dis.close();
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}

}
