package a3.staccatomidieventfactory;

import javax.sound.midi.*;

import a3.midieventfactory.MidiEventFactory;

public class StaccatoMidiEventFactory implements MidiEventFactory {

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
