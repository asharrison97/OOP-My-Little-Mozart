package a3.pitchstrategy;

public class HigherPitchStrategy implements PitchStrategy{
	public int modifyPitch(int note) {
		int transposedNote = note + 2;
		
		return transposedNote;
	}
}
