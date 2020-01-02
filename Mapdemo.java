import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		HashMap<String,Double> hmm = new HashMap<String,Double>();
		
		hmm.put("Doe", new Double(302.230));
		hmm.put("Pia", new Double(123.454));
		hmm.put("Kee", new Double(225.316));
		hmm.put("Zoe", new Double(523.032));
		
		Set<Entry<String, Double>> set = hmm.entrySet();
		Iterator i = set.iterator();
	
		while(i.hasNext()) {
			Map.Entry me =(Map.Entry) i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		
		double balance = ((Double) hmm.get("Doe")).doubleValue();
		hmm.put("Zoe",new Double(balance+1000));
		System.out.println(hmm);
		
		

		
	}
}
