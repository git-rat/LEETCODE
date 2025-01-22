class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
    int   a = nums1.length;
     int  b = nums2.length;
      int x1 =0, x2 =0;
      if(a%2 == 1){
        for(int i : nums2){
            x1 = x1 ^ i ;
        }
      }

       if(b%2 == 1){
        for(int i : nums1){
            x2 = x2 ^ i ;
        }
      }

      return x1 ^ x2;
    }
}

/*
// hi diii

// read the qn kk va?
// reply!
// mm d
// kk , i am reading now , lets talk after i find solution
// ok d

learn about biwise operation in java with chatgpt , i am going to now 
ok d  

hwy what doing  i am looking at sokution , if u like , u do too 
concept pathutu irukan  hm kk , cool ok d
purujuthaa d
code explanation paathutu iruka , most purunchu , one doubt matum paakanum

nee concept paathutaya ?
mm d , kk solution na matum chatgpt la kuduthu explain pana solu , naa paathutu unaku solra ipa kk va
code uh purujuthu d - oh kk , what happens when num1 and num2 both even paathaya?

when both even
ans is 0
oh , na atha matum paathutu vara 
ok d
hm , nee vena un account la own na potu paaru with logic u know
ok d


"class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor1 = 0 , xor2 = 0;

        if(m%2==1)
            for(int i: nums1)
                xor1 = xor1 ^ i;
        if(n%2==1)
            for(int i: nums2)
                xor2 = xor2 ^ i;
        return xor1 ^ xor2;
    }
}"    - this one 


https:
  - use this book , refer the time complexity section kk va 
after finishing the code 
na code submit panita d
this book read by every IIT ians in their 1st yr ,placement mam said
ok d
na thuga pogata d
hm seri , tmr enthiruchu panu 
gn
na code submit panita d
hm kk good
unaku purujurucha? ss , na inoru ithe maara qn paathutu iruntha
 inime than code podanum
 ok d na thuga pora gn 
 hm gn

 */  