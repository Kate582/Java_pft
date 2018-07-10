package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String company;
  private final String address;
  private final String phone;

  public ContactData(String firstName, String lastName, String company, String address, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.address = address;
    this.phone = phone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }
}
