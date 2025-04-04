package a3.instrumentstrategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrumpetStrategy implements InstrumentStrategy{
	public void applyInstrument(Track track, int channel) {
		Receiver receiver = null;
		try {
			receiver = MidiSystem.getReceiver();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("MidiUnavailableException");
		}
		
		ShortMessage sm = null;
		try {
			sm = new ShortMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);
		} catch (InvalidMidiDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("InvalidMidiDataException");
		}
		
		receiver.send(sm, 0);
	}
}
