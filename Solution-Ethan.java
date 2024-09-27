import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;

public class Needlefinder {
public static file getFile() { return new
}
File("C:\\Users\\Ethan\\eclipse-workspace\\Needle-in-a-Haystack\\files\\haystack.txt");
public static ArrayList<Integer> findNeedle(File f1) {
try {
// Create scanner to iterate through the
Scanner s1 = new Scanner(f1);
file
// Variables to track where possible needles may be found.
int line = 0;
int lineNNeedle-8;
String next;
// Array list to track 200 length long patters
ArrayList<String> twoHundredStored = new ArrayList<String>(); ArrayList<Integer> needles = new ArrayList<integer>();
// Run through the entire txt file
while (s1.hasNext()) {
next - s1.nextLine();
line++;
file.
if (next.length() > 6) continue; lineNoNeedle++;
if (lineNoNeedle <- 298) twoHundredStored.add(next);
else {
twoHundredStored.add(next); twoHundredStored.remove(0);
for (int i = 0; i < 100; i++) {
if (twoHundredStored.get(i).equals(twoHundredStored.get(i+108))) { if (i--99) needles.add(line-188);
}
else break;
}
}
}
System.out.println(needles.size()); return needles;
} catch (FileNotFoundException e) { // TODO Auto-generated catch block e.printStackTrace();
return null;
}
}
public static void main(String[] args) {
File fl-getFile();
System.out.println(findNeedle(1));
}
}
