public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmount(int daysRented) {
        double amount = 0;
        switch (_priceCode) {
            case REGULAR:
                amount += 2;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                amount += daysRented * 3;
                break;
            case CHILDRENS:
                amount += 1.5;
                if (daysRented > 3) {
                    amount += (daysRented - 3) * 1.5;
                }
                break;
        }
        return amount;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        // AdicionarBônus para um aluguel de lançamento de dois dias
        if (_priceCode == NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
