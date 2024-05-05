// half paramid
public class stars{
    public static void main(String[]args){
        int n = 5;
        for (int i = 0;i <= n;i++){
            for(int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // half paramid in numbers(1)
        int rows = 5;
        for (int i = 0;i<= rows;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // half paramid in numbers(2)
        for (int i = 1;i <= rows;i++){
            for( int j = 1;j<= i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        //half paramid in alphbet
        for(int i = 1;i <= rows;i++){
            char ch = 'A';
            for(int j = 1;j <=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        
        //Half paramid in Alphabet 
        char ch = 'A';
        for(int i = 1;i <= rows;i++){
            for(int j = 1;j <=i;j++){
                System.out.print(ch+" ");
                
            }
            ch++;
            System.out.println();
        }
        
        //HALF paramid numbers (3)
        int rr = 4;
        int currentnumber = 1;
        for(int i = 1;i <= rr;i++){
            for(int j = 1;j<= i;j++){
                System.out.print(currentnumber+" ");
                currentnumber = (currentnumber % 9)+1;
            }    
            System.out.println();
        }   
        
        //half paramid in number (4)
        for(int i = 1;i<=rows;i++){
            int num = i;
            int step = rows - 1;
            for(int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num += step;
                step--;
           }
           System.out.println();
        }
        //half paramid in numbers (5)
        int current = 1;
        for (int i = 1;i<= rows;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(current+" ");
                current--;
            }
            current += (i+2);
            System.out.println();
        }
        //Half parmid in even&odd
        for(int i = 1;i<=rows;i++){
            int num = (i % 2==0)?2:1;
            for(int j = 1;j<=i;j++){
                System.out.print(num + " ");
                num += (i % 2 == 0)? 2:2; 
            }
            System.out.println();
        }
    }
}