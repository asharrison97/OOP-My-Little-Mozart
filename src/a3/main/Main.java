package a3.main;

import java.util.List;
import java.util.ArrayList;
import a3.midieventdata.*;
import a3.midicsvparser.*;
import a3.midieventfactory.*;
import a3.standardmidieventfactory.*;
import a3.legatomidieventfactory.*;
import a3.staccatomidieventfactory.*;
import javax.sound.midi.*;

public class Main {

	public static void main(String[] args) {
		try {
			List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mystery_song.csv");
			Sequence sequence = new Sequence(Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
			MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
			// Other factory abstracts?
			
			MidiEventFactory factory = factoryAbstract.createFactory();
			
			// Choose an instrument strategy
			InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
			instrumentStrategy.applyInstrument(track, 0);
			instrumentStrategy = new TrumpetStrategy();
			instrumentStrategy.applyInstrument(track, 1);
			
			// Choose a pitch strategy
			PitchStrategy pitchStrategy = new HigherPitchStrategy();
			
			for (MidiEventData event : midiEvents) {
				int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
				modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
				
				if(event.getNoteOnOff() == ShortMessage.NOTE_ON) {
					track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel()));
				}
				else {
					track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
				}
			}
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.start();
			
			while(sequencer.isRunning() | sequencer.isOpen()) {
				Thread.sleep(100);
			}
			Thread.sleep(500);
			sequencer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
