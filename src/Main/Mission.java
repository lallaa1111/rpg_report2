package Main;

import Character.Hero;
import Map.WeaponStore;

public class Mission {
	public static void mission(Hero hero) {
		if (hero.level >= 2) {
			System.out.println("******* 미션 *******");
			System.out.println("무기를 구매하여 업그레이드하세요.(보상: 경험치 20)");

		} else if (hero.level >= 3) {
			System.out.println("******* 미션 *******");
			System.out.println("들개를 죽이세요.(보상: 경험치 30)");
		}
	}

	public void mission2(Hero hero, WeaponStore weapon) {
		if (hero.level >= 2 && (weapon.weaponlist.contains("비싼 전투용 검") || weapon.weaponlist.contains("비싼 연습용 목검"))) {
			hero.experience += 20;
			System.out.println("미션을 완료하였습니다!(보상: 경험치 20)");
		}
	}

	public void mission3(Hero hero) {
		if (hero.level >= 3) {
			hero.experience += 30;
			System.out.println("미션을 완료하였습니다!(보상: 경험치 30)");
		}
	}
}
