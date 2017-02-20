import java.math.BigDecimal;

public class Childrens extends Movie {

	public Childrens(String title) {
		super(title, "childrens");
	}

	private String priceCode = "childrens";
	private BigDecimal amount;
	private int allowed = 3;

	public String getPriceCode() {
		return priceCode;
	}

	@Override
	public BigDecimal calculateFees(int days) {
		amount = new BigDecimal("1.50").add(new BigDecimal("1.50").multiply(extraDays(days, allowed)));
		return amount;
	}
}
