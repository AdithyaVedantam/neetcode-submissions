class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int N = 9;
        vector<unordered_set<char>> row(N);
        vector<unordered_set<char>> coln(N);
        vector<unordered_set<char>> box(N);
        
        for(int r = 0; r<N; r++){
            for(int c = 0; c<N; c++){
                char val = board[r][c];
                if(val=='.'){
                    continue;
                }
                if(row[r].count(val)){
                    return false;
                }
                row[r].insert(val);

                if(coln[c].count(val)){
                    return false;
                }
                coln[c].insert(val);
                int idx = (r / 3) * 3 + (c / 3);
                if(box[idx].count(val)){
                    return false;
                }
                box[idx].insert(val);
            }

        }
        return true;



        
        
    }
};
