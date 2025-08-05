package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
		public Monster(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			 super(name, weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int num = Dice.get(1, 10);
			int damage =this.offensive * num;
			

			// 相手のHPをダメージ値だけ減らす
			int target.getHp() {
				setHp(-= damage);
				
			}
			

			// 自分の攻撃力を1だけ減らす
			int this.offensive -= 1;

			// コンソールにステータスを表示
			System.out.println(String this.name + "が" + this.weapon + "で攻撃！" + this.target + "に" + int damage + "のダメージを与えた。");
			System.out.println("しかし自分の攻撃力も1減少した。");
		}
	}
