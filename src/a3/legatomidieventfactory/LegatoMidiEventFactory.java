package a3.legatomidieventfactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

import a3.midieventfactory.MidiEventFactory;

public class LegatoMidiEventFactory implements MidiEventFactory {

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
