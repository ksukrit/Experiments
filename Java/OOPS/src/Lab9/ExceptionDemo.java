package Lab9;

public class ExceptionDemo {
    public static void main(String[] args) {
        for(String arg : args){
            if(arg.equals("NO")){
                try{
                    throw new InvalidArgumentException();
                } catch (InvalidArgumentException e) {
                    System.out.println(e);
                }
            }else{
                System.out.println("Argument " + arg + " Is valid");
            }
        }
    }
}
