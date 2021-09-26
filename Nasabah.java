package praktikumasciiart;

public class Nasabah {
    public static final String namaBank = "BNI";
    public String name;
    public String address;
    public int umur;
    Card card;

    public Nasabah(String name, String address, int umur, Card card) {
        this.name = name;
        this.address = address;
        this.umur = umur;
        this.card = card;
    }

    public void showInfo() {
        System.out.println("Info Nasabah");
        System.out.println("\tNama\t:  " + this.name);
        System.out.println("\tAddress\t:  " + this.address);
        System.out.println("\tUmur\t:  " + this.umur);
        System.out.println("\tCard id\t:  " + this.card.getId());
        System.out.println("\tBalances\t:  " + this.card.getBalance());
    }
}
