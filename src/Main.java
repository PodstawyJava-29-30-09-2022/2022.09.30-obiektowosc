public class Main {
    public static void main(String[] args) {
        Client k1 = new Client();
        Client k2 = new Client();

        k1.name = "Mateusz";
        k1.surname = "Bereda";
        k1.age = 30;
        k1.pesel = "23423423423";

        k2.name = "Janusz";

        System.out.println(k1.name);

        Client k3 = new Client();
        Client k4 = k3;

        k3.name = "Janusz";
        System.out.println(k3.name);
        System.out.println(k4.name);

        k4.name = "Piotr";
        System.out.println(k3.name);
        System.out.println(k4.name);

        int[] tab = new int[10];
        int[] tab2 = tab;

        tab[0] = 5;
        System.out.println(tab2[0]);

        Address address = new Address();
        address.city = "Krakow";
        address.postCode = "12-123";
        address.no = "5";
        address.street = "Jakas";

        Client client = new Client();
        client.name = "Karol";
        client.surname = "Kowalski";
        client.age = 40;
        client.pesel = "23452345";
        client.address = address;

        System.out.println(client.address.street);

        String s = "Karol";
        client.name = s;

        System.out.println(client);

        double wynik = client.add(17.6, 8.6);
        System.out.println(wynik);

        int wynik2 = client.add(13, 7);
        System.out.println(wynik2);

        int wynik3 = client.add(49, 59);
        System.out.println(wynik3);

        Service.a = 234;
        Service.policzCos(34);

        k4.powiedzJakMaszNaImie();
        client.powiedzJakMaszNaImie();

        client.add(4,6);
        client.add(3.3, 4.4);

        System.out.println(4);

        Client c = new Client("Mateusz", "Bereda",
                30, "324534");
        System.out.println(c.name);
        System.out.println(c.address);

        Client c2 = new Client("Mateusz", "Bereda",
                30, "324534",
                "Ogrodowa", "3/5", "34-342", "Krakow");

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.address.city);

        Client c3 = new Client();
        System.out.println(c3.address.city);
    }
}
