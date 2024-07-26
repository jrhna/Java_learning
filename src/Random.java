import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static void main(String[] args) {
        usingMathClass();
        usingRandomClass();
        usingThreadLocalClass();
    }

    static void usingMathClass() {
        //tạo ra một số thập phân có giá trị lớn hơn hoặc bằng 0.0 và bé hơn 1.0(0.99999)
        //Ở đây chúng ta xét trong phạm vi số nguyên từ 1 đến 100 nên để thay đổi từ phạm vi [0,1) thành [1,100]
        // thì giá trị thập phân trả về bên trên cần nhân với 100 và cộng thêm 1
        // rồi ép kiểu(cast) về kiểu int như sau:
        double random = Math.random();
        random = random * 10 + 1;
        System.out.println("using math class: " + (int) random);
    }

    static void usingRandomClass() {
        //sinh số ngẫu nhiên trong phạm vi từ 0 đến một giá trị cho trước.
        //Giá trị của số ngẫu nhiên lớn hơn hoặc bằng 0 và nhỏ hơn tham số truyền vào.
        //Để có được phạm vi [1,100] thì tham số truyền vào là 100 và giá trị trả về của phương thức cộng thêm 1:
        java.util.Random rand = new java.util.Random();
        int ranNum = rand.nextInt(2) + 1;
        System.out.println("Random: " + ranNum);
    }
    static void usingThreadLocalClass(){
        //Lớp ThreadLocalRandom cung cấp phương thức nextInt() với hai tham số truyền vào là giá trị biên dưới
        // và giá trị biên trên, giá trị trả về sẽ lớn hơn hoặc bằng biên dưới và bé hơn giá trị biên trên.
        //Do dó để có phạm vi sinh số ngẫu nhiên [1, 100] thì hai tham số truyền vào sẽ là 1 và 101.
        int randdom = ThreadLocalRandom.current().nextInt(1,3); // tạo random từ 1 đến 2
        System.out.println("Thread local random: " + randdom);
        boolean randBoolean = ThreadLocalRandom.current().nextBoolean();
        System.out.println("boolean: " + randBoolean);

    }
}
