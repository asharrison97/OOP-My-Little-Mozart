package a3.pitchstrategy;

public class HigherPitchStrategy implements PitchStrategy{
	public int modifyPitch(int note) {
		note += 2;
		
		return note;
	}
}
