import java.util.ArrayList;
import java.util.List;

public class PackageStorage {
	
	private int ID_e_Koshit;
	private int Kapaciteti;
	private int Madhesia_aktuale;
	private List<Integer> pakot;
	
	public PackageStorage(int Kapaciteti, int ID_e_Koshit) {
		this.Kapaciteti = Kapaciteti;
		this.ID_e_Koshit = ID_e_Koshit;
		this.pakot = new ArrayList<Integer> ();
	}
	
	public boolean Vendosja_e_pakove(Integer pakoja) {
		if(this.Madhesia_aktuale + pakoja > this.Kapaciteti) return false;
		this.pakot.add(pakoja);
		this.Madhesia_aktuale += pakoja;
		return true;
	}
	
	@Override 
	public String toString() {
		String Permbajtja_e_Koshit = "Pako ne Koshin me ID-"+this.ID_e_Koshit + "  :  ";
		for ( Integer pakoja : this.pakot) {
			Permbajtja_e_Koshit += pakoja +" ";					
		}
		return Permbajtja_e_Koshit;
	}
}