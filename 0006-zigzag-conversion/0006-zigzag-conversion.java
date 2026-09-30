class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
            return s;
        
        StringBuilder sb[] = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++)
            sb[i] = new StringBuilder();

        int row = 0;
        int dir = 1;

        for(char ch : s.toCharArray()){
            sb[row].append(ch);
            if(row == 0)
                dir = 1;
            else if(row == numRows-1)
                dir = -1;
            
            row += dir;
        }

        StringBuilder res = new StringBuilder();

        for(StringBuilder a : sb)
            res.append(a);

        return res.toString();
    }
}