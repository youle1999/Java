class Bmi{
	public static void main(String[] args){
		double height=Double.parseDouble(args[0]);
		double weight=Double.parseDouble(args[1]);
		
		height=height/100;
		double bmi=weight/height/height;
		System.out.println("bmi="+bmi);
		
		if(bmi<18.5){
			System.out.println("�₹");
		}else if(bmi<25){
			System.out.println("�W��");
		}else if(bmi<30){
			System.out.println("�얞");
		}else{
			System.out.println("���x�얞");
		}
			
		
			
			
			
		}
}