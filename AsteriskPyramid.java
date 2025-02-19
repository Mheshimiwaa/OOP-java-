class AstersiskPyramid{
    public static void main(String[] args){
	int rows = 5;
	for(int i = 0; i <= 5; i++){
		for(int space = rows - i; space > 0; space++){
			System.out.print(" ");//spaces
}
		for(int j = 0; j <= 2 * i; j++){
			System.out.print("*");
	}

	System.out.println();
}
	}}
    