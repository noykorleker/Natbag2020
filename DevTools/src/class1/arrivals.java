package class1;

public class arrivals extends flights{
	
	public String comingFrom;

	public arrivals(String airline, String flightNum, int time, status eStatus, String comingFrom) {
		super(airline, flightNum, time, eStatus);
		this.comingFrom = comingFrom;
	}

	public String getComingFrom() {
		return comingFrom;
	}

	public void setComingFrom(String comingFrom) {
		this.comingFrom = comingFrom;
	}
	
	
}
