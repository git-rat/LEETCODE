class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<Integer>();
        for(int a: asteroids){
            if(a>0){
                s.push(a);
            }else{
                while( !s.isEmpty() && s.peek()>0 && s.peek()<-a){
                    s.pop();
                }
            }
            if(s.isEmpty()||s.peek()<0){
                s.push(a);
            }
            if(s.peek()==-a){
                s.pop();
            }

        }
        int[] r = new int[s.size()];
       // int i =s.size()-1;
        for(int i= s.size()-1;i>=0;i--){
            r[i] = s.pop();

        }
        return r;

    }
}