class Main {
    public static void main(String[] args) {
     
      // create an array
      int[] age = {12, 4, 5, 2, 5};
      String[] strAr = {"Ani", "Sam", "Joe"};  
      Object StrAr;
      for (int i=0; i<strAr.length; i++){
        System.out.println(strAr[i]);
      }
      for ( String str: strAr){
        System.out.println(str);
      }  
   
      // access each array elements
      System.out.println("Accessing Elements of Array:");
      System.out.println("First Element: " + age[0]);
      System.out.println("Second Element: " + age[1]);
      System.out.println("Third Element: " + age[2]);
      System.out.println("Fourth Element: " + age[3]);
      System.out.println("Fifth Element: " + age[4]);
      System.out.println("name 1="+ strAr[0]);
      System.out.println("name 2="+ strAr[1]);
      System.out.println("name 3="+ strAr[2]);
    }
   }