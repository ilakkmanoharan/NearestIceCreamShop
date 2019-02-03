import java.util.List;
import java.util.stream.IntStream;

public class IceCreamShop {
	
	private int id;
	private String name;
	private List<Integer> locCord;
	private double distFromSource;
	
	public IceCreamShop(int id, String name, List<Integer> locCord) {
        this.id = id;
        this.name = name;
        this.locCord = locCord;
        setDistFromSource(calculateDistFromSource());
    }
    private double calculateDistFromSource() {
    	
    	/*
    	
    	distFromSource = (double) this.locCord.stream()
    			.map(x->Math.sqrt(x^2)).peek(System.out::println)
    			.flatMapToInt(IntStream::of)
    	        .sum();
    	        
    	        
    	        */
    	
    	
    	/*
    	
    	
    	distFromSource = this.locCord.stream()
    			.map(x->Math.sqrt(x*x)).peek(System.out::println))
                .flatMapToInt(IntStream::of)
    	        .sum();
    	
    	*/
    	
    	/*
    	
    	distFromSource = (double) this.locCord.stream()
    			.map(x->Math.sqrt(x*x)).peek(System.out::println)
                .flatMap(IntStream::of)
    	        .sum();
    	
    	*/
    	
    	
    	distFromSource = (double) this.locCord.stream()
    			.map(x->x*x).peek(System.out::println)
    			.flatMapToInt(IntStream::of)
    	        .sum();
    	
    	double sqrtDist = Math.sqrt(distFromSource);
    	
    	
    	
    	/*
    	distFromSource = (double) this.locCord.stream().flatMapToInt(IntStream::of)
    	        .sum();
    	        
    	        */
    			/*
    			int sum = counts.stream()
    	        .flatMapToInt(IntStream::of)
    	        .sum();
    	        
    	        */
    	return sqrtDist;
		
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Integer> getLocCord() {
        return locCord;
    }
    public void setLocCord(List<Integer> locCord) {
        this.locCord = locCord;
    }
    
    public double getDistFromSource() {
        return distFromSource;
    }
    public void setDistFromSource(double d) {
        this.distFromSource = d;
    }

}
