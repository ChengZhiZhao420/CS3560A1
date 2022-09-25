import java.util.HashMap;

public abstract class AbstractQuestion implements question {

    private String question = "";
    private HashMap<Character, String> answer = new HashMap<>();

    public AbstractQuestion(String question, char selection, String answer){
        setQuestion(question);
        setAnswer(selection, answer);
    }
    @Override
    public void setQuestion(String question){
        this.question = question;
    }
    @Override
    public void setAnswer(char selection, String answer){
        this.answer.put(selection, answer);
    }
    @Override
    public String getQuestion() {
        return question;
    }
    @Override
    public HashMap<Character, String> getAnswer() {
        return answer;
    }
}
