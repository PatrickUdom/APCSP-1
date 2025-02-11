import java.util.List;
import java.util.ArrayList;

public class Recipients {

    /** The list of lines in the mailing list */
    public List<String> lines;

    /** Constructor. Fill lines with mailing list data.
    * Postcondition:
    * - Each element in lines is one line of the mailing list.
    * - Lines appear in the list in the same order
    * that they appear in the mailing list.
    * - Blank line separators in the mailing list are stored
    * as empty strings.
    */
    public Recipients() { 
        lines = new ArrayList<>();
    }   

    /** Postcondition: Returns the city contained in the cityZip
    * string of an address.
    * @param cityZip contains the city, state, and zipcode
    * line of an address
    * @return the city substring contained in cityZip
    */
    public String extractCity(String cityZip) {
        String city = "";
        int i = 0;
        while (cityZip.charAt(i) != ',') {
            city += cityZip.charAt(i);
            i++;
        }
        return city;
    }

    /** Precondition: The recipient name is the first line of each
    * label on the mailing list.
    * Postcondition: Prints a list of recipient names to console,
    * one per line.
    */
    public void printNames() {
        for (int i = 0; i < lines.size()-1; i++) {
            if (lines.get(i).equals("")) {
                System.out.println(lines.get(i+1));
            }
        }
    }

    /** Postcondition: Returns the address of the recipient with
    * the specified name.
    * @param name a name in the lines ArrayList
    * @return the address of the recipient with the given name
    */
    public String getAddress(String name) {
        String address = "";
        for (int i = 0; i < lines.size()-1; i++) {
            if (lines.get(i).equals(name)) {
                int k = i+1;
                boolean end = true;
                while (end) {
                    address += lines.get(k) + " ";
                    k++;
                    if (lines.get(k+1).equals("")) {
                        end = false;
                    }
                }
            }
        }
        return address;
    }
}