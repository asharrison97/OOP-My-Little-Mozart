package a3.pitchstrategy;

public class LowerPitchStrategy implements PitchStrategy{
	public int modifyPitch(int note) {
		note -= 2;
		
		return note;
	}
}
