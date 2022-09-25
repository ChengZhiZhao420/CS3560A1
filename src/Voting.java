public interface Voting {
    public void setComponent(AbstractQuestion q);
    public void startVoting(Student s, char answer);
    public void displayQuestion();
    public void displayAnswer();
    public void displayStatistics();

}
