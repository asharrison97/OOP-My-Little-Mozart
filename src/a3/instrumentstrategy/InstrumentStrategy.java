package a3.instrumentstrategy;
import javax.sound.midi.*;

public interface InstrumentStrategy {
	void applyInstrument(Track track, int channel);
}
