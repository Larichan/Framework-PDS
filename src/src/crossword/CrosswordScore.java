package crossword;

import core.Score;

public class CrosswordScore implements Score {
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