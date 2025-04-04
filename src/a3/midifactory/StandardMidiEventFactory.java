package a3.midifactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public class StandardMidiEventFactory implements MidiEventFactory {
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		
	}
	
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		
	}
}
