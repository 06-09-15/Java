public class longestStreak {
  public static void longestStreak (String str) {
    int currentStreak = 1, longestStreak = 1;

    for (int i = 1; i < str.length(); i++) 
    {
        if (str.charAt(i) == str.charAt(i - 1)) 
        {
            currentStreak++;
            longestStreak = Math.max(longestStreak, currentStreak);
        } 
        else 
        {
            currentStreak = 1;
        }
    }

    System.out.println(str.charAt(0) + "" + longestStreak);   
  }
}
