public class main {
    public static void main(String[] args) {
        AbstractQuestion question = new MultiChoicesQuestion("1233", '1', "231");

        System.out.println(question.getQuestion());
    }
}
