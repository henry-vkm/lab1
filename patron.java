// patron class
public static class Patron 
{
  // data fields for patron info
  private String name;
  private String libraryCardNumber;
  private String address;
  private String city;
  private String state;
  private String zip;

  // constructor
  public Patron(String name, String libraryCardNumber, String address, String city, String state, String zip) {
    this.name = name;
    this.libraryCardNumber = libraryCardNumber;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    }
  }
}