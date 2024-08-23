package co.lambdas.Demo;

    //functional interface
    interface Test{  
        public void testmethod();  
       // public void test1();
    }  
    
    
    
    public class LambdaExpressionExample3
       {  
    public static void main(String[] args) {  
      Test   s=()->{  
            System.out.println("This is a sample notation for lambda"); 
        };  
        
        //method call
        s.testmethod();
    }  
  }  

