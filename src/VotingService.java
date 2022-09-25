import java.util.HashMap;
import java.util.HashSet;

public class VotingService implements Voting{
    private String question;
    private HashMap<Character, String> answerSet;
    private HashSet<String> students;
    private HashMap<Character, Integer> statistic;

    public VotingService(AbstractQuestion question){
        setComponent(question);
    }

    @Override
    public void setComponent(AbstractQuestion q) {
        students = new HashSet<>();
        statistic = new HashMap<>();
        this.question = q.getQuestion();
        this.answerSet = q.getAnswer();

        answerSet.forEach((key, value)-> statistic.put(key, 0));
    }

    @Override
    public void startVoting(Student s, char answer) {
        String studentID = s.getID();
        if(!students.contains(studentID)){
            if(answerSet.containsKey(answer)){
                students.add(studentID);
                statistic.put(answer, statistic.get(answer) + 1);

            }else{
                System.out.println("Your answer is not in answer set");
            }

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
        answerSet.forEach((k,v)-> System.out.println(k + ". " + v));
    }

    @Override
    public void displayStatistics() {
        statistic.forEach((key, value)-> System.out.println("Key: " + key + "; Number: " + value));
    }
}
