public class Database {
    private Produkt[] produkts = new Produkt[6];

    public Database() {
        this.produkts[0] = new Produkt("Serek Wiejski", "Bakoma", 10);
        this.produkts[1] = new Produkt("Chleb", "Piekarnia Habadzibadło", 6);
        this.produkts[2] = new Produkt("Kiełbasa", "Wyborcza", 5);
        this.produkts[3] = new Produkt("Jajko niespodzianka", "Kimber",10);
        this.produkts[4] = new Produkt("Mąka", "Młynownia", 2);
        this.produkts[5] = new Produkt("Jajka 10szt", "Jajkopol", 4);
    }
}
