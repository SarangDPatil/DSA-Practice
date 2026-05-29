public class CommonElements {
    public static void main(String[] args) {

        int[] a = {1,5,10,20};
        int[] b = {1,4,5,20};
        int[] c = {1,5,20,30};

        int i=0,j=0,k=0;

        while(i<a.length && j<b.length && k<c.length) {
            if(a[i]==b[j] && b[j]==c[k]) {
                System.out.println(a[i]);

                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j])
                i++;
            else if(b[j] < c[k])
                j++;
            else
                k++;
        }
    }
}