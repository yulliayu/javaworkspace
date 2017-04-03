class UseDog{
	public static void main(String[] args){
		// 강아지 인스턴스 1개 생성.
		Dog d1=new Dog();

		//System.out.println(d1.name);
		//System.out.println(d1.getName());
		d1.setName("아롱이", "블독");
		System.out.println(d1.name);
		System.out.println(d1.type);
	}
}
