package entities;

public class Orderitem {

  private Integer quantity;
  private Double price;

  //COMPOSIÇAO COM O PRUDUTO
  private Product product;

  public Orderitem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Orderitem() {}

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public double subTotal() {
    return price * quantity;
  }

  public String toString() {
    return (
      getProduct().getName() +
      ", $" +
      String.format("%.2f", price) +
      ", Quantity: " +
      quantity +
      ", Subtotal: $" +
      String.format("%.2f", subTotal())
    );
  }
}
