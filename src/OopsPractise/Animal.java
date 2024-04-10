package OopsPractise;

//Encapsulation class
public class Animal extends PlantA  implements InterfaceAnimal  {
	private final int AGE=50;
	private String name;
    private int GrowthRate;
    private String color;
	
	
	public Animal(String name, int growthRate, String color) {
		super();
		this.name = name;
		GrowthRate = growthRate;
		this.color = color;
	}
	public int getAGE() {
		return AGE;
	}
    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrowthRate() {
		return GrowthRate;
	}
	public void setGrowthRate(int growthRate) {
		if(growthRate <0) {
			System.out.println("The growth rate cannot be negative!!");
		}
		else
		{
		GrowthRate = growthRate;
	}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", GrowthRate=" + GrowthRate + ", color=" + color + "]";
	}
	
	public void eat(String food1)
	{
		
		System.out.println(" Animals eat plants!!!1" +food1);
	}
	@Override
	public void run() {
		System.out.println("hi i m navya");
		
	}
	
	public void addAnimals(String name)
	{
		System.out.println("The name of the Animal is "+name);
	}
	
	public void addAnimals(String name,String color) {
		System.out.println("The "+name+" color is "+color);
	}
	

	
}
