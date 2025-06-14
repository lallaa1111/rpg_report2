package Character;

import java.util.Scanner;

public class Wizard extends Hero {

	public Wizard(String name) {
		super(name);
		power = 18;
		hp = 60;
		mp = 60;
		defense = 30;
	}

	@Override
	public int attack(String monsterName) {
		Scanner in = new Scanner(System.in);
		int sum = level * 10 + power * 30;
		if (level >= 2 && mp >= 15) {
			System.out.println("1. 일반 공격\n2. 치유 마법");
			System.out.print("공격을 선택하세요: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1 -> {
				sum = level * 10 + power * 30;
			}
			case 2 -> {
				sum = level * 10 + power * 10;
				hp += 10 * level;
				System.out.println(10 * level + "만큼 치유되었습니다.");
				mp -= 20;
				if (monsterName.equals("들개")) {
					sum += 50;
					System.out.println("들개가 당신의 공격에 아파합니다.");
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
