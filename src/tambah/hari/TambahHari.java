package tambah.hari;

/**
 *
 * @author hiisyaam
 */
import java.util.Scanner;
public class TambahHari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("1.Senin\n2.Selasa\n3.Rabu\n4.Kamis\n5.Jumat"
                + "\n6.Sabtu\n7.Minggu");
        System.out.print("Masukan Hari sekarang berdasarkan pilihan diatas: ");
        byte hariSekarang = in.nextByte();
        
        if(hariSekarang<1 || hariSekarang>7){
            System.exit(0);
        }
        
        System.out.print("Mau ditambah Berapa hari: ");
        int tambahanHari = in.nextInt();
        
        int hasil = (hariSekarang + tambahanHari) % 7;
        
        System.out.print("Maka hari yang akan datang: ");
        
            switch (hasil){
            case 0 :
                System.out.println("Minggu");
                break;
            case 1 :
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 :
                System.out.println("Kamis");
                break;
            case 5 :
                System.out.println("Jumat");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            default :
                System.out.println("Tidak Valid");
        }
    }
    
}