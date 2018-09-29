public class FibonacciMain{

public void run(String[] args){

for(int i = 0; i < args.length; i++){
    int value = Integer.valueOf(args[i]);
      if(args.length == 0){
        throw new RequiredValueMissingException();
      }
    perform(args);
    }
  }
  public void perform(String[] args){

for(int i = 0; i < args.length; i++){
    int value = Integer.valueOf(args[i]);
  }

}

public static void main(String[] args){

FibonacciMain main = new FibonacciMain();
main.run(args);

    }



}
