int[] a=new int[10];
		int max=0;
		Scanner c=new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			a[i]=c.nextInt();
			
		}
		for(int i=0;i<10;i++){
			if(max<a[i]){
				max=a[i];
				
			}
		}
		System.out.print(max);
