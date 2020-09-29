public class Question {
    private String text;
    private String answer;


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void displayQuestion(){
        System.out.println("this is a question");
    }

    public boolean checkAns(String answer){
        return answer.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
