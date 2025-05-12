public class Pattern {
        public static void main(String[] args) {
            for(int i=0;i<4;i++){
                for(int j=0;j<=4;j++){
                    System.out.print("*");
                }
                System.out.println();

            }
           // pattern2();
        }

        public static void pattern2(){
            for(int i=1;i<5;i++){
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
