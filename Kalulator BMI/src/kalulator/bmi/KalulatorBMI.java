package kalulator.bmi;
import java.util.Scanner;

public class KalulatorBMI {
    public static void main(String[] args) 
    {
        Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
     
        System.out.println("KALKULATOR BMI");
        System.out.println("............................................");
        System.out.print ("Masukan Jenis Kelamin (1.Laki-laki)| (2.Perempuan): ");
        jk = masuk.nextInt();
        System.out.print ("Masukan Berat : ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi : ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("............................................");
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi<=22.9){
            System.out.println("(Normal)");
        }else if (bmi<24.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
   }  
    } 
