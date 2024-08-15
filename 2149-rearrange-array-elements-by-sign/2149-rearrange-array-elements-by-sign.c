/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* nums, int numsSize, int* returnSize) 
{
    int *res;
    res = (int*)malloc (numsSize * sizeof(int));
    int x = 0;
    int y = 1;
    *returnSize = numsSize;
    for(int i=0; i<numsSize; i++)
    {
        if(nums[i]>0)
        {
            res[x] = nums[i];
            x = x+2;
        }
        else
        {
            res[y] = nums[i];
            y = y+2;
        }
    } 
    return res;
}