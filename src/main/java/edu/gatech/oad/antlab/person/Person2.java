package edu.gatech.oad.antlab.person;
import java.lang.Math.random();
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Longan
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name = "Longan";
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
            strArray[] = input.toCharArray();
            String output = "";
            for(int i = 0; i < strArray.length; i++) {
                int random = Math.random();
                if (random == 0) {
                    output = strArray[i] + output;
                } else {
                    output = output + strArray[i];
                }
            }
            return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
