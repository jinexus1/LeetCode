// //BruteForce Solution
// class Solution {
//     public double myPow(double x, int n) {
//         double ans=1.0;
//         long temp_n=n;
//         if(n<0) n=-1*n;
//         while(n!=0){
//             if(n%2==0){//when n is even
//                 x=x*x;
//                 n=n/2;
//             }
//             else{
//                 ans=ans*x;
//                 n=n-1;
//             }
//         }
//         if(temp_n<0) ans=(double)1.0/(double)ans;
//         return ans;
//     }
// }

//Optimized Solution: log n
class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long n_temp = n;
        if(n_temp<0){
            n_temp *= -1;
        }
        while(n_temp>0){
            if(n_temp%2==0){//when n is even
                x = x*x;
                n_temp = n_temp/2;
            }else{
                ans = ans * x;
                n_temp--;
            }
        }
        if(n<0){
            return (double) 1/ans;
        }
        return ans;
    }
}
/*Intuition
E.g: 2^10=(2*2)^5=4^5
4^5=4*4^4
4^4=16^2=(16*16)^1=256
4^5=4*(__)<---------|
465=4*256
.
.
*/
