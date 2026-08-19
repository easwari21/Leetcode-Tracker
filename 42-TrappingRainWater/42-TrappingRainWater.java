// Last updated: 8/19/2026, 10:41:36 AM
class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int lmax=0;
        int rmax=0;
        for(int i=0;i<n;i++)
        {
        if(lmax<a[i])
        {
            lmax=a[i];
            left[i]=lmax;
        }
        else
        left[i]=lmax;
        }
         for(int i=n-1;i>=0;i--)
         {
            if(rmax<a[i])
            {
                rmax=a[i];
                right[i]=rmax;
            }
            else
            right[i]=rmax;
         }
         int total=0;
         for(int i=0;i<n;i++)
         {
            int min=left[i]<right[i]?left[i]:right[i];
            total=total+(min-a[i]);
         }
         return total;
    }
}