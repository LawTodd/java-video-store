import java.math.BigDecimal;

public class Regular extends Movie {

	public Regular(String title) {
		super(title, "regular");
	}

	private String priceCode = "regular";
	private BigDecimal amount;
	private int allowed = 2;

	public String getPriceCode() {
		return priceCode;
	}

	@Override
	public BigDecimal calculateFees(int days) {
		amount = new BigDecimal("2.00").add(new BigDecimal("1.50").multiply(extraDays(days, allowed)));
		return amount;
	}
}
