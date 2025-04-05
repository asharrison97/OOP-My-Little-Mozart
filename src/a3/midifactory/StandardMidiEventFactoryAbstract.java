package a3.midifactory;

/**
 * public class StandardMidiEventFactoryAbstract - Implements MidiEventFactoryAbstract interface,
 * Contains a method that creates and returns a factory object of MidiEventFactory type.
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	/**
	 * public MidiEventFactory createFactory()
	 * This method will return an empty factory object of type MidiEventFactory.
	 */
	public MidiEventFactory createFactory() {
		MidiEventFactory newFactory = new StandardMidiEventFactory();
		
		return newFactory;
	}
}
