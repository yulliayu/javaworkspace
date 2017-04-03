 class A {
   public void doit() {
   }
   public String doit() {  // overloading 이 아니다. 에러난다. 반환형이 다르나, 인수가 없는 메서드는 같기 때문에 에러.
     return "a";
   }
   public double doit(int x) { 
     return 1.0;
   }
}
