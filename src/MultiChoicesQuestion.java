import java.util.HashMap;

public class MultiChoicesQuestion extends AbstractQuestion{

    public MultiChoicesQuestion(String question, int numberOfAnswer){
        super(question);
        char selectionKey = 'A';

        //generate number of answer base on the input
        if(numberOfAnswer <= 26){
            for (int i = 0; i < numberOfAnswer; i++){
                super.setAnswer((char) (selectionKey + i), "");
            }
        }
    }
}
