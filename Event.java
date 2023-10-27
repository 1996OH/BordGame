public class Event {
	int eventNum;
	public int event(int eventNum){
		this.eventNum =eventNum;
		switch(eventNum){
		case 0:   //なにもなし
			this.eventNum = 0;
			break;
		case 1:  //なにもなし
			this.eventNum  = 1;
			break;
		case 2:  //持ち金が増える
		case 3:  
			this.eventNum  = 2;
			break;
		case 4:  //持ち金が減る
		case 5:   
			this.eventNum  =4;
			break;
		case 6:    //アイテムを持ち変える
			this.eventNum  =6;
			break;
		}
		return eventNum;
	}
}