import core.Score;

public class GuessScore implements Score {
	private int points;

	@Override
	public void decreasePoints() {
		--points;
	}

	@Override
	public void increasePoints() {
		++points;
	}

}