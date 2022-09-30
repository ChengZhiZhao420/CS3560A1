public class TrueOrFalseQuestion extends AbstractQuestion{
    public TrueOrFalseQuestion(String question) {
        super(question);

        String answer = "True";
        for(int i = 0; i < 2; i++){

            if(i == 1){
                answer = "False";
            }
            super.setAnswer('1', answer);
        }
    }
}
