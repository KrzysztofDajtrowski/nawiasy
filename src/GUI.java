public class GUI {
    public void showMenu(){
        System.out.println("1. Lista produktów");
        System.out.println("2. Kup produkt");
        System.out.println("3. Wyjdź");
    }

    public void printAvailableProduct(Produkt produkt){
        if(produkt.isAvailable()){
            System.out.print("Nazwa: " + produkt.getNazwa() + ", Producent: "+ produkt.getProducent() + ", Ilość: " + produkt.getIlosc());
            System.out.println();

        }
    }
}
