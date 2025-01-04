public class StringBuilderExample{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        

        sb.append(" Programming");
        sb.insert(5, "Fun ");
        sb.replace(0, 4, "Python");
        sb.delete(10, 14);
        sb.reverse();

        System.out.println(sb.toString());

    }
}