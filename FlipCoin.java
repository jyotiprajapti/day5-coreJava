package day5;

public class FlipCoin {
	public static void main(String[] args) 
	{
		
		double countHead=0;
		double countTail=0;
		int n=20;
		for(int i=1; i<=n;i++) {
			
		
		if (Math.random() < 0.5){
            System.out.println("Heads");
           countHead=countHead+1;
    }else{
            System.out.println("Tails");
            countTail=countTail+1;
    }
	}
		double	tailPercentage =(((countTail)/n)*100);
        double	headPercentage =(((countHead)/n)*100);
		System.out.println("Precentage of heads is " + headPercentage );
		System.out.println("Precentage of tail is " + tailPercentage );
	}
}
