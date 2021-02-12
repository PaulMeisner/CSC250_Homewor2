import java.util.Random;

public class Lotto
{
	int number;
	
	Lotto(int number)
	{
		//self.sides = sides in py
		this.number = number;
	}
	
	int draw() 
	{
		Random r = new Random();
		return r.nextInt(this.number) + 1; 
		
	}

}