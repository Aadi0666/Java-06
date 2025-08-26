public class Immutable {
    public static void main(String[] args) {
        String s = "hello";
        s = s + "bye";
        // System.out.println(s);
        // s=s.toLowercase();
        // s=s.toUppercase();
        // System.out.println(n);
        System.out.println(s.trim());
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        String s4 = s1.replace('a', 'p');
        System.out.println(s4);
    }
}