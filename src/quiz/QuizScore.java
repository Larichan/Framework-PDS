package quiz;

import core.Score;

public class QuizScore implements Score {
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
