package calc;

 class Calculator {

    void sum(int a,int b){
        System.out.println("add = "+(a+b));
    }
    void divide(int a,int b){
        System.out.println("Divide = "+(a/b));
    }
    void modulus(int a,int b){
        System.out.println("Modulo = "+(a%b));
    }
    void mutiply(int a,int b){
        System.out.println("Multiplication ="+(a*b));
    }
    void subtraction(int a,int b){
        System.out.println("Subtract = "+(a-b));
    }
}

class Scientific_Calculator extends Calculator{

        void Trigonometry(int a,int b){
            System.out.println("Your result is " + Math.sin(a+b));
            System.out.println("Your result is " + Math.cos(a+b));
            System.out.println("Your result is " + Math.tan(a+b));
            
        }
  }

  class Hybrid_Calculator extends Scientific_Calculator{

     void bothValues(int a,int b){
        System.out.println("Your result is " + Math.sin(a+b));
        System.out.println("Sum "+(a+b));
     }
  }

  public class PackageQuestion{

    public static void main(String[] args) {
        
        Scientific_Calculator sc=new Scientific_Calculator(); 
        sc.sum(90,90);
    }
}
