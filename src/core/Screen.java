package core;

import java.io.IOException;

public interface Screen extends Colleague {
	public void draw() throws IOException;
}
