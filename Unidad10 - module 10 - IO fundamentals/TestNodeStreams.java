	import java.io.*;

	public class TestNodeStreams {
		public static void main(String [] args) {
		try {
			fileReader input = new FileReader(args[0]);
		} try {
			fileWriter output = new FileWrite(args[1]);
		}  try {
			char [] 	buffer = new char[128];
			int 		charsRead;

			//read the first buffer
			charsRead = input.read(buffer);

			while( charsRead != -1) {
				//Write buffer to the output file
				output.write(buffer, 0 , charsRead);

				//Read the next buffer
				charsRead = input.read(buffer);
			}

		} finally {
			output.close(); 
		} finally {
			input.close();
		}catch (IOExecption e) {
			e.printStackTrace();
		}
	  }
 }
	