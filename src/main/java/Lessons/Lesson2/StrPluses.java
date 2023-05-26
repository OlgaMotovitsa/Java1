package lessons.Lesson2;

public class StrPluses {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        //System.out.println(sb);

    }
}