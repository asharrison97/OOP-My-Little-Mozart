package a3.midieventdata;

import javax.sound.midi.ShortMessage;

/**
 * public class MidiEventData - This class will hold all of the data pertaining to our MidiEvent.
 * This includes the start/end ticks, the velocity, note, channel, and whether it is an on/off note. It also
 * holds instrument data.
 */
public class MidiEventData {
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	/**
	 * Parameterized constructor for MidiEventData class.
	 * @param startEndTick
	 * @param velocity
	 * @param note
	 * @param channel
	 * @param instrument
	 * @param noteOnOff
	 */
	public MidiEventData (int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick ;
		this.velocity = velocity;
		this.note = note ;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}
	
	/**
	 * Gets the start/end tick.
	 * @return
	 */
	public int getStartEndTick() {
		return startEndTick;
	}
	
	/**
	 * Sets the start/end tick.
	 * @param startEndTick
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}
	
	/**
	 * Gets the velocity.
	 * @return
	 */
	public int getVelocity() {
		return velocity;
	}
	
	/**
	 * Sets the velocity.
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	/**
	 * Gets the note.
	 * @return
	 */
	public int getNote() {
		return note;
	}
	
	/**
	 * Sets the note.
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}
	
	/**
	 * Gets the channel.
	 * @return
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * Sets the channel.
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * Tells whether the note is on/off.
	 * @return
	 */
	public int getNoteOnOff() {
		if (noteOnOff == 0) {
			return ShortMessage.NOTE_OFF;
		}
		
		else {return ShortMessage.NOTE_ON;}
	}
	
	/**
	 * Sets the note to be on/off.
	 * @param noteOnOff
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}
	
	/**
	 * Gets the instrument.
	 * @return
	 */
	public int getInstrument() {
		return instrument;
	}
	
	/**
	 * Sets the instrument.
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	
	
}
