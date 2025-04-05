package a3.midifactory;

/**
 * MidiEventFactoryAbstract interface, which will be implemented by our different midi event factory classes, which are standard, staccato, and legato.
 */
public interface MidiEventFactoryAbstract {
	/**
	 * Method will be implemented later, with the goal of generating factories based on whichever type we need.
	 * @return
	 */
	MidiEventFactory createFactory();
}
