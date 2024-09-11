package Learning_steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class test_1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Afdokh,bp");
		names.add("Dhia");
		names.add("ram");
		names.add("Dodge");
		int count= 0;
		for(int i =0 ; i<names.size(); i++) {
			String actual =names.get(i);
			if(actual.startsWith("a")) {
				
				count+=1;
				}		
				
			}
		
		System.out.println(count);
		}

	
@Test 


 public void stream_it() {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("zpfe");
	names.add("ADon");
	names.add("Adam");
	names.add("Ram");
	long  c = names.stream().filter(s->s.startsWith("A")).count();
	
	System.out.println(c);}
	
@Test

public void streamMap() {
	
	
	// Stream.of("Adjhijeet", "Don", "Adama", "Rama" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	List<String> names = Arrays.asList("ahldplgeg","ajgzpldcl","zrufozka","Dhia");
	names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	
	
	
	
	
}



}
	 
	 
	 
	 
	 
 


