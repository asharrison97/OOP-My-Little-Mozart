package a3.midifactory;

import javax.sound.midi.*;

/**
 * MidiEventFactory interface, which will be implemented by our midi event factory class.
 */
public interface MidiEventFactory {
	/**
	 * Creates an on/off note
	 * @param tick - which tick is the note on
	 * @param note - note data
	 * @param velocity - note velocity
	 * @param channel - note channel, to assign instruments
	 * @return
	 * @throws InvalidMidiDataException - if invalid data is passed
	 */
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}
