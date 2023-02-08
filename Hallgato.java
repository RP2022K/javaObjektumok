/*
* File: Hallgato.java
* Author: Gyüre Árpád
* Copyright: 2023, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2023-02-08
* Github: https://github.com/rp2022k/javaObjektumok/
* Licenc: GNU GPL
*/

public class Hallgato{
   String azonosito;
   int evfolyam;
   int kredit;

   boolean sikeres;

   public Hallgato(String azonosito, int evfolyam, int kredit){
      this.azonosito = azonosito;
      this.evfolyam = evfolyam;
      this.kredit = kredit;
   }

   public Hallgato(String azonosito){
      this.azonosito = azonosito;
      this.evfolyam = 1;
      this.kredit = 0;
   }

   public void targyFelvesz(int targyKredit){
      kredit += targyKredit;
   }

   public boolean vizsgazik(){
      if (kredit>0){
	 evfolyam++;
	 kredit = 0;
	 sikeres = true;
	 return true;
      }
      sikeres = false;
      return false;
   }

   public String toString(){
      return azonosito + " hallgatónak "+ (sikeres?"sikeres":"sikertelen") +" a vizsgaja !";
   }

   public static void main(String[] args){
      Hallgato h1 = new Hallgato("Szoftverfejlesztő");
      Hallgato h2 = new Hallgato("Tesztelő", 2, 0);
   
   h1.targyFelvesz(3);

   h1.vizsgazik();
   h2.vizsgazik();

   System.out.println(h1);
   System.out.println(h2);

   }
}