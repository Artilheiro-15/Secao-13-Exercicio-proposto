package entities;

import entities.Orderitem;
import enums.OrdemStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

  private static SimpleDateFormat sdf = new SimpleDateFormat(
    "dd/MM/yyyy HH:mm:ss"
  );

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

  public void addItem(Orderitem item) {
    items.add(item);
  }

  public void revoveItem(Orderitem item) {
    items.remove(item);
  }

  public double total() {
    double sum = 0.0;
    for (Orderitem it : items) {
      sum = sum + it.subTotal();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: ");
    sb.append(sdf.format(moment) + "\n");
    sb.append("Order status: ");
    sb.append(status + "\n");
    sb.append("Client: ");
    sb.append(client + "\n");
    sb.append("Order items:\n");
    for (Orderitem item : items) {
      sb.append(item + "\n");
    }
    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }
}
