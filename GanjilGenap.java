/**
 *
 * @author Fathan
 */
package deret_array;
public class GanjilGenap {
    
    public static void main(String[] args) {
       //membuat variabel dengan array
       int[] bilangan={8,3,5,6,4,7,9,10,24,20,40,38,23};
       System.out.print("Bilangan Genap :");
        //mengambil data array dengan perulangan for
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan habis dibagi 2 = 0
            if(bilangan[i]% 2 ==0){
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan ganjil :");
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan tidak habis dibagi 2 = 0
            if(bilangan[i] % 2!=0){
                System.out.print(bilangan[i] +" ");   
            }
        }
        System.out.println("");
    }
    
}