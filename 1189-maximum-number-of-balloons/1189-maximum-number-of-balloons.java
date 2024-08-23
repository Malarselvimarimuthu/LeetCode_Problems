class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++)
        {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }
        int cnt = 0;
        if(map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n'))
        {
            while((map.get('b')>=1 && map.get('a')>=1 && map.get('l')>=2 && map.get('o')>=2 && map.get('n')>=1))
            {
                cnt++;
                map.put('b',map.get('b')-1);
                map.put('a',map.get('a')-1);
                map.put('l',map.get('l')-2);
                map.put('o',map.get('o')-2);
                map.put('n',map.get('n')-1);
            }
        }
        return cnt;
    }
}