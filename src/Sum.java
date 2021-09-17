public class Sum {
    private int a; 
    private int b;
    private int c;
    Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int nhan() { 
        return a*b;
    }
    int tong() {
        return a+b;
    }
    Sum(int a, int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int tongba(){
        return tong() + c;
    }
    int nhanba(){
        return a*b*c;
    }
    int binhphuong(){
        return a*a +b*b;
    }
}
