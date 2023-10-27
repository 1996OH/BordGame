
import java.util.Random;

public class Character {
	Random rand = new Random();
	Job job = new Job();
	Map map = new Map();
	Item I = new Item();
	moneyEvent moneyE = new moneyEvent();
	Event EV = new Event();
	String name;
	String jobName;
	int[] mapEvent = new int[] {};
	int mapLeangh ;
	int eventNum ;
	int mapPlace = 0;
	int jobEffect;
	int money;
	int moneyItem = 0;
	int moveItem = 0;
	int event = 0;

	//キャラのジョブとエフェクトと持ち金を決める
	public Character(String name){
		this.name = name;
		this.mapEvent= map.mapEvent;;
		this.mapLeangh = map.Leangh;
		this.jobName = job.makeJob();
		this.jobEffect = job.makeEffect(jobName);
		this.money = job.makeMoney(jobName);
	}
	//マップに関して
	public int mapPlace(){
		if(mapPlace < mapLeangh){
			System.out.println("現在地は"+mapPlace+"マス目です。");
			startEvent(mapEvent[mapPlace]);
			return 0;
		}else{
			System.out.println("ゴールです。おめでとうございます！");
			return 1;
		}
	}
	//サイコロを振る
	public void dice(){
		int diceNum = rand.nextInt(10)+1+jobEffect+moveItem;
		System.out.println(diceNum +"マス進む。");
		mapPlace += diceNum;
	}
	//イベントを発生させる
	public void startEvent(int eventNum){
		this.eventNum = eventNum;
		this.event = EV.event(this.eventNum);
		switch (event){
		case 0:    //なにもなし
			System.out.println("しかし何も起きなかった…");
			break;
		case 1:    //一回休み
			System.out.println("残念。今回は休み。");
			break;
		case 2:    //持ち金が増える ランダム
		case 3: 
			eventNum = rand.nextInt(50000);
			money += eventNum + moneyItem;
			if((eventNum+moneyItem) < 0){
				moneyE.Event(eventNum+moneyItem);
				System.out.println("持ち金が"+(eventNum+moneyItem)+"ドル減った！！");
			}else{
				moneyE.Event(eventNum+moneyItem);
				System.out.println("持ち金が"+(eventNum+moneyItem)+"ドル増えた！！");
			}  
			System.out.println("現在の持ち金"+money+"ドル");
			break;

		case 4:    //持ち金が減る  ランダム
		case 5: 
			eventNum = -rand.nextInt(50000);
			money -= eventNum + moneyItem;
			if((eventNum+moneyItem) < 0){
				moneyE.Event(eventNum+moneyItem);
				System.out.println("持ち金が"+(eventNum+moneyItem)+"ドル減った！！");
			}else if(money == 0){
				System.out.println("何も起きなかった…");
			}else{
				moneyE.Event(eventNum+moneyItem);
				System.out.println("持ち金が"+(eventNum+moneyItem)+"ドル増えた！！");
			}  
			System.out.println("現在の持ち金"+money+"ドル");
			break;

		case 6:    //アイテムを持ち変える
			System.out.println("アイテム持ち替えイベント！");
			int effectItem =I.getItem();
			if( effectItem == 0){
				System.out.println("移動アイテムイベントが発生した！");
				this.moveItem = I.moveItemChange(); 
			}else{
				System.out.println("持ち金イベントが発生した！");
				this.moneyItem = I.moneyItemChange();
			}
			break;
		}
	}

}