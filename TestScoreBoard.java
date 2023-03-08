import java.util.Arrays;
public class TestScoreBoard {
    public static void main(String[] args) {
        ScoreBoard scoreBoard=new ScoreBoard(3);
        GameEntry e1=new GameEntry("A",90);
        GameEntry e2=new GameEntry("B",100);
        GameEntry e3=new GameEntry("C",95);
        GameEntry e4=new GameEntry("D",123);
        GameEntry e5=new GameEntry("E",223);

        scoreBoard.add(e1);
        scoreBoard.add(e2);
        scoreBoard.add(e3);
        scoreBoard.add(e4);
        System.out.println(Arrays.toString(scoreBoard.getBoard()));
        System.out.println(scoreBoard.remove(0)+"removed successfully");
        System.out.println(Arrays.toString(scoreBoard.getBoard()));
        scoreBoard.add(e5);
        System.out.println(Arrays.toString(scoreBoard.getBoard()));

    }
}
