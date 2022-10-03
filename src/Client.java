public class Client {
    String name;
    String surname;
    int age;
    String pesel;
    Address address = new Address();

    Client() {
    }

    Client(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname, int age,
           String pesel, String street, String no,
           String postCode, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
        this.address = new Address(street, no, postCode, city);
    }

    int add(int pierwszySkladnik, int drugiSkladnik) {
        int result;
        result = pierwszySkladnik + drugiSkladnik;
        return result;
    }

    double add(double a, double b) {
        return a+b;
    }

    String add(String a, String b) {
        return a+b;
    }

    void powiedzJakMaszNaImie() {
        System.out.println(this.name);
    }

    Client cos() {
        return this;
    }
}
