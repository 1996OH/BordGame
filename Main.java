import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		//キャラ作成
		System.out.println("キャラクター名を3名決めてください。");
		System.out.println("キャラクター1");
		String name1 = scanner.next();
		System.out.println("キャラクター2");
		String name2 = scanner.next();
		System.out.println("キャラクター3");
		String name3 = scanner.next();
		Character[] chara = new Character[3];
		chara[0]  = new Character(name1);
		chara[1]  = new Character(name2);
		chara[2]  = new Character(name3);

		System.out.println("キャラ作成が完了しました。");
		System.out.println("今回のマップは" + chara[0].mapLeangh + "マスです。");
		System.out.println("以下の設定で開始します。");
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("名前："+ chara[i].name+"  職業："+chara[i].jobName+"  持ち金："+chara[i].money+"ドル");
		}
		System.out.println("");

		//ゲーム進行
		System.out.println("ゲームスタート");
		int turn = 1;
		while(true){
			int goal = 0;
			System.out.println(turn+"ターン目");
			for(int i = 0 ; i < 3 ; i++){
				System.out.println(chara[i].name+"の番です。");
				chara[i].dice();
				goal += chara[i].mapPlace();
				System.out.println("");
				if(goal == 1){
					break;
				}
			}
			if(goal == 1){
				break;
			}
			turn ++;
			System.out.println("") ; 
			scanner.close();
		}
		
		System.out.println("結果発表");
		for(int i = 0 ; i < 3 ; i++){
		  System.out.println(chara[i].name + " さんの結果");
		  System.out.println(chara[i].money + " ドルです。");
		}


		int winnerMoney = chara[0].money;
		String winnerName = chara[0].name;

		for(int i = 0 ; i < 3 ; i++){
		     winnerMoney = Math.max(winnerMoney,chara[i].money);
		}
		for(int i = 0 ; i < 3 ; i++ ) {
			if(winnerMoney == chara[i].money) {
				winnerName = chara[i].name;
			}
		}
		System.out.println("");
		System.out.println("勝者は " + winnerName + " さんで");
		System.out.println("持ち金 " + winnerMoney + " ドルです！");
	}
}

