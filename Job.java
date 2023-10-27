import java.util.Random;

public class Job {
	private String[] jobName;
	String comJob;
	int comEffect;
	int comMoney;
	//ジョブの初期値
	public Job() {
		String[] jobName = new String[6];
		jobName[0] = "ITエンジニア";
		jobName[1] = "トラックドライバー";
		jobName[2] = "アルバイト";
		jobName[3] = "公務員";
		jobName[4] = "石油王";
		jobName[5] = "スポーツ選手";
		this.jobName = jobName;
		
	}
    //ジョブの作成
	public String makeJob(){
		Random rand = new Random();
		int jobNum = rand.nextInt(6);
		comJob = jobName[jobNum];
		return comJob;
	}
	//ジョブの移動効果を設定
	public int makeEffect(String job){
		switch(job){
		case "ITエンジニア":
			comEffect = 1;
			break;
		case "トラックドライバー":
			comEffect = 2;
			break;
		case "アルバイト":
			comEffect = 0;
			break;
		case "公務員":
			comEffect = 1;
			break;
		case "石油王":
			comEffect = -1;
			break;
		case "スポーツ選手":
			comMoney = 2;
			break;
		}
		return comEffect;
	}
	//ジョブの初期持ち金を設定
	public int makeMoney(String job){
		switch(job){
		case "ITエンジニア":
			comMoney = 20000;
			break;
		case "トラックドライバー":
			comMoney = 15000;
			break;
		case "アルバイト":
			comMoney = 10000;
			break;
		case "公務員":
			comMoney = 25000;
			break;
		case "石油王":
			comMoney = 100000;
			break;
		case "スポーツ選手":
			comMoney = 30000;
			break;
		}
		return comMoney;
	}
}