package OopsPractise;
import java.util.HashMap;
import java.util.Map;
public class Main1 {
      public static void main(String args[])
      {
    	  Map <Integer,Animal>  set = new HashMap<>();
    	  Animal a = new Animal("cat",5,"brown");
    	  System.out.println(a.getAGE());
    	  a.setName("cat");
    	  a.setGrowthRate(3);
    	  a.setColor("brown");
    	  a.setGrowthRate(-1);
    	  System.out.println(a.getName()+ " " +a.getColor()+ " " +a.getGrowthRate());
    	  a.addAnimals("Tiger");
    	  a.addAnimals("Tiger", "Blue");
    	  a.run();
    	  set.put(1, a);
    	  System.out.println(set);
    	  for(Map.Entry<Integer, Animal> m :set.entrySet()) {
    		  System.out.println("key :" +m.getKey()+ "Value :" +m.getValue());
    	  }
       }
}




