import java.util.Comparator;

public class Students extends Human implements Comparable {
    private double score;

    public Students() {
    }

    public Students(String name, int age) {
        super(name, age);
    }

    public Students(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{ " +super.toString()+
                " score=" + score +
                '}';
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        double compareScore = ((Students) o).getScore();
        return (int) (this.score - compareScore);
    }

//    @Override
//    public int compare(Students o1, Students o2) {
//        double score = o1.getScore()- o2.getScore();
//        return (int) score;
//    }
}
