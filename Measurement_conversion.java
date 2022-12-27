
package measurement_conversion;

import java.io.*;
import java.util.*;

interface test{
       void len_con();
       void mass_con();
       void time_con();
       void temp_con();
       void elec_con();
}

public class Measurement_conversion implements test {
        Scanner sc=new Scanner(System.in);
        public void len_con(){
              try{
                 System.out.print("Enter length in meters :");
                        String s1=sc.next();
                        int i1=Integer.parseInt(s1);
                        System.out.println(i1+" meters = "+(i1*39.3701)+" inches");
                        System.out.println(i1+" meters = "+(i1*3.28084)+" feet");
                        System.out.println(i1+" meters = "+(i1*0.000621371)+" miles");
              }
              catch(Exception e){
                    System.out.println(e);
              }
        }
        public void mass_con(){
              try{
                  System.out.print("Enter mass in kilograms :");
                        String s2=sc.next();
                        int i2=Integer.parseInt(s2);
                        System.out.println(i2+" kilograms = "+(i2*0.157473)+" stones");
                        System.out.println(i2+" kilograms = "+(i2*2.20462)+" pounds");
                        System.out.println(i2+" kilograms = "+(i2*35.274)+" ounces");
              }
              catch(Exception e){
                    System.out.println(e);
              }
              
        }
        public void time_con(){
             try{
                 System.out.print("Enter time in seconds :");
                        String s2=sc.next();
                        int i2=Integer.parseInt(s2);
                        System.out.println(i2+" seconds = "+(i2*1000)+" milliseconds");
                        System.out.println(i2+" seconds = "+(i2*0.0166667)+" minutes");
                        System.out.println(i2+" seconds = "+(i2*0.000277778)+" hours");
              }
              catch(Exception e){
                    System.out.println(e);
              }
        }
        public void temp_con(){
              try{
                   System.out.print("Enter temperature in celsius :");
                        String s2=sc.next();
                        int i2=Integer.parseInt(s2);
                        System.out.println(i2+" celsius = "+((i2*(1.8))+32)+" fahrenhite");
                        System.out.println(i2+" celsius = "+(i2+273.15)+" kelvin");
                        System.out.println(i2+" celsius = "+((i2*(1.8))+491.67)+" rankine");
              }
              catch(Exception e){
                    System.out.println(e);
              }
        }
        public void elec_con(){
              try{
                  System.out.print("Enter electric current in amperes :");
                        String s2=sc.next();
                        int i2=Integer.parseInt(s2);
                        System.out.println(i2+" amperes = "+(i2*0.1)+" biot");
                        System.out.println(i2+" amperes = "+(i2*1)+" coulomb/second");
                        System.out.println(i2+" amperes = "+(i2*2997924536.843143)+" franklin/second");
              }
              catch(Exception e){
                    System.out.println(e);
              }
        }
        public void cal(){
              boolean flag=true;
                while(flag){
                System.out.println("--------------Measurement Conversion System-------------- :");
                System.out.println("Choose your unit for conversion : ");
                System.out.println("\t1.Length\n\t2.Mass\n\t3.Time\n\t4.Temperature\n\t5.Electric Current");
                System.out.print("Enter your choice :");
                Scanner sc=new Scanner(System.in);
                String str=sc.next();
                int i=Integer.parseInt(str);
                switch(i){
                    case 1:
                        len_con();
                        break;
                    case 2:
                        mass_con();
                        break;
                    case 3:
                        time_con();
                        break;
                    case 4:
                        temp_con();
                        break;
                    case 5:
                        elec_con();
                        break;
                    default:
                        System.out.println("Enter a valid choice...");
        }
         System.out.println("Do you want to continue (y/n) : ");
                String ch=sc.next();
                if(ch.equals("n")){
                    flag=false;
                    break;
                }      
                }
        }

        public static void main(String[] args) {
                Measurement_conversion obj=new Measurement_conversion();
                obj.cal();
                
                }
                
                /*System.out.println("Do you want to continue (y/n) : ");
                String ch=sc.next();
                if(ch.equals('n')){
                    break;}
                */
                
                
                
                
    
    
}
