package IllegalTriangleException;

public class IllegalTriangleException {
        public void triangle(int a,int b,int c){
            try {
                if (a<0||b<0||c<0){
                    throw new ArithmeticException("giá trị nhập vào là số âm ");
                }
                if (a+b<=c || a+c<=b || b+c <=a){
                    throw new ArithmeticException(" tổng 2 không lớn hơn 1 cạnh ");
                }
                System.out.println(" a = "+a+"\t b = "+b+"\t c = " +c);
            }catch (ArithmeticException e){
                System.out.println("xảy ra ngoại lệ : "+e.getMessage());
            }
        }
}
