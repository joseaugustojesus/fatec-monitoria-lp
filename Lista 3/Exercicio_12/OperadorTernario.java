class OperadorTernario{
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        System.out.println(a < b ? "\"a\" é maior do que \"b\"":"\"b\" é maior do que \"a\"");
    }
}