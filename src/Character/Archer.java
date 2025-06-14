package Character;

import java.util.Scanner;

public class Archer extends Hero {
	public Archer(String name) {
		super(name);
		power = 15;
		hp = 70;
		defense = 30;
		mp = 0;
	}

	@Override
	public int attack() {
		Scanner in = new Scanner(System.in);
		int sum = level * 10 + power * 30;
		if (level >= 2 && mp >= 10) {
			System.out.println("1. 일반 공격\n2. 독화살");
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