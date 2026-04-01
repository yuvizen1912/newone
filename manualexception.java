class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
            super(msg);
    }
}


public class manualexception {
    static void  checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is lesser than 18");
        }
        else{
            System.out.println("Eligable to Vote");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(10);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
