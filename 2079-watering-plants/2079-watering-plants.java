class Solution {
    public int wateringPlants(int[] plants, int capacity) 
    {
        int steps = 0;
        int c = capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=c)
            {
                c = c-plants[i];
                steps +=1;
            }    
            else
            {
                steps+= (2*i)+1;
                c = capacity;
                c = c-plants[i];
            }    
        }
        return steps;
    }
}