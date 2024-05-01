class Solution {
    public int hIndex(int[] citations) {
        int hindex=0;
        int n=citations.length;
        Arrays.sort(citations);
        int[] harray=new int[citations[n-1]+1];

        for(int i=0;i<n;i++){
            int c=citations[i];
            int j=0;
            while(j<=c){
                harray[j]++;
                j++;
            }
        }

        for(int i=0;i<harray.length;i++){
            if(i>harray[i]) break;
            else hindex=i;
        }

        return hindex;
    }
}