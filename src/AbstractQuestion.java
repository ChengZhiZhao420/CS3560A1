import java.util.HashMap;

public abstract class AbstractQuestion implements question {

    private String question = "";
    private HashMap<Character, String> answer = new HashMap<>();

    public AbstractQuestion(String question){
        setQuestion(question);
    }

    /*
        set question base on the input
     */
    @Override
    public void setQuestion(String question){
        this.question = question;
    }

    /*
       set answer base on the input
    */
    @Override
    public void setAnswer(char selection, String answer){
        this.answer.put(selection, answer);
    }

    /*
       get question
    */
    @Override
    public String getQuestion() {
        return question;
    }

    /*
       get answer
    */
    @Override
    public HashMap<Character, String> getAnswer() {
        return answer;
    }
}
