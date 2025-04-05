package a3.pitchstrategy;

/**
 * public class HigherPitchStrategy() - This class implements the PitchStrategy interface and contains a method
 * designed to modify the pitch and make it higher.
 */
public class HigherPitchStrategy implements PitchStrategy{
	/**
	 * public int modifyPitch() - This method will return a note
	 * that contains the same data as the note passed to the method,
	 * however the pitch will be higher.
	 * @param note - Note data which will be modified.
	 */
	public int modifyPitch(int note) {
		int transposedNote = note + 2;
		
		return transposedNote;
	}
}
