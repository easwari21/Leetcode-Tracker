// Last updated: 8/19/2026, 10:38:23 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-k;
        while(l<r)
        {
            int mid=(r+l)/2;
             if(x-arr[mid]>arr[mid+k]-x)
                l=mid+1;
            else 
                r=mid;
        }
    List<Integer> result = new ArrayList<>(k);
		for (int i = l; i < l+k; i++) {
			result.add(arr[i]);
		}
		return result;
}
}