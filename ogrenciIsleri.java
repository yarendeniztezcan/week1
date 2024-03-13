package hafta1;
public class ogrenciIsleri {
  public static void main(String[] args){
    ogrenci [] kisiler = new ogrenci[2];
    kisiler[0] = new ogrenci();
    kisiler[0].ogrenciNo=10;
    kisiler[0].ogrenciAd="Edmund";
    kisiler[0].ogrenciSoyad="Hardenberg";

    System.out.println(kisiler[0].ogrenciNo+" "+kisiler[0].ogrenciAd+" "+kisiler[0].ogrenciSoyad);

    kisiler[1] = new ogrenci();
    kisiler[1].ogrenciNo=38;
    kisiler[1].ogrenciAd="Yaren Deniz";
    kisiler[1].ogrenciSoyad="Tezcan";

    System.out.println(kisiler[1].toString());
  }  
}
