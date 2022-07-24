import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
      float width;
      float height;
        Scanner scanner = new Scanner(System.in);
        //khai báo đối tưởng Scanner để thực hiện các chức năng nhập liệu trong JAVA CORE
        System.out.println("Enter width:");
        width = scanner.nextFloat();
        System.out.println("Enter height:");
        height = scanner.nextFloat();
        float area = width * height ;
        System.out.println("area = :"+area);
    }
}