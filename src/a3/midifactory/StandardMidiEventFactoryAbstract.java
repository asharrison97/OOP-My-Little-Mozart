package a3.midifactory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	public MidiEventFactory createFactory() {
		MidiEventFactory newFactory = new StandardMidiEventFactory();
		
		return newFactory;
	}
}
