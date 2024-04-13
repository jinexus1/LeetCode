class Solution {
  public int mySqrt(int x) {
      int high=x;
      int low=0;
      int mid=0;
      if(x==0||x==1)
      return x;
      while(low<=high){
          mid=(high+low)/2;
          if((long)mid*mid==x||((long)mid*mid<x &&(long)(mid+1)*(long)(mid+1)>x)){
              return mid;
          }
          else if((long)mid*mid>x){
              high=mid;
          }
          else if((long)mid*mid<x){
              low=mid;
          }
      }
      return mid;
  }
}