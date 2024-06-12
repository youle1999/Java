class Bmi{
	public static void main(String[] args){
		double height=Double.parseDouble(args[0]);
		double weight=Double.parseDouble(args[1]);
		
		height=height/100;
		double bmi=weight/height/height;
		System.out.println("bmi="+bmi);
		
		if(bmi<18.5){
			System.out.println("‚â‚¹");
		}else if(bmi<25){
			System.out.println("•W€");
		}else if(bmi<30){
			System.out.println("”ì–ž");
		}else{
			System.out.println("‚“x”ì–ž");
		}
			
		
			
			
			
		}
}