class even_num_left_odd_right{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int l=0,r=a.length-1;
		while(l<r){
			if(a[l]%2!=0){
				if(a[r]%2==0){
					int t=a[l];a[l]=a[r];a[r]=t;
				}
				else
				r=r-1;
			}
			else
			l=l+1;
		}
		for(int i:a){
			System.out.print(i+" ");
		}
	}
}
	
	
