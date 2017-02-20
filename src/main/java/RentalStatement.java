import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<Rental>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() throws UnsupportedEncodingException, FileNotFoundException {
		for (Rental r : rentals) {
			String printLine = "Price Code = " + r.getPriceCode() + "   Title = " + r.getTitle() + "    Fee = "
					+ r.calculateFees() + "    days = " + r.getDays();
			System.out.println(printLine);
			printf(printLine);
		}
		
	}

	public void printf(String printLine) throws UnsupportedEncodingException, FileNotFoundException {
		Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("RentalStatement.txt"), "utf-8"));
		try {
			writer.write(printLine);
		} catch (IOException ex) {
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}

	}
}
