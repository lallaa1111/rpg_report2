package Character;

import Main.Mission;

public class Hero extends Character {
	public int money = 0;
	public int power, defense, experience = 0;

	public Hero(String name) {
		this.name = name;
		level = 1;
	}

	public int attack() {
		int sum = level * 10 + power * 30;
		return sum;
	}

	public void attacked(int sum) {
		System.out.println("몬스터의 공격입니다.");
		if (defense >= sum) {
			System.out.printf("몬스터의 공격력이 너무 낮습니다. %s가 받는 데미지는 0입니다.", name);
		} else {
			System.out.printf("%s가 받는 데미지는 %d입니다.\n", name, sum);
			hp = hp + defense - sum;
			if (hp > 0) {
				System.out.printf("%s의 HP는 %d입니다.\n", name, hp);
			} else {
				System.out.println(name + "가 죽었습니다");
			}
		}
	}

	public void herolevelup() {
		if (experience >= level * 80) {
			level += 1;
			System.out.printf("%s의 레벨이 %d가 되었습니다.\n", name, level);
			money += level * 50;
			System.out.printf("보상으로 돈 %d원을 받습니다!\n", level * 50);
			experience = 0;
			Mission.mission(this);
		}
	}
}
