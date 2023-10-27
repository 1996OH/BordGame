import java.util.Random;

public class Map {
	Random rand = new Random();
	int Leangh;
	int[] mapEvent;
	
	//マップの長さを決める
	public Map(){
		int ML = rand.nextInt(51)+100;
		this.Leangh = ML;; 
	//マップのイベント番号を決める
		int[] mapEvent = new int[Leangh];
		for(int i = 0; i < Leangh ; i++){
			mapEvent[i] = rand.nextInt(7);
		}
		this.mapEvent = mapEvent; 
	}
}