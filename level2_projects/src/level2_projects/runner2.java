package level2_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class runner2 {
  public static void main(String[] args) {
    List<laptop2> lape = new ArrayList<>();
    lape.add(new laptop2("Dell", 16, 800));
    lape.add(new laptop2("Apple", 8, 1200));
    lape.add(new laptop2("Lenove", 12, 700));
    Comparator<laptop2> com = new Comparator<laptop2>() {

		@Override
		public int compare(laptop2 l1, laptop2 l2) {
			if(l1.getPrice()>l2.getPrice())
				return 1;
			else
				return -1;
		}
    	
	};
    //without implementing comparable class it will through an error.
    Collections.sort(lape,com);
    lape.forEach(lap -> System.out.println(lap));
    
  }
}
