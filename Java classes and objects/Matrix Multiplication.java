package com.jmrchelani; 

 

       import java.util.Arrays; 

       import java.util.Scanner; 

 

class SW27{ 

   public static void main(String[] args) { 

       Scanner ez = new Scanner(System.in); 

       int w, q; 

       System.out.println("Enter no of row of a matrix: "); 

       w = ez.nextInt(); 

       System.out.println("Enter no of col of a matrix: "); 

       q = ez.nextInt(); 

       Matrix a = new Matrix(w, q); 

       System.out.println("Enter no of row of b matrix: "); 

       w = ez.nextInt(); 

       System.out.println("Enter no of col of b matrix: "); 

       q = ez.nextInt(); 

       Matrix b = new Matrix(w, q); 

       System.out.println("Enter for a matrix: "); 

       a.getValues(); 

       System.out.println("Enter for b matrix: "); 

       b.getValues(); 

       Matrix c = a.multiply(b); 

       c.display(); 

   } 

} 

 

class Matrix{ 

   int x, y; 

   int[][] no; 

   Scanner ez = new Scanner(System.in); 

   public Matrix(){ 

       this.x = 0; 

       this.y = 0; 

       no = new int[this.x][this.y]; 

   } 

   public Matrix(int x, int y){ 

       this.x = x; 

       this.y = y; 

       no = new int[this.x][this.y]; 

   } 

   public void getValues(){ 

       for (int i = 0; i < this.x; i++){ 

           for (int j = 0; j < this.y; j++){ 

               System.out.println("Enter ["+i+","+j+"] no:"); 

               no[i][j] = ez.nextInt(); 

           } 

       } 

   } 

   public static void setIn(Matrix z, int a, int b, int c){ 

       z.no[a][b] = c; 

   } 

   public Matrix multiply(Matrix an){ 

       Matrix co = new Matrix(this.x, an.y); 

       if(this.y != an.x){ 

           System.out.println("Can't multiply"); 

       } 

       else { 

           for (int a = 0; a < this.x; a++) { 

               for (int b = 0; b < an.y; b++) { 

                   int sum = 0; 

                   for (int c = 0; c < an.x; c++) { 

                       sum += this.no[a][c] * an.no[c][b]; 

                   } 

                   Matrix.setIn(co, a, b, sum); 

               } 

           } 

       } 

       return co; 

   } 

   public void display(){ 

       for (int i = 0; i < this.x; i++){ 

           for (int j = 0; j < this.y; j++){ 

               System.out.print(this.no[i][j]+" "); 

           } 

           System.out.println(""); 

       } 

   } 

} 