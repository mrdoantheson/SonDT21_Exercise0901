package exercise;

public class StringSample {
    public static void main(String[] args) {

    /*
    String Immutable
    */
        System.out.println("-- String Immutable: always create new objects when changing --");
        String value = "fpt";
        System.out.println("Before change:" + value);
        value.concat(" software");
        value.toUpperCase();
        System.out.println("After change: " + value);

   /*
    String Literal
    */
        System.out.println("\n-- String Literal: " + "the same reference to only one value in the string pool --");
        String firstString = "Vietnam";
        String secondString = "Vietnam";
        String thirdString = "Japan";
        System.out.println("firstString == secondString: " + (firstString == secondString));
        System.out.println("firstString == thirdString: " + (firstString == thirdString));
   /*
    String Object
    */
        System.out.println("\n-- String Object: the difference reference in heap space --");
        String fourString = new String("Vietnam");
        String fiveString = new String("Vietnam");
        String sixString = new String("Japan");
        System.out.println("fourString == fiveString: " + (fourString == fiveString));
        System.out.println("fourString == sixString: " + (fourString == sixString));
    /*
    String Methods
    */
        System.out.println("\n-- String Methods --");
        String str = "Fpt Software";
        System.out.println("concat() method: " + str.concat(" Vietnam"));
        System.out.println("toUpperCase() method: " + str.toUpperCase());
        System.out.println("toLowerCase() method: " + str.toLowerCase());
        System.out.println("substring(0,4) method: " + str.substring(0, 4));
        System.out.println("length() method: " + str.length());
        System.out.println("indexOf(\"t\") method: " + str.indexOf("t"));
        System.out.println("lastIndexOf() method: " + str.lastIndexOf("t"));
        System.out.println("charAt(8) method: " + str.charAt(8));
        System.out.println("contains(\"ware\") method: " + str.contains("ware"));
        String s1 = "FPT";
        String s2 = new String("FPT");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}