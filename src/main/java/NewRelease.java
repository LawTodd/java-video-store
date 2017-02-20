import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "newRelease");
	}

	private String priceCode = "new release";
	private BigDecimal amount;

	public String getPriceCode() {
		return priceCode;
	}

	@Override
	public BigDecimal calculateFees(int days) {
		amount = new BigDecimal("3.00").multiply(new BigDecimal(days));
		return amount;
	}
}
