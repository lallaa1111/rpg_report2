package Main;

import Character.Hero;

public class Mission {
	boolean mission2Clear = false;
	boolean mission3Clear = false;

	public static void mission(Hero hero) {
		if (hero.level == 2) {
			System.out.println("******* 미션 *******");
			System.out.println("무기를 구매하여 업그레이드하세요.(보상: 경험치 20)");

		} else if (hero.level == 3) {
			System.out.println("******* 미션 *******");
			System.out.println("들개를 죽이세요.(보상: 경험치 30)");
		}
	}

	public void mission2(Hero hero) {
		if (mission2Clear == false && hero.level >= 2
				&& (hero.countWeapon("비싼 연습용 목검") >= 1 || hero.countWeapon("비싼 전투용 검") >= 1
						|| hero.countWeapon("묵직한 마법봉") >= 1 || hero.countWeapon("아주 좋은 마법봉") >= 1
						|| hero.countWeapon("사냥용 활") >= 1 || hero.countWeapon("함의 활") >= 1)) {
			hero.experience += 20;
			System.out.println("미션을 완료하였습니다!(보상: 경험치 20)");
			mission2Clear = true;
		}
	}

	public void mission3(Hero hero) {
		if (mission3Clear == false && hero.level >= 3) {
			hero.experience += 30;
			System.out.println("미션을 완료하였습니다!(보상: 경험치 30)");
			mission3Clear = true;
		}
	}
}
