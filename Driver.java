public class Driver{
	
	public static void main (String []arg){
		//fish actually is a data type
		//fish nemo; == int x;
		Fish nemo = new Fish(); //nemo=object, fish=class

		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();

		Shark fiery=new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();



		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquarium fancyAquarium = new Aquarium();
		//fancyAquarium.fillFish();

	}
}