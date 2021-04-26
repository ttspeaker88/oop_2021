package szinez;

import java.awt.Color;

public class myColor extends Color {

	public myColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}

	@Override
	public String toString() {
		if (this.equals(BLUE))
			return "k�k";
		else if (this.equals(GREEN))
			return "z�ld";
		else if (this.equals(RED))
			return "piros";
		else
			return "?";
	}

}
