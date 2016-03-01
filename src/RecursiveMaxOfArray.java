
/**
 * Use a double recursion to compute the maximum of an array of values.
 * 
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from <= to, from >=0, to<length, length>0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int data[], int from, int to)
    {
    	
    	if (data == null) {
    		throw new BadArgumentsForMaxException("Null array");
    	}
    	/*System.out.println("//////////");
    	System.out.println("Size: "+data.length);
    	System.out.println("From: "+from);
    	System.out.println(" To : "+to);*/
    	
    	if (data.length <= 0) {
    		throw new BadArgumentsForMaxException("Zero size");
    	}
    	
    	if (from < 0 || to >= data.length) {
    		throw new BadArgumentsForMaxException("Out of bounds");
    	}
    	
    	if (from > to) {
    		throw new BadArgumentsForMaxException("Lower bound greater than upper");
    	}
    	
        int range = to - from;
        
        if (range <= 1) {
        	return Math.max(data[from], data[to]);
        } else {
        	int index = (from+to)/2;
        	int leftMax = max(data, from, index);
        	int rightMax = max(data, index+1, to);
        	return Math.max(leftMax, rightMax);
        }

        //return result;
    }
    
    
}
