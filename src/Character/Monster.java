package Character;

public class Monster extends Character {
	public int money;
	public int power, defense, experience;
	public String name;

	public int attack() {
		int sum = level * 10 + power * 30;
		return sum;
	}

	public void attacked(int sum) {
		System.out.println("당신의 공격입니다.");
		if (defense >= sum) {
			System.out.printf("공격력이 너무 낮습니다. %s가 받는 데미지는 0입니다.", name);
		} else {
			System.out.printf("%s가 받는 데미지는 %d입니다.\n", name, sum);
			hp = hp + defense - sum;
			if (hp > 0) {
				System.out.printf("%s의 HP는 %d입니다.\n", name, hp);
			} else {
				System.out.println(name + "가 죽었습니다.");
			}
		}
	}
}
