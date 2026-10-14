import java.util.*;

public class test {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("aaaab");
        sb.append(4);
        System.out.println(sb);
        sb.append("kjhg");

        System.out.println(sb.indexOf("kjhg"));

        sb.reverse();
        System.out.println(sb);

        sb.appendCodePoint(0x1F600);
        System.out.println(sb);
        System.out.println(0x1F600);
    }
}
