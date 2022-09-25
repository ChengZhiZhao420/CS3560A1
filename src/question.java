import java.util.HashMap;

interface question {
    void setQuestion(String a);
    void setAnswer(char s, String a);
    String getQuestion();
    HashMap<Character, String> getAnswer();

}
