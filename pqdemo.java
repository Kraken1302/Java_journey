import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class pqdemo {
// Generic function to convert an Array to Set
public static <T> Set<T> convertArrayToSet(T array[])
{
Set<T> set = new HashSet<>(); // Create an empty Set

for (T t : array) {// Iterate through the array
set.add(t);        // Add each element into the set
}
return set;
}
public static void main(String args[])
{

String array[]                                  // Create an Array
= { "aa", "bb", "cc" };
System.out.println("Array: "                   // Print the Array
+ Arrays.toString(array));
Set<String> set = convertArrayToSet(array);   // convert the Array to Set
System.out.println("Set: " + set);           // Print the Set
}
}