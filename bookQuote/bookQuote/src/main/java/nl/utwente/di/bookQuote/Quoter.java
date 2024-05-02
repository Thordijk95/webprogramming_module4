package nl.utwente.di.bookQuote;

public class Quoter {

  public Quoter() {

  }

  public double getBookPrice(String book) {
    return switch (book) {
      case "1" -> 10.0;
      case "2" -> 45.0;
      case "3" -> 20.0;
      case "4" -> 35.0;
      case "5" -> 50.0;
      default -> 0.0;
    };
  }

}
