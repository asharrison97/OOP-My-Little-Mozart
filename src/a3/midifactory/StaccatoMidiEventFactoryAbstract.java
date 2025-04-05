package a3.midifactory;

/**
 * public class StaccatoMidiEventFactoryAbstract - Implements MidiEventFactoryAbstract
 * interface, designed to create and return an empty StaccatoMidiEvent factory.
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	public MidiEventFactory createFactory() {
		MidiEventFactory newFactory = new StaccatoMidiEventFactory();
		
		return newFactory;
	}
}

