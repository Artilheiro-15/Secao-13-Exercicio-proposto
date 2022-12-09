import entities.Client;
import entities.Order;
import entities.Orderitem;
import entities.Product;
import enums.OrdemStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    //ENUNCIADO DO EXERCICIO
    //LER OS DADOS DE UM PEDIDO COM N ITENS(NFORNECIDO PELO O USUARIO).DEPOIS
    //MOSTRAR UM SUMARO DO PEDIDO CONFORME EXEMPLO, NOTA: O INSTANTE DO PEDIDO
    //DEVE SER O INSTANTE DO SISTEMA: NEW DATE().

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("=================================");
    System.out.println("Insira os Dados Do Cliente: ");
    System.out.print("Nome: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Data De Nascimento(dd/MM/yyyy): ");
    Date birethDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birethDate);

    System.out.println("=================================");
    System.out.println("Insira Os Dados do Pedido: ");
    System.out.print("Status: ");
    OrdemStatus status = OrdemStatus.valueOf(sc.next());

    //com essa linha eu estou instanciando dentro da memoria o objeto Order associado ao cliente
    Order order = new Order(new Date(), status, client);

    System.out.print("Quantos Itens Cabem Neste Pedido? ");
    int N = sc.nextInt();
    System.out.println("=================================");
    for (int i = 1; i <= N; i++) {
      System.out.println("Digite os Dados Do item nº: " + i);
      System.out.print("Nome Do Produto: ");
      sc.nextLine();
      String producName = sc.nextLine();
      System.out.print("Preço Do Produto: ");
      double producPrice = sc.nextDouble();
      System.out.print("Quantidade: ");
      int quantity = sc.nextInt();
      System.out.println("=================================");
      //tenho que instancia product
      Product product = new Product(producName, producPrice);

      //aki foi criado na memoria um objto ordemItem asosiado a um objeto produto
      Orderitem it = new Orderitem(quantity, producPrice, product);

      //agora foi adicionado ordemItem dentro da lista de itens do pedido!
      // como eu ja estanciei o order acima do for eu nao presiso estanciar agr
      order.addItem(it);
    }
    System.out.println("=================================");
    System.out.println(order);
    System.out.println("=================================");
    sc.close();
  }
}
