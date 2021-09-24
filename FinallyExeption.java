public class FinallyExeption {
            public void test() {
                try {
                    int data = 200 / 25;
                    System.out.println(data);
    
                } 
                catch (NullPointerException e) {
                    System.out.println("this is wrong");
                } 
                finally {
                    System.out.println("finally  is always occur");
                }
    
                System.out.println("rest code");
            }
        public static void main(String args[]) {

            FinallyExeption exc = new FinallyExeption();
            exc.test();s cfdjyg fv
        }
    
}