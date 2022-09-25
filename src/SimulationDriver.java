import java.util.*;

public class SimulationDriver {

    public static void main(String[] args) {
        List<Student> studentList = studentGenerator(5);
        HashMap<Character, String> answerSet = answerSetGenerator(false);
        AbstractQuestion question = new MultiChoicesQuestion("What is your favorite city?", answerSet);
        VotingService vs = new VotingService(question);
        List<Character> keysAsArray = new ArrayList<>(answerSet.keySet());
        Random r = new Random();

        studentList.forEach((student -> vs.startVoting(student, keysAsArray.get(r.nextInt(keysAsArray.size())))));
        vs.displayStatistics();
    }

    public static List<Student> studentGenerator(int numberOfStudent){
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < numberOfStudent; i++){
            UUID uniqueKey = UUID.randomUUID();
            result.add(new Student(uniqueKey.toString()));
        }

        return result;
    }

    public static HashMap<Character, String> answerSetGenerator(Boolean type){
        HashMap<Character, String> result = new HashMap<>();

        if(type){
            result.put('1', "True");
            result.put('2', "False");
        }else{
            result.put('A', "Los Angeles");
            result.put('B', "Madison");
            result.put('C', "San Francisco");
            result.put('D', "New York");
        }
        return result;
    }
}
