import java.math.BigDecimal;

public class Rental {
	
	private Movie rented;
	private int days;

	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.setDays(days);
	}

	public BigDecimal calculateFees() {
		BigDecimal fee = rented.calculateFees(getDays());
		return fee;
	}
	
	public String getTitle() {
		return rented.getTitle();
	}
	
	public String getPriceCode() {
		return rented.priceCode;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
}
