/*
* File: Szamitogep.java
* Author: Gyüre Árpád
* Copyright: 2023, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2023-02-08
* Github: https://github.com/rp2022k/javaObjektumok/
* Licenc: GNU GPL
*/

public class Szamitogep{
   double szabadMemoria;
   boolean bekapcsolva;
   boolean elegHely;

   public Szamitogep(double szabadMemoria, boolean bekapcsolva){
      this.szabadMemoria = szabadMemoria;
      this.bekapcsolva = bekapcsolva;	
   }

   public Szamitogep(){
      this(1024, false);	
   }

   public void kapcsol(){
      bekapcsolva = !bekapcsolva;
   }

   public boolean programMasol(double progMeret){
      if(bekapcsolva && szabadMemoria>=progMeret){
	 szabadMemoria -= progMeret;
	 elegHely = true;
         return true;
      }
      elegHely = false;
      return false;
   }
   
   public String toString(){
      return (!bekapcsolva?"Sikertelen a másolás, mert nincs bekapcsolva a számítógép !":!elegHely?"Sikertelen a másolás, mert nincs elég szabad memória ("+szabadMemoria+" MB van csak !)":"Sikeres a másolás, a gép még "+szabadMemoria+" MB szabad memóriával rendelkezik");
   }
   
   public static void main(String[] args){
      Szamitogep sz1 = new Szamitogep();
      Szamitogep sz2 = new Szamitogep(2048, false);

      sz1.kapcsol();
      sz1.programMasol(800);
      System.out.println(sz1);
      sz1.programMasol(400);
      System.out.println(sz1);

      sz2.programMasol(1);
      System.out.println(sz2);
   }
}