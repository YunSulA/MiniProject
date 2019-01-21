package Calendar;

import java.util.Calendar;

public class CalendarExample08 {
   public static void main(String[] args) {
	   Calendar today = Calendar.getInstance();
	   
	   int year = today.get(Calendar.YEAR);
	   int month = today.get(Calendar.MONTH)+1;
	// int year = 1992;
    // int month = 1;
	   
	   
      Calendar startDay = Calendar.getInstance();
      Calendar endDay = Calendar.getInstance();
      Calendar endDay2 = Calendar.getInstance();
      startDay.set(year, month - 1, 1);
      endDay.set(Calendar.DAY_OF_MONTH, -1);
      endDay2.set(year, month - 1, 1);
      int e = endDay2.getActualMaximum(Calendar.DAY_OF_MONTH);

      int start = startDay.get(Calendar.DAY_OF_WEEK);
      System.out.println(start);
      System.out.println("     " + year + "년" + month + "월");
      System.out.println(" SU MO TU WE TH FR SA");

      Calendar date = Calendar.getInstance();
      date.set(year - 1, month + 10, 31);
      date.add(Calendar.DAY_OF_MONTH, -(start - 1));

      for (int i = 1; i < start; i++) {
         System.out.print(" ");
         System.out.print(date.get(Calendar.DATE) + i);
      }
      for (int i = 1; i <= e; i++) {

         if (i < 10) {
            System.out.print("  " + i); // 1자리 숫자이면 공백2개
         } else {
            System.out.print(" " + i); // 2자리 숫자이면 공백1개
         }
         if (start++ % 7 == 0) { // 7의 배수이면 다음줄로 이동
            System.out.println();
         }
      }

      int d = startDay.get(Calendar.DAY_OF_WEEK);

      Calendar endDay3 = Calendar.getInstance();
      endDay3.set(year, month - 1, 1);
      endDay3.set(year, month - 1, endDay3.getActualMaximum(Calendar.DAY_OF_MONTH));
      int t = endDay3.get(Calendar.DAY_OF_WEEK);

      // endDay3.set(year, month - 1,
      // endDay3.getActualMaximum(Calendar.DAY_OF_MONTH));

      // 엔드데이3의 마지막날의 요일을 구해야함
      int a = endDay3.get(Calendar.DAY_OF_WEEK);

      for (int i = 1; i <= 7 - t; i++) {
         System.out.print("  ");
         System.out.print(i);

      }

   }
}