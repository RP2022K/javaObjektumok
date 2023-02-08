/*
* File: Harcos.java
* Author: Gyüre Árpád
* Copyright: 2023, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2023-02-08
* Github: https://github.com/rp2022k/javaObjektumok/
* Licenc: GNU GPL
*/

public class Harcos {
    
   private String nev;
   private int eletero;
   private int harciero;
   
   public Harcos(String nev, int eletero, int harciero){
      this.nev = nev;
      this.eletero = eletero;
      this.harciero = harciero;
   }
    
   public boolean harcol(Harcos h){
      this.eletero -= h.harciero;
      h.eletero -= this.harciero;
      if (this.eletero<0 || h.eletero<0) return true;
      return false;
   }

   public static void osszecsapas(Harcos h1, Harcos h2){
      System.out.println(h1.nev+" életerő: "+h1.eletero);
      System.out.println(h2.nev+" életerő: "+h2.eletero);
      System.out.println();
   }

   public String toString(){
      return (eletero>0?"ok":"vége: "+this.eletero);
   }
    
   public static void main(String[] args) {
      int szamlalo = 0;// Az összecsapások számát tartalmazza
      Harcos harcos1 = new Harcos("Góliát", 25, 20);
      Harcos harcos2 = new Harcos("Dávid",65,10);
      
      System.out.println("\n"+harcos2.nev+" küzdelme "+harcos1.nev+" ellen\n");
      System.out.println("Kiinduló állás:\n");
      osszecsapas(harcos1, harcos2);
      
      while (harcos1.eletero>0 && harcos2.eletero>0){
	 szamlalo++;
	 System.out.println(szamlalo+". összecsapás után:");
	 harcos1.harcol(harcos2);
	 osszecsapas(harcos1, harcos2);
      }//while end
      if (harcos1.eletero>0) System.out.println(harcos1.nev+" győzött");
      else System.out.println(harcos2.nev+" győzött");
   }//main end
}
