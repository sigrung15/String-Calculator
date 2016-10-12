package is.ru.stringcalculator;

public class Calculator{
  public static int add(String text) throws Exception{
    if(text.equals(""))
      return 0;
    else if(text.contains("-"))
      throw new Exception("Negatives not allowed: " + negativeNumbers(text));
    else if(text.contains(",") || text.contains("\n")){
      return sum(splitNumbers(text));
    }
    else
      return 1;
  }

  private static int toInt(String number){
    return Integer.parseInt(number);
  }

  private static String[] splitNumbers(String text){
    if(text.startsWith("//")){
      String delimiter = text.substring(2,3);
      text = text.substring(4, text.length());
      return text.split(delimiter);
    }
    return text.split(",|\n");
  }

  private static int sum(String[] numbers){
    int sum = 0;
    for(String number : numbers){
      if(toInt(number) > 1000)
        ;
      else
        sum += toInt(number);
    }
    return sum;
  }

  private static String negativeNumbers(String text){
    String negatives = "";
    for(String number : splitNumbers(text))
      if(toInt(number) < 0)
        negatives += number + ",";
    return negatives.substring(0, negatives.length() - 1);
  }
}
