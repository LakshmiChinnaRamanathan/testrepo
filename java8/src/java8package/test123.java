package java8package;


		@FunctionalInterface
		interface addsum{
			public int  getsum(int a,int b);
		}
		@FunctionalInterface
		interface dispaly() {
			public void show();
		}
		public class test123 {
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				addsum a1=(a,b)->a+b;
				System.out.println(a1.getsum(2, 3));
				display d=()->"hi lakshmi";
				System.out.println(d.show());
			}

		


	}


