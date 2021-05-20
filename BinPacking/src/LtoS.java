import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class LtoS {
	private List<PackageStorage> Koshat;
    private List<Integer> pakot;
    private int Kapaciteti_i_Koshit;
    private int binCounter = 1;
    
 public LtoS (List<Integer> pakot, int Kapaciteti_i_Koshit) {
	 this.pakot = pakot;
	 this.Kapaciteti_i_Koshit = Kapaciteti_i_Koshit;
	 this.Koshat = new ArrayList<>(this.pakot.size());
 }
 
 public void Algoritmi() {
Collections.sort(this.pakot, Collections.reverseOrder());
if( this.pakot.get(0) > this.Kapaciteti_i_Koshit) {
		 System.out.println("Nuk ka zgjidhje");
		 return;
	 }
	 this.Koshat.add(new PackageStorage(Kapaciteti_i_Koshit,binCounter));//Koshi i pare
	 for (Integer pakoja_aktuale : pakot) {
		 boolean eshte_vendosur = false;//shiko nese eshte vendosur pakoja ne kosh
		 int Koshi_aktual = 0;
		 while (!eshte_vendosur) {
			 if (Koshi_aktual == this.Koshat.size()) { // provo koshin e ri nese pakoja nuk pershtatet me koshin aktual
				 PackageStorage Koshi_i_ri = new PackageStorage (Kapaciteti_i_Koshit, ++binCounter);
				 Koshi_i_ri.Vendosja_e_pakove(pakoja_aktuale);
				 this.Koshat.add(Koshi_i_ri);
				 eshte_vendosur = true;
			 } else if (this.Koshat.get(Koshi_aktual).Vendosja_e_pakove(pakoja_aktuale)) {// pakoja aktuale vendoset ne koshin e ri
				 eshte_vendosur = true;
			 } else {
				 Koshi_aktual++;// provo koshin tjeter 
			 }
		 }
	 }
 }
 
 public void Rezultati () {
	 for(PackageStorage Koshi : this.Koshat){
	 System.out.println(Koshi);
 }
    }    

}


