package data_structure.classes;

/*
    Character class is immutable like String so once it's object is created it cannot be changed.
    If we pass a primitive char into a method that expects an object, compiler will automatically converts the char
    to a Character object. This feature is called as Autoboxing.
 */
public class CharacterDemo {

  public static void main(String[] args) {
    // boolean isLetter(char ch) -> true if ch is [A-Za-z] else false
    System.out.println(Character.isLetter('A'));
    System.out.println(Character.isLetter('0'));

    System.out.println("-------------------------------------");
    // boolean isDigit(char ch)
    System.out.println(Character.isDigit('C'));
    System.out.println(Character.isDigit('1'));

    // boolean isWhitespace(char ch) -> determines whether specified char is whitespace (space, tab or new line) or not
    System.out.println("--------------------------------------");
    System.out.println("isWhitespace()? .....");

    System.out.println(Character.isWhitespace('B'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t'));
    System.out.println(Character.isWhitespace('9'));
    System.out.println(Character.isWhitespace(9)); // ASCII value of tab

    System.out.println("----------------------------------------");
    System.out.println("isLowerCase()?......");

    System.out.println(Character.isLowerCase('N'));
    System.out.println(Character.isLowerCase('a'));
    System.out.println(Character.isLowerCase(97));

    System.out.println("--------------------------------------------");
    System.out.println("toUpperCase()....");
    System.out.println(Character.toUpperCase('a'));
    System.out.println(Character.toUpperCase(97));
    System.out.println(Character.toUpperCase(48));

    System.out.println("----------------------------------------------");
    System.out.println("toString(char ch)....");
    // Here it returns String class object representing specified character value.

    System.out.println(Character.toString('x'));
    System.out.println(Character.toString(97));

  }
}
