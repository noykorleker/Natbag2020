package class1;

public class departures extends flights {

	public String destination;
	
	public departures(String airline, String flightNum, int time, status eStatus, String destination) {
		super(airline, flightNum, time, eStatus);
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	
}
