class Testarray {  
    public static void main(String args[]) {  
        int a[][] = new int[3][3];  
        a[0][0] = 10;  
        a[0][1] = 20;  
        a[0][2] = 70;  
        a[1][0] = 50;  
        a[1][1] = 40;  
        a[1][2] = 29;  
        a[2][0] = 25;  
        a[2][1] = 36;  
        a[2][2] = 78;  

       
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {  
                System.out.print(a[i][j] + " ");  
            }  
            System.out.println(); 
        }  
    }  
}

