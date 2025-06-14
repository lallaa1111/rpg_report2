package Map;

import java.util.ArrayList;
import java.util.Scanner;

import Character.Hero;

public class WeaponStore {
	public ArrayList<String> weaponlist = new ArrayList<>();
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
		System.out.println("1. 연습용 목검(가격: 10)\n2. 전투용 검(가격: 50)\n3. 전설의 검(가격: 500)");
		System.out.print("무기를 선택하세요: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1 -> {
			if (hero.money >= 10) {
				hero.money -= 10;
				hero.power += 10;
				System.out.println("구매가 완료되었습니다.");
				weaponlist.add("연습용 목검");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		case 2 -> {
			if (hero.money >= 50) {
				hero.money -= 50;
				hero.power += 50;
				System.out.println("구매가 완료되었습니다.");
				weaponlist.add("전투용 검");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		case 3 -> {
			if (hero.money >= 500) {
				hero.money -= 500;
				hero.power += 500;
				System.out.println("구매가 완료되었습니다.");
				weaponlist.add("전설의 검");
			} else {
				System.out.println("구매를 실패하였습니다.(돈 부족)");
			}
		}
		}
	}

	public void upgrade(Hero hero) {
		Scanner in = new Scanner(System.in);
		int num = 1;
		ArrayList<String> choice = new ArrayList<>();
		for (String weapon : weaponlist) {
			System.out.println(num + ": " + weapon);
			num++;
		}
		System.out.print("업그레이드할 두 무기를 고르세요: ");
		int choice1 = in.nextInt();
		int choice2 = in.nextInt();
		choice.add(weaponlist.get(choice1 - 1));
		choice.add(weaponlist.get(choice2 - 1));
		if (choice.get(0).equals("전투용 검") && choice.get(1).equals("전투용 검")) {
			weaponlist.add("비싼 전투용 검");
			hero.power += 300;
			System.out.println("비싼 전투용 검이 완성되었습니다!");
			int max = Math.max(choice1, choice2);
			int min = Math.min(choice1, choice2);
			weaponlist.remove(max - 1);
			weaponlist.remove(min - 1);
		} else if (choice.get(0).equals("연습용 목검") && choice.get(1).equals("연습용 목검")) {
			weaponlist.add("비싼 연습용 목검");
			hero.power += 30;
			System.out.println("비싼 연습용 목검이 완성되었습니다!");
			int max = Math.max(choice1, choice2);
			int min = Math.min(choice1, choice2);
			weaponlist.remove(max - 1);
			weaponlist.remove(min - 1);
			;
		} else {
			System.out.println("무기를 합칠 수 없습니다.");
		}
	}

}
