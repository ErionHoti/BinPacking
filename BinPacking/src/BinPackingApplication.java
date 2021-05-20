import java.util.Arrays;
import java.util.List;

public class BinPackingApplication {

	public static void main (String[] args) {
		List<Integer> pakot = Arrays.asList(7,6,5,9,10,5,7,3,4,8);
        int Kapaciteti_i_Koshit = 10;

        //StoL c = new StoL(pakot, Kapaciteti_i_Koshit);
        //LtoS c = new LtoS(pakot, Kapaciteti_i_Koshit);
        Random c = new Random(pakot, Kapaciteti_i_Koshit);

        c.Algoritmi();
        c.Rezultati();

	}
}
