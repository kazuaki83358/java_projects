package level2_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class runner {
  public static void main(String[] args) {
    List<laptop> laps = new ArrayList<>();
    laps.add(new laptop("Dell", 16, 800));
    laps.add(new laptop("Apple", 8, 1200));
    laps.add(new laptop("Lenove", 12, 700));
    //without implementing comparable class it will through an error.
    Collections.sort(laps);
    laps.forEach(lap -> System.out.println(lap));
    
  }
}
