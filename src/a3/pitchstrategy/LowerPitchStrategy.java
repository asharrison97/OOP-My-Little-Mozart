package a3.pitchstrategy;

/**
 * public class LowerPitchStrategy - Implements the pitch strategy 
 * interface, this class contains a method designed to lower the pitch
 * of a note
 */
public class LowerPitchStrategy implements PitchStrategy{
	/**
	 * public int modifyPitch() - This method will return the same note
	 * that it was passed, however the pitch will be slightly lower.
	 * @param note - The note which will be returned with a lower pitch.
	 */
	public int modifyPitch(int note) {
		int transposedNote = note - 2;
		
		return transposedNote;
	}
}
