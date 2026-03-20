public class Main{
  public void main(String[] args){

    String senha = "zor";

    for(int a='a'; a <='z'; a++){
      for(int b='b'; b<='z'; b++){
        for(int c='c'; c<='z'; c++){

          String tentativa = "" + (char)a + "" + (char)b + "" + (char)c;

          if( tentativa.equals(senha)){
            System.out.println("Senha correta: " + tentativa);
            return;

          }
        }
      }


    }
  }
}