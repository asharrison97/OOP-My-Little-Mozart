package a3.midifactory;

/**
 * public class LegatoMidiEventFactoryAbstract - Implements MidiEventFactoryAbstract
 * interface, designed to create and return an empty StaccatoMidiEvent factory.
 */
public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	public MidiEventFactory createFactory() {
		MidiEventFactory newFactory = new LegatoMidiEventFactory();
		
		return newFactory;
	}
}
