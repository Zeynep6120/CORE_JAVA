package d20staticblock_instanceblock_oop;

public class HondaRunner {
    public static void main(String[] args) {
        //objeyi child dan üretecem
        //Hiyerarsi şu demek ben Honda dan bir obje ürettiğim zaman ilk Vehicle ın constructor ı
        //sonra Car ın constructor ı en son Honda nın constructor ı çalışır

        //Honda Class tan obje ürettim
        Honda h = new Honda();
        //Honda,2023,Benzin
        //Sedan
        //Civic
        //ilk konuşma hakkı Grandın sonra babanın sonra çocuğun konuşma hakkı vardır yani
        //constructorlar bu sıra ile çalışır.


    }
}
