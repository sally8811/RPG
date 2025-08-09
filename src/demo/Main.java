package demo;

import java.util.Random;
import java.util.ArrayList;
import bases.Living;
import humans.Brave;
import humans.Fighter;
import humans.Wizard;
import monsters.Smile;
import monsters.Oak;
import monsters.Dragon;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");

		// Brave（勇者）, Fighter（戦士）, Wizard（魔法使い）クラスの各インスタンスを生成
		Human Brave = new Human("沖田総司", "剣");
		Human Fighter = new Human("金太郎", "斧");
		Human Wizard = new Human("安倍晴明", "魔法");
		
		// 人間グループのリストを空で生成
		ArrayList<String> humans = new ArrayList<>();
        
		// 勇者、戦士、魔法使いを人間グループのリストに追加
		humans.add(Brave);
		humans.add(Fighter);
		humans.add(Wizard);

		// Slime（スライム）, Oak（オーク）, Dragon（ドラゴン）クラスの各インスタンスを生成
		Monster Smile = new Monster("キングスライム", "体当たり");	
		Monster Oak = new Monster("オークキング", "槍");
		Monster Dragon = new Monster("紅龍", "炎");

		// モンスターグループのリストを空で生成
		ArrayList<String> monsters = new ArrayList<>();
		
        // スライム、オーク、ドラゴンをモンスターグループのリストに追加
		monsters.add(Smile);
		monsters.add(Oak);
		monsters.add(Dragon);

		
		// 現在の各グループの状態を一覧表示
		showGroupInfos(humans, monsters);

		// 第何回戦かを示すカウンター変数
		int count = 1;
		
		// 勝敗がつくまで無限ループ
		while (true) {

			System.out.printf("\n★ 第%d回戦 ==========\n", count);

			System.out.println("\n[人間のターン！]\n");

			// 人間グループから1人選択
			choiceHuman(humans);
			
			// モンスターグループから1人選択
			 choiceMonster(monsters);
            
			// 選ばれた人間が、選ばれたモンスターを攻撃
		     attack(Living target); 
			
			// モンスターのHPが0以下になれば、モンスターは倒れ、そのモンスターをモンスターグループから削除
			if(monsters.geHp() <= 0) {
				Predicate <String> conditon = monsters.get.Hp <= 0;
				Monster.removeif(cpndition)
		    		System.out.println("★ 「" + monsters.getName() + "」は倒れた。");
			}		

			// モンスターグループに誰もいなくなれば、人間グループの勝利
			if (monsters.isEmpty()) {
				System.out.println("★★ ==== 決着がついた！！ ==== ★★");
				System.out.println("#### 人間達は勝利した！！ ####");
			}

			System.out.println("\n[モンスターのターン！]\n");
			
			// 人間グループから1人選択
			choiceHuman(humans);
			
			// モンスターグループから1人選択
			choiceMonster(monsters);
			
			// 選ばれたモンスターが、選ばれた人間を攻撃
			 attack(Living target);

			// 人間のHPが0以下になれば、人間は倒れ、その人間をモンスターグループから削除
			 if(monsters.geHp() <= 0) {
					Predicate <String> conditon = humans.get.Hp <= 0;
					Human.removeif(cpndition)
			    		System.out.println("★ 「" + humans.getName() + "」は倒れた。");
				}

			// 人間グループに誰もいなくなれば、人間グループの敗北
			 if (humans.isEmpty()) {
				 System.out.println("★★ ==== 決着がついた！！ ==== ★★");
				System.out.println("#### 人間達は敗北した！！ ####");
			}	 
			
			// 現在の各グループの状態を一覧表示
			showGroupInfos(humans, monsters);
			
			// ループ変数を1増やす
			count++;
		}

		// 最後に各グループの状態を一覧表示してプログラム終了
		showGroupInfos(humans, monsters);

	}

	// 引数でもらった人間グループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Human choiceHuman(List<Human> humans) {
		Human human = humans.get(Dice.get(0, humans.size() - 1));
		System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
		return human;
	}

	// 引数でもらったモンスターグループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
		return monster;
	}

	// 引数でもらった人間グループリストとモンスターグループリストのそれぞれの情報一覧を表示するメソッド
	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {

		System.out.println("\n## === グループ情報 === ##");
		System.out.printf("# [人間グループ]: %d人\n", humans.size());
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}
	}

}
