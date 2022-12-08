package entities;

import enums.OrdemStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

  private Date moment;
  private OrdemStatus status;

  private Client client;

  private List<Orderitem> items = new ArrayList<Orderitem>();

  public Order() {}

  public Order(Date moment, OrdemStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public OrdemStatus getStatus() {
    return status;
  }

  public void setStatus(OrdemStatus status) {
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public List<Orderitem> getItems() {
    return items;
  }
}
