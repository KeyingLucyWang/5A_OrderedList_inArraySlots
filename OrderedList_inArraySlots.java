public class OrderedList_inArraySlots {

	private int[] elements;
	private int filledElements;

	private static final int INITIAL_CAPACITY = 10;

	public OrderedList_inArraySlots() {
		elements = new int[ INITIAL_CAPACITY];
	}

	public int size() {
		return filledElements;
	}

	public String toString() {
		String result = "[";
		for( int index = 0; index < filledElements; index++) {
			result += elements[ index] + ",";
		}
		return result + "]";
	}

	private boolean addAtIndex( int index, int value) {
		//int current, previous = 0;
		for (int i = filledElements; i > index; i--){
			//current = this.get( i);
			//elements[i] = previous;
			//previous = current;
			elements[i] = elements[i - 1];
		}
		elements[ index] = value;
		filledElements++;
		return true;
	}

	public boolean add( int value) {
		if ( filledElements == elements.length)
			expand();

		int elemIndex = 0;
		for( int index = 0 ; index < filledElements; index++) {
			if (elements[ index] < value)
			elemIndex = index + 1;
		}
		return addAtIndex( elemIndex, value);
	}

	private void expand() {
		System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] bigger = new int[ elements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            bigger[ elemIndex] = elements[ elemIndex];
        elements = bigger;
	}

	public int get( int index) {
		int elementVal;
		int indexOf = 0;
		for( int i = 0; i <= index; i++) {
			indexOf = i;
		}
		return elementVal = elements[indexOf];
	}












}