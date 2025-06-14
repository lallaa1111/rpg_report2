package Character;

public class Wild_Dog extends Monster {
	public Wild_Dog() {
		name = "들개";
		hp = 1000;
		mp = 0;
		level = 7;
		power = 100;
		defense = 30;
		money = 40;
		experience = 70;
	}

	@Override
	public int attack() {
		return super.attack();
	}

	@Override
	public void attacked(int sum) {
		super.attacked(sum);
	}

}
