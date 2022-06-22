public class Day11WhileLoop01 {

    public static void main(String[] args) {

        // Type code print the integers divisible by 4 and 6 from 13 to 211
        // 1 way: by using for-loop
        for (int i=13; i<211  ;i++    ) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("==============");
          // 2 second way by using while-loop

            int i=13;// starting point
            while (i<211){// end point

                if(i%4==0 && i%6==0){
                    System.out.println(i +" ");
                }
                i++;// artim miktari
            }
        System.out.println();

        //Type code to print integers from 3 to 5 by using while loop
        int k=3;
        while(k<6){
            System.out.print(k + " ");
            k++;
        }

        int m = 10;

        int n = 2;

        int sum = 0;



        while(m > n) {

            m--;

            n = n + 2;

            sum = sum + m + n;

        }

        System.out.println(sum);
        }
        }






