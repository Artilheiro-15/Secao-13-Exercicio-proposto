package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private String name;
  private String email;
  private Date birethDate;

  public Client() {}

  public Client(String name, String email, Date birethDate) {
    this.name = name;
    this.email = email;
    this.birethDate = birethDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirethDate() {
    return birethDate;
  }

  public void setBirethDate(Date birethDate) {
    this.birethDate = birethDate;
  }

  public String toString() {
    return name + " (" + sdf.format(birethDate) + ") - " + email;
  }
}
