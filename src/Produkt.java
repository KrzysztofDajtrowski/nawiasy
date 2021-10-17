public class Produkt {
    private String nazwa;
    private String producent;
    private int ilosc;

    public Produkt(String nazwa, String producent, int ilosc){
        this.nazwa = nazwa;
        this.producent = producent;
        this.ilosc = ilosc;
    }
     public String getNazwa(){
        return nazwa;
     }

     public String getProducent(){
        return producent;
     }

     public int getIlosc(){
        return ilosc;
     }

     public boolean isAvailable(){
        if(this.ilosc > 0){
            return true;
        }
        else{
            return false;
        }
     }

     public void setIlosc(int ilosc){
        this.ilosc = ilosc;
     }
}
