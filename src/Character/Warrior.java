package Character;

import java.util.Scanner;

public class Warrior extends Hero {

	public Warrior(String name) {
		super(name);
		power = 20;
		hp = 80;
		defense = 25;
		mp = 0;
	}

	@Override
	public int attack(String monsterName) {
		int sum = super.attack(monsterName);
		Scanner in = new Scanner(System.in);
		if (level >= 2 && mp >= 10) {
			System.out.println("1. 일반 공격\n2. 쓰러스터");
			System.out.print("공격을 선택하세요: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1 -> {
				sum = level * 10 + power * 30;
			}
			case 2 -> {
				sum = level * 10 + power * 30 + 100;
				mp -= 10;
				if (monsterName.equals("멧돼지")) {
					sum += 50;
					System.out.println("멧돼지는 당신의 공격에 아파합니다!");
				}
			}
			}
		}
		return sum;
	}

	@Override
	public void attacked(int sum) {
		super.attacked(sum);
	}
}
