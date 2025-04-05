package a3.pitchstrategy;

/** 
 * public interface PitchStrategy - This interface will be 
 * implemented in future classes that will be used to lower the 
 * pitch of notes.
 */
public interface PitchStrategy {
	int modifyPitch(int note);
}
