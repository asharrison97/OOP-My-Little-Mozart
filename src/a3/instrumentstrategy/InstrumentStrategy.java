package a3.instrumentstrategy;
import javax.sound.midi.*;

/**
 * public interface InstrumentStrategy - This interface will be implemented in
 * future classes that will be designed to modify the instrument within a track.
 */
public interface InstrumentStrategy {
	void applyInstrument(Track track, int channel);
}
