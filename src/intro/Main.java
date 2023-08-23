package intro;

public class Main {

	public static void main(String[] args) {
		//Veri Tipleri
		String internetSubeButonu = "İnternet Şubeye Gir";
		double dolarDun = 27.10;
		double dolarBugun = 27.10;
		int vade = 36;
		boolean dustuMu = false;
		System.out.println(internetSubeButonu);
		//if, else if, else yapıları
		if(dolarDun<dolarBugun) {
			System.out.println("Dolar Yükseldi");
		}
		else if(dolarDun>dolarBugun) {
			System.out.println("Dolar Düştü");
		}
		else {
			System.out.println("Dolar Sabit");
		}
		//Array 
		String [] krediler = {"Hızlı Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi",};
		//for döngüsü
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		//for each döngüsü
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//Value Type (Sayısal Değerler) (Stack bölümünde depolanır. İki değişken arasında bağlantı olmaz.)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//Reference Type  (Diziler, Classlar, Interfacelar ve Abstract Classlar) (Değişken ismi stack bölümünde depolanır aldığı referans değeri ile Heap bölümünde arrayin değerleri depolanır.)
		int [] sayilar1 = {1,2,3,4,5};
		int [] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2 [0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
	}

}
