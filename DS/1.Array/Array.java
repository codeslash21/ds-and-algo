// different methods to create an array in java

class Array {
  // declare an 1D array of type int
  int[] arr1;
  // allocating memory for the declared array
  arr1 = new int[5];
  // assigning values to the array
  for(int i=0;i<5;i++)
    arr1[i]=i;

  // declare and allocate memory for an array of type char
  char[] arr2 = new char[5];

  // declare and initialise an integer array
  int[] arr3 = new int[] {1,2,3,4,5};

  // declare and initialise 2D integer array
  int[][] arr4 = new int[][] {{1,2,3}, {4,5,6}};
}
