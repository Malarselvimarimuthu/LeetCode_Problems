class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String str = "";
        for(int i=0;i<version1.length();i++)
        {
            char ch = version1.charAt(i);
            if(Character.isDigit(ch)){
                str = str + ch;
            }
            if(ch == '.')
            {
                list1.add(Integer.parseInt(str));
                str = "";
            }
        }
        list1.add(Integer.parseInt(str));
        str = "";
        for(int i=0;i<version2.length();i++)
        {
            char ch = version2.charAt(i);
            if(Character.isDigit(ch)){
                str = str + ch;
            }
            if(ch == '.')
            {
                list2.add(Integer.parseInt(str));
                str = "";
            }
        }
        list2.add(Integer.parseInt(str));
        int n = list1.size();

        if(list1.size()>list2.size())
        {
            n = list1.size();
            while(list2.size() <= list1.size())
            {
                list2.add(0);
            }
        }
        else if(list1.size()<list2.size())
        {
            n = list2.size();
            while(list2.size() >= list1.size())
            {
                list1.add(0);
            }
        }
        int cs = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(list1.get(i)<list2.get(i))
            {
                cs = -1;
            }
            else if(list1.get(i)>list2.get(i))
            {
                cs = 1;
            }
        }
        return cs ;
    }
}