package Main;

import java.util.Random;
import java.util.Scanner;

import Character.Archer;
import Character.Hero;
import Character.Lynx;
import Character.Monster;
import Character.Raccoon;
import Character.Warrior;
import Character.Wild_Boar;
import Character.Wild_Dog;
import Character.Wizard;
import Map.PotionStore;
import Map.WeaponStore;

public class Rpg_before_calss {
	static String hero_name, monster_name;
	static String stars = "***************************************************************************************";
	static int job;
	static Hero hero;
	static Monster monster;
	static Mission m = new Mission();
	static WeaponStore w = new WeaponStore();

	public static void main(String[] args) {
		PotionStore p = new PotionStore();
		Scanner in = new Scanner(System.in);
		System.out.println("******* RPG GAME *******");
		System.out.print("히어로의 이름을 입력하세요: ");
		hero_name = in.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("1. 전사\n2. 마법사\n3. 궁수");
		System.out.print("직업을 선택하세요: ");
		job = in.nextInt();
		switch (job) {
		case 1 -> {
			hero = new Warrior(hero_name);
			System.out.println("직업이 입력되었습니다.(직업: 전사)");
		}
		case 2 -> {
			hero = new Wizard(hero_name);
			System.out.println("직업이 입력되었습니다.(직업: 마법사)");
		}
		case 3 -> {
			hero = new Archer(hero_name);
			System.out.println("직업이 입력되었습니다.(직업: 궁수)");
		}
		}
		do {
			printInfo();
			System.out.println("1. 전투장\n2. 포션 상점\n3. 무기 상점");
			System.out.print("입장할 곳을 고르세요: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1 -> {
				fight();
			}
			case 2 -> {
				p.potionStore(hero);
			}
			case 3 -> {
				w.choice(hero);
			}
			}
			if (hero.level >= 2) {
				m.mission2(hero, w);
			}
			if (hero.level >= 3 && monster.name.equals("들개")) {
				m.mission3(hero);
			}
		} while (hero.hp > 0);
	}

	public static void printInfo() {
		System.out.println(stars);
		System.out.println("현재 Hero의 이름: " + hero.name);
		System.out.printf(
				"현재 %s의 레벨: %d\n현재 %s의 힘: %d\n현재 %s의 방어력: %d\n현재 %s의 HP: %d\n현재 %s의 MP: %d\n현재 %s의 경험치: %d\n현재 %s의 돈: %d\n",
				hero.name, hero.level, hero.name, hero.power, hero.name, hero.defense, hero.name, hero.hp, hero.name,
				hero.mp, hero.name, hero.experience, hero.name, hero.money);
		System.out.println(stars);
	}

	public static void fight() {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		System.out.println("1. 너구리\n2. 살쾡이\n3. 들개\n4. 멧돼지");
		System.out.print("전투할 상대를 고르세요: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1 -> {
			monster = new Raccoon();
		}
		case 2 -> {
			monster = new Lynx();
		}
		case 3 -> {
			monster = new Wild_Dog();
		}
		case 4 -> {
			monster = new Wild_Boar();
		}
		}
		System.out.println(monster.name + "와의 전투를 시작합니다.");
		while (monster.hp > 0) {
			monster.attacked(hero.attack());
			if (monster.hp <= 0) {
				hero.experience += monster.experience;
				hero.mp += 10;
				hero.money += monster.money;
				int randomnum = r.nextInt(10);
				if (randomnum <= 2) {
					System.out.println("몬스터로부터 가시 갑옷을 얻었습니다!");
					hero.power += 30;
					hero.defense += 20;
					System.out.println("힘이 30 올랐습니다!");
					System.out.println("방어력이 20 올랐습니다!");
					hero.experience += 50;
					System.out.println("경험치가 50 올랐습니다!");
				}
				break;
			}
			hero.attacked(monster.attack());
			if (hero.hp <= 0) {
				System.out.print("부활하시겠습니까? (1: 예, 2: 아니오): ");
				int answer = in.nextInt();
				if (answer == 1) {
					hero.hp = 50;
					System.out.println("부활했습니다!");

				} else {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			}

		}
		hero.herolevelup();

	}

}
