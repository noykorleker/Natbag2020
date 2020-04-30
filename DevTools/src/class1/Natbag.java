package class1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Natbag {

	private flights[] flights;
	private int numOfFlights = 0;
	private static int flightNumGen;
	private int MAX_NUM_OF_FLIGHTS = 100;

	public Natbag() {
		this.flights = new flights[MAX_NUM_OF_FLIGHTS];
		this.numOfFlights = flightNumGen++;
	}

	public boolean addFlight(flights flight) {
		flights[numOfFlights++] = flight;
		return true;
	}

	public void sortFlights() {
		for (int i = 0; i < flights.length; i++) {
			for (int j = 0; j < flights.length; j++) {
				if (flights[i] != null && flights[j] != null && flights[i].dateTime.compareTo(flights[j].dateTime) < 0) {
					swap(flights, i, j);
				}
			}
		}
	}


	public flights[] getFlights() {
		return flights;
	}

	private void swap(flights[] allFlights, int i, int j) {
		flights temp = flights[i];
		flights[i] = flights[j];
		flights[j] = temp;
	}

	public flights searchFlight(String flightNum) {
		flights f = null;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i].getFlightNum().equals(flightNum)) {
				f = flights[i];
			}
		}
		return f;
	}

	public void save(String fileName) throws FileNotFoundException {
		File f = new File(fileName);
		PrintWriter pw = new PrintWriter(f);
		pw.println(toString());
		pw.close();
	}

	public String toString() {
		String arr = "";
		String dep = "";
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null && flights[i].arriving) {
				arr += flights[i].toString();
			}
		}
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null && !flights[i].arriving) {
				dep += flights[i].toString();
			}
		}
		return "Departing flights: \n" + dep + "\n" + "Arriving flights: \n" + arr;
	}


}
