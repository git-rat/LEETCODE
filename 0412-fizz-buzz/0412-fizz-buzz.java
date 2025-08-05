class Solution {
    //gc - eucledian 
        int gcd(int a, int b){
            while(b >=0){
                //int temp = b;
                int r = a% b;
                if (r==0){
                    return b;
                }else{
                    a = b;
                    b = r;
                }
            }
            return 0;
        }
        public static List<String> getNames() {
        return new ArrayList<>();  
    }
    public List<String> fizzBuzz(int n) {
        int lcm = 15;
        List<String> names = getNames();
        for(int i=1;i<n+1;i++){
            if(i % 15 == 0){
                names.add(i-1,"FizzBuzz");
            }else if(i% 3==0 || i%5 == 0){
                if(i%3==0){
                    names.add(i-1,"Fizz");
                }else{
                    names.add(i-1,"Buzz");
                }
            }else{
                names.add(i-1, String.valueOf(i));
            }
        }




        
        
        return names; 
    }
}