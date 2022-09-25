import java.util.HashMap;

public class MultiChoicesQuestion extends AbstractQuestion{

    public MultiChoicesQuestion(String question, char selection, String answer) {
        super(question, selection, answer);
    }

    public MultiChoicesQuestion(String question, HashMap<Character, String> answerSet){
        super(question, answerSet);
    }
}
