import main.cos.cosinnego.Klasa;

public class Main2 {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.age);
        client.name = "Janusz";

        System.out.println(client.address);

        client.address = new Address();
        System.out.println(client.address.street);

        Klasa k = new Klasa();
    }
}
