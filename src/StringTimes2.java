public class StringTimes2 {
  public String stringTimes(String str, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result +=str;
    }
    return result;
  }
}

//public class StringTimes2 {
//  public String stringTimes(String str, int n) {
//    StringBuilder result = new StringBuilder();
//
//    for (int i = 0; i < n; i++) {
//      result = result.append(str);
//    }
//    return result.toString();
//    }
//  }
