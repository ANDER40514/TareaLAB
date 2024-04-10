import java.io.*;
import java.util.Date;

public class SerializeDate {
	SerializeDate() {
		Date d = new Date ();
		try {
			FileOutputStream f = new FileOutputStream ("date.ser");
			ObjectOutputStream s = new ObjectOutputStream (f);
			s.WriteObject(d);
			s.close();
		} catch (IOExcepcion e) {
			e.printStackTrace();
		}
	}

	public static void main( String args []) {
		new SerializeDate();
	}
}