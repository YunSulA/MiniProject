package model;

import javax.swing.JOptionPane;

public class Academy {
	 // 기본 필드 (테이블 항목)
    //private String itcourse;  단과 : 체크박스로 변경
     private String name;
     private String birth;
     private String tel;
     private String address;
     private String major;
     private int tribute;   // 조공횟수
     private int databaseScore;
     private int javaScore;
     private int javascriptScore;
     private int jspScore;
     private double attendance;
     private String survey;
     // 매개변수, 개수가 같은 타입인 항목들은 어떤 버튼을 눌렀는지 구분하기 위해 아래 public static boolean 타입들을 추가해놓았다.
     public static boolean nameB = false;
     public static boolean birthB = false;
     public static boolean telB = false;
     public static boolean addressB = false;
     public static boolean surveyB = false;
     public static boolean majorB = false;
     public static boolean tributeB = false;
     public static boolean databaseScoreB = false;
     public static boolean javaScoreB = false;
     public static boolean javascriptScoreB = false;
     public static boolean jspScoreB = false;
     
     
     // 기본생성자 // 
     public Academy() { }
     
     // 인원추가용 전체 생성자  
     public Academy(String name, String birth, String tel, String address, String major, int tribute, int database, int java, int script, int jsp, double attendance, String survey) {
        this.name = name;
        this.birth = birth;
        this.tel = tel;
        this.address = address;
        this.major = major;
        this.tribute = tribute;
        this.databaseScore = database;
        this.javaScore = java;
        this.javascriptScore = script;
        this.jspScore = jsp;
        this.attendance = attendance;
        this.survey = survey;
     }
     
     // String 1개 타입 생성자 ( 이름, 생일, 전화번호, 주소, 전공, 설문 )
     public Academy(String str) {
        if (nameB) {
           this.name = str;
        }
        if (birthB) {
           this.birth = str;
        }
        if (telB) {
           this.tel = str;
        }
        if (addressB) {
           this.address = str;
        }
        if (majorB) {
           this.major = str;
        }
        if (surveyB) {
           this.survey = str;
        }
     }
     
     
     // int 1개 타입 생성자 ( 조공, 점수1, 점수2, 점수3, 점수4 )
     public Academy(int integer) {
        
        if (tributeB) {
           this.tribute = integer;
        }
        if (databaseScoreB) {
           this.databaseScore = integer;
        }
        if (javaScoreB) {
           this.javaScore = integer;
        }
        if (javascriptScoreB) {
           this.javascriptScore = integer;
        }
        if (jspScoreB) {
           this.jspScore = integer;
        }
     }
     
     // double 1개 타입 생성자 ( attendance )
     public Academy(double attendance) {
        this.attendance = attendance;
     }

     
     public String getName() {
        return name;
     }

     public void setName(String name) {
        this.name = name;
     }

     public String getBirth() {
        return birth;
     }

     public void setBirth(String birth) {
        this.birth = birth;
     }

     public String getTel() {
        return tel;
     }

     public void setTel(String tel) {
        this.tel = tel;
     }

     public String getAddress() {
        return address;
     }

     public void setAddress(String address) {
        this.address = address;
     }

     public String getMajor() {
        return major;
     }

     public void setMajor(String major) {
        this.major = major;
     }

     public int getTribute() {
        return tribute;
     }

     public void setTribute(int tribute) {
        this.tribute = tribute;
     }

     public int getDatabaseScore() {
        return databaseScore;
     }

     public void setDatabaseScore(int databaseScore) {
        if (databaseScore > 100 || databaseScore < 0) {
           JOptionPane.showMessageDialog(null, "점수는 0~100점까지만 입력가능합니다.", "ERROR_Score", 0);
        } else {
           this.databaseScore = databaseScore;
        }
     }
     public int getJavaScore() {
        return javaScore;
     }

     public void setJavaScore(int javaScore) {
        if (javaScore > 100 || javaScore < 0) {
           JOptionPane.showMessageDialog(null, "점수는 0~100점까지만 입력가능합니다.", "ERROR_Score", 0);
        } else {
           this.javaScore = javaScore;
        }
     }

     public int getJavascriptScore() {
        return javascriptScore;
     }

     public void setJavascriptScore(int javascriptScore) {
        if (javascriptScore > 100 || javascriptScore < 0) {
           JOptionPane.showMessageDialog(null, "점수는 0~100점까지만 입력가능합니다.", "ERROR_Score", 0);
        } else {
           this.javascriptScore = javascriptScore;            
        }
     }

     public int getJspScore() {
        return jspScore;
     }

     public void setJspScore(int jspScore) {
        if (jspScore > 100 || jspScore < 0) {
           JOptionPane.showMessageDialog(null, "점수는 0~100점까지만 입력가능합니다.", "ERROR_Score", 0);
        } else {
           this.jspScore = jspScore;
        }
     }

     public double getAttendance() {
        return attendance;
     }

     public void setAttendance(double attendance) {
        if (attendance > 100 || attendance < 0) {
           JOptionPane.showMessageDialog(null, "출석률은 0~100%까지만 입력가능합니다.", "ERROR_Attend", 0);
        } else {
           this.attendance = attendance;
        }
     }

     public String getSurvey() {
        return survey;
     }

     public void setSurvey(String survey) {
        this.survey = survey;
     }

      
}