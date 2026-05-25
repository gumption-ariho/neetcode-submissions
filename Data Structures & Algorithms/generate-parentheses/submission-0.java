class Solution {
    List<String> listy = new ArrayList<>();
    int w;
    public List<String> generateParenthesis(int n) {

        //l<=n, r<=n, r<=l
        /*
        N=2
        LEVEL 1:
          1,0,"(" 1a
          0,1,")" 1b
        LEVEL 2:
             2, 0, "(("  2a

             1, 1, "()"  2a
    
        LEVEL3:
            2, 1, "(()"  3a
            2,1, "()("    2b
        LEVEL 4:
        2, 2, "(())"  4a------------ADDED
        2,2, () () 4a---------------ADDED

        */
        w=n;
        recursiveCall(0,0,"");
        return listy;

    }

    void recursiveCall(int l, int r, String x){
        if(l>w||r>w||r>l){
            return;
        }
        if(l==w&&r==w){
            listy.add(x);
            return;
        }
        
        recursiveCall(l+1,r,x+"(");
        recursiveCall(l,r+1,x+")");

    }
}
