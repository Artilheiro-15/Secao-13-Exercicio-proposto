import entities.Client;
import entities.Orderitem;
import entities.Product;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Client cli = new Client(
      "Maria",
      "maria@gmail.com",
      sdf.parse("24/05/2001")
    );

    System.out.println(cli);
  }
}
