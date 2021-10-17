public class Funkcja {

    Funkcja(){

    }
    int pot(int liczba, int potega){
        if(potega == 1)
        {
            return liczba;
        }

        return liczba * pot(liczba, potega -1);
    }


    int factorial(int a) {


        if(a == 1) {
            return 1;
        }
        return a * factorial(a-1);
    }

    boolean nawiasy(String str){
        char[]tab = str.toCharArray();
        int licznikOtw=0;
        int licznikZam=0;
        for(int i =0; i < tab.length; i++){
            if(tab[i] == '('){
                licznikOtw++;
            }
            else if(tab[i]==')'){
                licznikZam++;
                if(licznikZam > licznikOtw)
                {
                    return false;
                }
            }
        }
        if(licznikOtw == licznikZam){
            return true;
        }
        else {
            return false;
        }
    }
}
