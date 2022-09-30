import java.util.*;

public class SimulationDriver {

    public static void main(String[] args) {
        List<Student> studentList = studentGenerator(5);
        AbstractQuestion question = new MultiChoicesQuestion("What is your favorite city?", 10);
        VotingService vs = new VotingService(question);
        List<Character> keysAsArray = new ArrayList<>(question.getAnswer().keySet());
        Random r = new Random();

        //for each student will randomly pick one answer
        studentList.forEach((student -> vs.startVoting(student, keysAsArray.get(r.nextInt(keysAsArray.size())))));

        //see the statistics of the answer
        vs.displayStatistics();
    }

    //student object generator, each time of the loop will generate a unique id to create a new student object and added into the list
    public static List<Student> studentGenerator(int numberOfStudent){
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < numberOfStudent; i++){
            UUID uniqueKey = UUID.randomUUID();
            result.add(new Student(uniqueKey.toString()));
        }

        return result;
    }

}
