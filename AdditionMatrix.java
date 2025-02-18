class AdditionMatrix {
    public static void main(String args[]) {
        
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];  

        
        a[0][0] = 10; a[0][1] = 20; a[0][2] = 70;
        a[1][0] = 50; a[1][1] = 40; a[1][2] = 29;
        a[2][0] = 25; a[2][1] = 36; a[2][2] = 78;
    
        b[0][0] = 5; b[0][1] = 15; b[0][2] = 30;
        b[1][0] = 15; b[1][1] = 10; b[1][2] = 19;
        b[2][0] = 20; b[2][1] = 10; b[2][2] = 18;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

     
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();  
        }
    }
}

