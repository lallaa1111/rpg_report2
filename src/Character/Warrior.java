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
	public int attack() {
		int sum = super.attack();
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
