class Solution {
public:
    int longestConsecutive(vector<int>& nums){
        unordered_set <int> Set(nums.begin(), nums.end());
        if (nums.empty()){
            return 0;
        }
        int lcs = 1;
        int ccs ;
        for(const int& num:Set){
            //if its start of subsequence
            if(Set.count(num-1)){
                continue;
            }
            ccs = 1; 
            int curr=num;
            while(Set.count(curr+1)){
                curr++;
                ccs++;
            }
            lcs=max(lcs,ccs);
        }
        
        return lcs;
    }
};
