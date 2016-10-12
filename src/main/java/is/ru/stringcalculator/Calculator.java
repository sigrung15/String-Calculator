package is.ru.stringcalculator;

public class Calculator{
  public static int add(String text) throws Exception{
    if(text.equals(""))
      return 0;
    else if(text.contains("-")){
      String negatives = "";
      for(String number : splitNumbers(text))
        if(toInt(number) < 0)
          negatives += number + ",";
      throw new Exception("Negatives not allowed: " + negatives.substring(0, negatives.length() - 1));
    }
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
    return text.split(",|\n");
  }

  private static int sum(String[] numbers){
    int sum = 0;
    for(String number : numbers)
      sum += toInt(number);
    return sum;
  }
}
