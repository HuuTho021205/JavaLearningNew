package Ngay8_Exception.LamQuenException;

public class TestCustomException {
    public static void  checkAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Lỗi: Tuổi không hợp lệ");
        }
        else {
            System.out.println("Tuổi hợp lệ");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
