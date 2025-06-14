package Map;

import java.util.Scanner;

import Character.Archer;
import Character.Hero;
import Character.Warrior;
import Character.Wizard;

public class WeaponStore {
	static String stars = "***************************************************************************************";

	public void choice(Hero hero) {
		Scanner in = new Scanner(System.in);
		System.out.println(stars + "\n무기 상점에 입장하였습니다.");
		System.out.println("1. 무기 구매\n2. 무기 업그레이드");
		System.out.print("무엇을 하시겠습니까?: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1 -> {
			purchase(hero);
		}
		case 2 -> {
			upgrade(hero);
		}
		}
	}

	public void purchase(Hero hero) {
		Scanner in = new Scanner(System.in);
		if (hero instanceof Warrior) {
			System.out.println("1. 연습용 목검(가격: 10)\n2. 전투용 검(가격: 50)\n3. 전설의 검(가격: 500)");
		}
		if (hero instanceof Wizard) {
			System.out.println("1. 가벼운 마법봉(가격: 10)\n2. 좋은 마법봉(가격: 50)\n3. 전설의 마법봉(가격: 500)");
		}
		if (hero instanceof Archer) {
			System.out.println("1. 싸구려 활(가격: 10)\n2. 강력한 활(가격: 50)\n3. 전설의 활(가격: 500)");
		}
		System.out.print("무기를 선택하세요: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1 -> {
			if (hero.money >= 10) {
				hero.money -= 10;
				if (hero instanceof Warrior) {
					hero.power += 10;
					hero.addWeapon("연습용 목검");
				}
				if (hero instanceof Wizard) {
					hero.hp += 10;
					hero.addWeapon("가벼운 마법봉");
				}
				if (hero instanceof Archer) {
					hero.defense += 10;
					hero.addWeapon("싸구려 활");
				}
				System.out.println("구매가 완료되었습니다.");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		case 2 -> {
			if (hero.money >= 50) {
				hero.money -= 50;
				if (hero instanceof Warrior) {
					hero.power += 50;
					hero.addWeapon("전투용 검");
				}
				if (hero instanceof Wizard) {
					hero.hp += 50;
					hero.addWeapon("좋은 마법봉");
				}
				if (hero instanceof Archer) {
					hero.defense += 50;
					hero.addWeapon("강력한 활");
				}
				System.out.println("구매가 완료되었습니다.");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		case 3 -> {
			if (hero.money >= 500) {
				hero.money -= 500;
				if (hero instanceof Warrior) {
					hero.power += 500;
					hero.addWeapon("전설의 검");
				}
				if (hero instanceof Wizard) {
					hero.hp += 500;
					hero.addWeapon("전설의 마법봉");
				}
				if (hero instanceof Archer) {
					hero.defense += 500;
					hero.addWeapon("전설의 활");
				}
				System.out.println("구매가 완료되었습니다.");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		}
	}

	public void upgrade(Hero hero) {
		Scanner in = new Scanner(System.in);
		if (hero instanceof Warrior) {
			System.out.print("1. 연습용 목검\n2. 전투용 검\n업그레이드할 무기를 고르세요: ");
			int choice = in.nextInt();
			if (choice == 1 && hero.countWeapon("연습용 목검") >= 2) {
				hero.removeWeapon("연습용 목검");
				hero.addWeapon("비싼 연습용 목검");
				hero.power += 30;
			} else if (choice == 2 && hero.countWeapon("전투용 검") >= 2) {
				hero.removeWeapon("전투용 검");
				hero.addWeapon("비싼 전투용 검");
				hero.power += 150;
			} else {
				System.out.println("무기를 합칠 수 없습니다.");
			}
		}
		if (hero instanceof Wizard) {
			System.out.print("1. 가벼운 마법봉\n2. 좋은 마법봉\n업그레이드할 무기를 고르세요: ");
			int choice = in.nextInt();
			if (choice == 1 && hero.countWeapon("가벼운 마법봉") >= 2) {
				hero.removeWeapon("가벼운 마법봉");
				hero.addWeapon("묵직한 마법봉");
				hero.hp += 30;
			} else if (choice == 2 && hero.countWeapon("좋은 마법봉") >= 2) {
				hero.removeWeapon("좋은 마법봉");
				hero.addWeapon("아주 좋은 마법봉");
				hero.hp += 150;
			} else {
				System.out.println("무기를 합칠 수 없습니다.");
			}
		}
		if (hero instanceof Archer) {
			System.out.print("1. 싸구려 활\n2. 강력한 활\n업그레이드할 무기를 고르세요: ");
			int choice = in.nextInt();
			if (choice == 1 && hero.countWeapon("싸구려 활") >= 2) {
				hero.removeWeapon("싸구려 활");
				hero.addWeapon("사냥용 활");
				hero.defense += 30;
			} else if (choice == 2 && hero.countWeapon("강력한 활") >= 2) {
				hero.removeWeapon("강력한 활");
				hero.addWeapon("힘의 활");
				hero.defense += 150;
			} else {
				System.out.println("무기를 합칠 수 없습니다.");
			}
		}
	}

}
