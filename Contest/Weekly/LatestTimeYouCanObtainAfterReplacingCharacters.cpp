class Solution {
public:
    string findLatestTime(string s) {
        string res = "";
        if(s[0] == '?'){
            if(s[1] == '1' or s[1] == '0' or s[1] =='?')
            res += '1';
            else res += '0';
        }
        else{
            res += s[0];
        }
        if(s[1] == '?'){
            if(res[0] == '1') res += '1';
            else res += '9';
        }
        else{
            res += s[1];
        }
        if(s[3] == '?'){
            res += ':';
            res += '5';
        }
        else{
            res += ':';
            res += s[3];
        }
        if(s[4] == '?'){
            res += '9';
        }
        else{
            res += s[4];
        }
        return res;

    }
};
