package main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentScore {
    public static boolean checkFail( int v) {
        if (v == -1) return true;
        else return false;
    }

    public static String getScore(double s, int v) {
        if (v < -1 | v > 3 | s < 0 | s > 10) return "Không xác định";
        else if (checkFail(v)) return "Nhận điểm F";
        else if (s < 4) return "Nhận điểm F";
        else if (s < 5.5) return "Nhận điểm D";
        else if (s < 7) return "Nhận điểm C";
        else if (s < 8.5) return "Nhận điểm B";
        else return "Nhận điểm A";
    }
}