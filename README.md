# quiz-5-corrections
Consider the following partially implemented class.

#2

public class Quiz {

    private static int id = 1;
    private int questionCount;

    public Quiz(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getId() {
        return id;
    }

    public void incrementId() {
        id++;
    }

    public int getQuestionCount() {
        return questionCount;
    }
}
Now, consider the following usage of the aforementioned class.

Quiz q1 = new Quiz(10);
Quiz q2 = new Quiz(15);
q2.incrementId();

System.out.println(q1.getId());
System.out.println(q2.getId());
System.out.println(q1.getQuestionCount());
System.out.println(q2.getQuestionCount());

What will be printed to the console?


Correct Answer:   
2
2
10
15

Why this answer is correct: 
