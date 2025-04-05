package a3.midifactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

/**
 * StaccatoMidiEventFactory class. Implements MidiEventFactory interface, and contains two methods used to generate
 * notes, either on or off. Accepts parameters that are intended to come from a .csv file, which are properly read/stored
 * in a separate function.
 */
public class StaccatoMidiEventFactory implements MidiEventFactory {
	/** 
	 * public MidiEvent createNoteOn() - This method creates an "on" note. First, it creates a ShortMessage object with the 
	 * data passed to the method, and then stores it in a MidiEvent object along with the tick.
	 * @param tick - note tick
	 * @param note - note data
	 * @param velocity - note velocity
	 * @param channel - note channel
	 * @return
	 */
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		
		ShortMessage sm = new ShortMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		MidiEvent midiEvent = new MidiEvent(sm, tick+80);
		
		return midiEvent;
	}	
	
	/** 
	 * public MidiEvent createNoteOff() - This method creates an "off" note. First, it creates a ShortMessage object with the 
	 * data passed to the method, and then stores it in a MidiEvent object along with the tick.
	 * @param tick - note tick
	 * @param note - note data
	 * @param velocity - note velocity
	 * @param channel - note channel
	 * @return
	 */
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		
		ShortMessage sm = new ShortMessage(ShortMessage.NOTE_OFF, channel, note);
		MidiEvent midiEvent = new MidiEvent(sm, tick+80);
		
		return midiEvent;
	}
}
