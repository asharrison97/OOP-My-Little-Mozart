package a3.instrumentstrategy;

import javax.sound.midi.*;

/**
 * public class AcousticGrandPianoStrategy - Implements InstrumentStrategy interface,
 * this class contains a method that changes the instrument within the track.
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	/**
	 * public void applyInstrument()
	 * @param track - track you wish to modify
	 * @param channel - channel data
	 */
	public void applyInstrument(Track track, int channel) {
		/*Receiver receiver = track;
		try {
			receiver = MidiSystem.getReceiver();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("MidiUnavailableException");
		}*/
		
		ShortMessage sm = null;
		try {
			sm = new ShortMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("InvalidMidiDataException");
		}

		//receiver.send(sm, 0);
		MidiEvent mE = new MidiEvent(sm, 0);
		track.add(mE);
	}
}
