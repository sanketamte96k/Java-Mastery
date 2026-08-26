package string;

public class StringBuilderBasic {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");

        sb.reverse();
        sb.append(" ");
        sb.insert(5,"Programming");

        System.out.println(sb);
    }
}
