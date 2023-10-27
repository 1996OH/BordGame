import java.util.Random;

public class Item {
	  int moveItem;
	  int moneyItem;
	  
	//持ち金と移動のどちらかを決める
	  public int getItem(){
	    Random rand = new Random();
	    int itemNum = rand.nextInt(2);
	    return itemNum;
	  }
	//移動アイテム
	  public int moveItemChange(){
	    Random rand = new Random();
	    this.moveItem = rand.nextInt(11)-5;
	    if(moveItem == -5){
	      System.out.println("呪いの足枷を入手。");
	    }else if(moveItem == -4){
	      System.out.println("鈍足の靴を入手。");
	    }else if(moveItem == -3){
	      System.out.println("足枷を入手。");
	    }else if(moveItem == -2){
	      System.out.println("重たいリュックを入手。");
	    }else if(moveItem == -1){
	      System.out.println("ボロボロな靴を入手。");
	    }else if(moveItem == 0){
	      System.out.println("アイテムを破棄した。");
	    }else if(moveItem == 1){
	      System.out.println("新しい靴を入手した。");
	    }else if(moveItem == 2){
	      System.out.println("俊足を入手した。");
	    }else if(moveItem == 3){
	      System.out.println("原付バイクを入手した。");
	    }else if(moveItem == 4){
	      System.out.println("車を入手した。");
	    }else if(moveItem == 5){
	      System.out.println("スポーツカーを入手した。");
	    }
	   System.out.println("移動アイテム効果 " + moveItem + "マス");
	   return moveItem;
	  }
	//持ち金アイテム
	  public int moneyItemChange(){
	    Random rand = new Random();
	    this.moneyItem = rand.nextInt(60001)-30000;
	    if(moneyItem <= -20000){
	      System.out.println("疫病神を入手した。");
	    }else if(moneyItem >= -20000 && moneyItem <= -10000 ){
	      System.out.println("不幸のネックレスを入手した。");
	    }else if(moneyItem >= -10000 && moneyItem < 0 ){
	      System.out.println("ボロボロな財布を手に入れた。");
	    }else if(moneyItem == 0 ){
	      System.out.println("アイテムを破棄した。");
	    }else if(moneyItem > 0 && moneyItem <= 10000 ){
	      System.out.println("新しい財布を手に入れた。");
	    }else if(moneyItem >= 10000 && moneyItem <= 20000 ){
	      System.out.println("金運のお守りを手に入れた。");
	    }else if(moneyItem >= 20000 && moneyItem <= 30000 ){
	      System.out.println("勝利の女神を手に入れた。");
	    }
	   System.out.println("持ち金アイテム効果 " + moneyItem + "ドル");
	   return moneyItem;
	  }
	}