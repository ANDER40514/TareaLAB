	import java.io.*;

	public class TestBufferedStreams {
		public static void main(String [] args) {
		try {
			fileReader input = new FileReader(args[0]);
			BufferedRead bufInput = new BufferedReader(input);
		} try {
			fileWriter output = new FileWrite(args[1]);
			BufferedRead bufOutput = new BufferedWriter(outuput);

		}  try {
			String line;
			// Read the first line
			line = bufInput.readline();

			while( charsRead != null) {
				//Write buffer to the output file
				bufOutput.write(line, 0, linea.length());
				bufOutput.newLine();

				//Read the next buffer
				line = bufInput.read(buffer);
			}

		} finally {
			bufOutput.close(); 
		} finally {
			bufInput.close();
		}catch (IOExecption e) {
			e.printStackTrace();
		}
	  }
 }
	