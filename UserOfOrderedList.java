public class UserOfOrderedList {
	private static OrderedList_inArraySlots list;

    public static void main( String[] args ) {
    	list = new OrderedList_inArraySlots();

    	System.out.println( "number of elements: " + list.size());
    	System.out.println( "empty list: " + list
                          + System.lineSeparator());

        int elemIndex;
        for( elemIndex = 0 ; elemIndex < 5; elemIndex++ ) {
            list.add( (int)(Math.random() * 10));
            System.out.println( "number of elements: " + list.size() );
        }

        System.out.println( "populated list: " + list
                          + System.lineSeparator());

        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( (int)(Math.random() * 10));
            System.out.println( "number of elements: " + list.size());
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

    }
}