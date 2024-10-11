import java.util.Scanner;
public class SiakadFor23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai= 0, tertinggi = 0,  terendah = 100;
        int mahasiswaLulus = 0 , mahasiswaTidakLulus = 0;

        for(int i =1; i <= 10; i++){
                System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
                nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                    
                }
                if (nilai < terendah){
                    terendah = nilai;
                }
                    if (nilai >= 60 && nilai <= 100) {
                        mahasiswaLulus++;
                    }else if (nilai >= 0 && nilai<60){
                    mahasiswaTidakLulus++;
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Mahasiswa Lullus : " +mahasiswaLulus);
        System.out.println("Mahasiswa Tidak Lulus : " + mahasiswaTidakLulus);
        
    }
    }
}
    
