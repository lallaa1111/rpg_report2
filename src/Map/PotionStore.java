package Map;

import java.util.Scanner;

import Character.Hero;

public class PotionStore {
	static String stars = "***************************************************************************************";

	public void potionStore(Hero hero) {
		Scanner in = new Scanner(System.in);
		System.out.println(stars + "\n포션 상점에 입장하였습니다.");
		System.out
				.println("1. 힘 증강 포션(30원)\n2. 방어력 증강 포션(30원)\n3. 경헙치 증강 포션(100원)\n4. HP 증강 포션(10원)\n5. MP 증강 포션(10원)");
		System.out.printf("원하시는 물건을 골라주세요: ");
		int choice = in.nextInt();
		System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
		switch (choice) {
		case 1 -> {
			if (hero.money >= 30) {
				hero.money -= 30;
				hero.power += 3;
				System.out.println("구매가 완료되었습니다!");
			} else {
				System.out.printf("포션을 구매할 수 없습니다. (%d원 분족)\n", 30 - hero.money);
			}
		}
		case 2 -> {
			if (hero.money >= 30) {
				hero.money -= 30;
				hero.defense += 3;
				System.out.println("구매가 완료되었습니다!");
			} else {
				System.out.printf("포션을 구매할 수 없습니다. (%d원 분족)\n", 30 - hero.money);
			}
		}
		case 3 -> {
			if (hero.money >= 100) {
				hero.money -= 100;
				hero.experience += 50;
				System.out.println("구매가 완료되었습니다!");
				hero.herolevelup();
			} else {
				System.out.printf("포션을 구매할 수 없습니다. (%d원 분족)\n", 100 - hero.money);
			}
		}
		case 4 -> {
			if (hero.money >= 10) {
				hero.money -= 10;
				hero.hp += 50;
				System.out.println("구매가 완료되었습니다!");
			} else {
				System.out.printf("포션을 구매할 수 없습니다. (%d원 분족)\n", 10 - hero.money);
			}
		}
		case 5 -> {
			if (hero.money >= 10) {
				hero.money -= 10;
				hero.mp += 50;
				System.out.println("구매가 완료되었습니다!");
			} else {
				System.out.printf("포션을 구매할 수 없습니다. (%d원 분족)\n", 10 - hero.money);
			}
		}
		}
	}
}
