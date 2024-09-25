class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int rlen = ransomNote.length();
        int mlen = magazine.length();
        int cnt[] = new int[26];
        if(mlen>=rlen)
        {
            for(int i=0;i<mlen;i++)
            {
                cnt[magazine.charAt(i)-'a']++;
            }
            for(int i=0;i<rlen;i++)
            {
                if(cnt[ransomNote.charAt(i) - 'a']==0)
                    return false;
                cnt[ransomNote.charAt(i)-'a']--;
            }
            // int tot = mlen-rlen;
            // int cnt1 = 0;
            // for(int i=0;i<26;i++)
            // {
            //     if(cnt[i]>0)
            //         cnt1+=cnt[i];
            // }
            // if(cnt1==tot)
            //     return true;
        }
        
        return false;
    }
}