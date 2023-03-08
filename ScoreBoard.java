public class ScoreBoard {
   private int numOfEntries=0;
   private GameEntry [] board;
   public ScoreBoard(int capacity)
   {
      board=new GameEntry[capacity];
   }
   public GameEntry[] getBoard()
   {
      return board;
   }
   public void add(GameEntry e)
   {
      int newScore=e.getScore();
      if(numOfEntries<board.length||newScore>board[numOfEntries-1].getScore())
      {
         if(numOfEntries<board.length)
            numOfEntries++;
            int j=numOfEntries-1;
            while(j>0&&newScore>board[j-1].getScore())
            {
               board[j]=board[j-1];
               j--;
            }
         board[j]=e;
      }
   }
   public GameEntry remove(int index)
   {
      if(index<0||index>numOfEntries)
         throw  new ArrayIndexOutOfBoundsException("invalid index :"+index);
      GameEntry deleted=board[index];
      for (int i = index; i <numOfEntries-1 ; i++) {
         board[i]=board[i+1];
      }
      board[numOfEntries-1]=null;
      numOfEntries--;
      return deleted;
   }
}
