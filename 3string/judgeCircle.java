class judgeCircle {
   public static boolean  judgeCircle(String moves) {
        int x =0;
        int y=0;
       
      for (int i =0 ; i<moves.length(); i++){
        char direction = moves.charAt(i);
        if(direction == 'U'){
              x++;
        }
        else if(direction == 'D') {
             x--;
        }
        else if(direction == 'R'){
            y++;
        }
        else{
            y--;
        }
      }
      if(x==0 && y==0)
      {
        return true;
      }return false;
    }
   
    public static void main(String[] args) {
     String moves ="UDUDRLRLRRLLUUUUDDDD";
     System.out.println(judgeCircle(moves));
    

}
}