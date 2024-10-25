package org.iesvdm.Exercises.Ej3;

public class Ej3 {
    public static void main(String[] args) {
/**
 *
 * Three lists of type LispList<Integer> are declared:
 *
 * LispList<Integer> ls1, ls2, ls3;
 *
 * The user enters two lists of integers
 *
 * System.out.print("Enter a list (of integers): ");
 * String str = in.nextLine();
 * ls1 = parseIntLispList(str);
 * System.out.print("Enter another list (of integers): ");
 * str = in.nextLine();
 * ls2 = parseIntLispList(str);
 *
 * The entered lists are converted to LispList<Integer> objects using the parseIntLispList method.
 *
 * Then, a Joiner<Integer> object called adder is created and initialized with an instance of JoinByAdding:
 *
 * Joiner<Integer> adder = new JoinByAdding();
 *
 * The two lists are combined using the zipLists method of the Joiners class,
 * which takes the Joiner and the two lists as arguments:
 *
 * ls3 = Joiners.zipLists(adder, ls1, ls2);
 *
 * Finally, the result of the combination is printed to the console
 *
 * System.out.println("Summing the corresponding integers in the lists gives:\n" + ls3);
 *
 * The parseIntLispList method converts a string representing a list of integers into a LispList<Integer> object.
 * First, it trims the string and removes the brackets
 * String line = str.trim();
 * String contents = line.substring(1, line.length() - 1).trim();
 *
 * If the list is empty, it returns an empty list
 *
 * if (contents.length() == 0) {
 * return LispList.empty();
 * }
 *
 * Otherwise, it splits the string into individual elements, converts them to integers, and adds them to the list:
 *
 * String[] nums = contents.split(",");
 * LispList<Integer> list = LispList.empty();
 * for (int i = nums.length - 1; i >= 0; i--) {
 * String num = nums[i].trim();
 * list = list.cons(Integer.parseInt(num));
 * }
 *
 * Finally, it returns the constructed list:
 *
 * return list;
 *
 */
    }
}
