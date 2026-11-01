
public class IntegerValueOfDemo {
    public static void main(String[] args) {
        
      String decimalStr="100";
      Integer decimalObj=Integer.valueOf(decimalStr);
      System.out.println("Decimal Value: " + decimalObj);

      String binaryStr="1010";
      Integer binaryObj=Integer.valueOf(binaryStr,2);       
      System.out.println("Binary to Decimal: "+binaryObj);

      String octalStr="17";
      Integer octalObj=Integer.valueOf(octalStr,8);
      System.out.println("Octal to Decimal: "+ octalObj);

      String hexStr="1A";
      Integer hexObj= Integer.valueOf(hexStr,16);
      System.out.println("Hexadecimal to Decimal: "+hexObj);

    }
}