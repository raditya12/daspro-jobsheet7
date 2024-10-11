import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double diskon= 0, harga = 50000, totalHarga;
        int tiket, totalTiket =0, i = 1, pendapatan = 0;
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("--------------------------- Perhitungan Tiket Bioskop ---------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");

        do{
            System.out.print("\nMasukkan jumlah tiket pelanggan ke " + i + "\nketik 0 untuk keluar dari program" + " : ");
            tiket = input.nextInt();

            if ( tiket == 0){
                System.out.println("Transaksi Selesai");
                break;
            }else if (tiket < 0){
                System.out.println("Invalid silahkan masukkan jumlah tiket ulang");
                continue;
            }
            
                if (tiket > 10) {
                    diskon = 0.15;
                    System.out.println("Diskon 15%");
                }else if (tiket > 4) {
                    diskon = 0.10;
                    System.out.println("Diskon 10%");
                }else {
                    diskon = 0;
                }
    
                totalHarga = harga * tiket;
                int totalHargaAfter = (int) ((int) totalHarga - (totalHarga * diskon));
                pendapatan += totalHargaAfter;
                totalTiket += tiket;
                
                i++;
                
            }while (true);
            System.out.println("Pendapatan harian selama satu hari : Rp. " + pendapatan);
            System.out.println("Total tiket yang terjual  : " + totalTiket);

            
        } 
        
    }
