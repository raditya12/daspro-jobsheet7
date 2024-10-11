import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi = 0, total = 0, totalBayar =0, i =1;
    
        System.out.println("-------- Tarif Parkir ---------");
        System.out.println("1. Mobil \n2. Motor \n0. Keluar");
        
        do{
            System.out.print("Masukkan jenis kendaraan ke " + i + " : ") ;
            jenis = input.nextInt();
            if (jenis ==1 || jenis ==2){
                System.out.print("Masukkan durasi : ");
                durasi = input.nextInt();
                if (durasi > 5){
                total += 12500;
                }else if (jenis ==1){
                total += durasi * 3000;
                }else {
                total += durasi * 2000;
                }
                
                i++;
                
            }else {
                System.out.println("Invalid input jenis kendaraan ulang '1' atau '2' '0' untuk keluar program");
            }
            
            
        }while (jenis !=0);
        System.out.println("Anda keluar dari program");
        totalBayar += total;
        System.out.println("Total tarif parkir : " + totalBayar);
    }
}