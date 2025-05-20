package sample2.w12;

public class PerformanceTest {
	public static void main(String[] args) {
		System.out.println("50000번 반복 비교");
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello, World!");
		for (int i = 0; i < 50000; i++) {
			sb.append("hi");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Hello, World!");
		for (int i = 0; i < 50000; i++) {
			sb2.append("hi");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
		
		String str = new String("Hello, World!");
		for (int i = 0; i < 50000; i++) {
			str.concat("hi");
		}
		System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");
		
	}
}
