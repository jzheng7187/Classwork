/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast with the 
 * ProceduralExample. It embodies an Object-Oriented
 *  approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("JIllian","programmer");
		Student jordan = new Junior("Jordan","nurse");
		Student joseph = new Freshman("Joseph","community worker");
		jillian.talk();
		jordan.talk();
		joseph.talk();
		
	}

}
