import java.math.BigDecimal;

public abstract class Movie {

	private String title;
	public String priceCode;

	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public abstract BigDecimal calculateFees(int days);

	public BigDecimal extraDays(int days, int allowed) {
		BigDecimal extraDays = new BigDecimal(days).subtract(new BigDecimal(allowed));
		if (extraDays.compareTo(BigDecimal.ZERO) == -1) {
			extraDays = BigDecimal.ZERO;
		}
		return extraDays;
	}

}

