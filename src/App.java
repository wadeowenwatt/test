
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("haha");
        int a = 1;
        int b = 2;
        int c = 3;
        double length = 5.0;
        double width = 3.3;
        System.out.println(a + b);
        Sum test = new Sum(a, b);
        Sum test1 = new Sum(a, b, c);
        Sum test2 = new Sum(length, width);
        System.out.println(test.tong());
        System.out.println(test1.tongba());
        System.out.println(test.nhan());
        System.out.println(test1.nhanba());
        System.out.println(test1.binhphuong());
        System.out.println(test2.Area());
        System.out.println(test2.Perimeter());
    }
}
