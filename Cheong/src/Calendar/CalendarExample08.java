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
      System.out.println("     " + year + "��" + month + "��");
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
            System.out.print("  " + i); // 1�ڸ� �����̸� ����2��
         } else {
            System.out.print(" " + i); // 2�ڸ� �����̸� ����1��
         }
         if (start++ % 7 == 0) { // 7�� ����̸� �����ٷ� �̵�
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

      // ���嵥��3�� ���������� ������ ���ؾ���
      int a = endDay3.get(Calendar.DAY_OF_WEEK);

      for (int i = 1; i <= 7 - t; i++) {
         System.out.print("  ");
         System.out.print(i);

      }

   }
}