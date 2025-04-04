package a3.midifactory;

import javax.sound.midi.*;

public class StandardMidiEventFactory implements MidiEventFactory {
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage sm = new ShortMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		MidiEvent midiEvent = new MidiEvent(sm, tick);
		
		return midiEvent;
	}
	
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage sm = new ShortMessage(ShortMessage.NOTE_OFF, channel, note);
		MidiEvent midiEvent = new MidiEvent(sm, tick);
		
		return midiEvent;
	}
}
