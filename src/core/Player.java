package core;

public abstract class Player {

	protected final String name;
	protected final Score score;

	public Player(String name, Score score) {
		this.name = name;
		this.score = score;
	}

	public void updatePlayer() {
	};

}
