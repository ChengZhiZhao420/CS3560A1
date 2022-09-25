import java.util.HashMap;
import java.util.HashSet;

public class VotingService implements Voting{
    private String question;
    private HashMap<Character, String> answerSet;
    private HashSet<String> students;
    private HashMap<Character, Integer> statistic;

    public VotingService(AbstractQuestion question){
        students = new HashSet<>();
        statistic = new HashMap<>();
        setComponent(question);
    }

    @Override
    public void setComponent(AbstractQuestion q) {
        this.question = q.getQuestion();
        this.answerSet = q.getAnswer();
    }

    @Override
    public void startVoting(Student s, char answer) {
        String studentID = s.getID();
        if(!students.contains(studentID)){
            students.add(studentID);
        }else{
            System.out.println("You already answered");
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
    }

    @Override
    public void displayAnswer() {
        answerSet.forEach((k,v)->{
            System.out.println(k + ". " + v);
        });
    }

    @Override
    public void displayStatistics() {

    }
}
