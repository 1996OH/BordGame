public class moneyEvent {
		  String moneyEvnt;
		  int money;
         //変動する金額によってイベントの表示を変更
		  public void Event(int money){
		    this.money = money;
		    if(money <= -20000){
		      System.out.println("持っている株が大暴落！");
		    }else if(money > -20000 && money <= -10000){
		      System.out.println("詐欺被害にあった！");
		    }else if(money > -10000 && money <= -5000){
		      System.out.println("キャバクラに繰り出した！");
		    }else if(money > -5000 && money <= -2500){
		      System.out.println("スリ被害にあった！");
		    }else if(money > -2500 && money < 0){
		      System.out.println("パチンコで負けた！");
		    }else if(money > 0 && money <= 2500){
		      System.out.println("お母さんにお小遣いをもらった。");
		    }else if(money > 2500 && money <= 7500){
		      System.out.println("財布を拾った！謝礼金をもらえた！");
		    }else if(money > 7500 && money <= 15000){
		      System.out.println("競馬で勝った！");
		    }else if(money > 15000 && money <= 22500){
		      System.out.println("お年玉がもらえた！");
		    }else if(money > 22500 && money <= 30000){
		      System.out.println("特別ボーナスがもらえた！");
		    }else if(money > 30000 && money <= 35000){
		      System.out.println("金塊を手に入れた！");
		    }else if(money > 35000 && money <= 45000){
		      System.out.println("遺跡を発掘！");
		    }else if(money > 45000){
		      System.out.println("宝くじが当たった！");
		    }
		  }
}
