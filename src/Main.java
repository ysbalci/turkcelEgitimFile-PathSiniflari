import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //File sınıfı dosyaları ve dizinleri soyut bir şekilde tanımlamaya yarar. Dosya/dizin yaratma, dosya arama,silme amaçlarıyla kullanılır
        //Path sınıfı dosya sisteminde bulunan path'in programatik tanımlanması halidir. File sınıf ile birlikte dosya ve dizinler üzerinde işlem yapmak için kullanılır
        File file = new File("C:\\Users\\ynsse\\Desktop//sample.txt");
        //Dosyanın ilgili path'de olup olmadığını söyleyen metot
        System.out.println(file.exists());

        //Dosyanın okunabilir olup olmadığını belirten metot
        System.out.println(file.canRead());

        //Dosyaya yazma izni olup olmadığını belirten metot
        System.out.println(file.canWrite());

        //İlgigi dosyanın klasörmü olduğunu gösteren metot
        System.out.println(file.isDirectory());

        //Dosyanın path'ini almak için kullanılan metot
        System.out.println(file.getAbsoluteFile());

        //Dosyanın bir üst yolunu geri döndüren metot
        System.out.println(file.getParent());

        //Dosyanın içerisindeki byte boyutunu geri döndüren metot
        System.out.println(file.length());

        //Dosya üzerinde yapılan son işlemin ne zaman olduğunu belirten metot
        //bu metot tarihi milisaniye olarak döner bunun için new Date nesnesi kullanılır
        System.out.println(new Date(file.lastModified()));


        //File nesnesi ile kendimiz dosya/klasör oluşturmak için
        File file2 = new File("C:\\Users\\ynsse\\Desktop\\ornek.txt");
       /* if (!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } */
        // Var olan dosyayı silmek için
        /*if (file2.exists()){
            boolean silindimi = file2.delete();
            System.out.println(silindimi);
        }*/


        //konsoldan çalışan dosya gezgini yapmak için
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu : ");
        String path = scanner.nextLine();

        File file3 = new File(path);
        // "list" metodu ile ilgili file klasör ise geriye klasörün içeriğini döndürür.
        String[] icerik = file3.list();
        //for dögüsü ile icerik arrayini dönüp ilgilini indexini ekrana bastırırız
        for (int i=0; i< icerik.length; i++){
            System.out.println(icerik[i]);
        }
        scanner.close();
    }
}