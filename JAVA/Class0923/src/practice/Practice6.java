package practice;

import java.util.HashMap;

public class Practice6 {

	public static void main(String[] args) {
//		6. csv데이터에 다음과 같은 학번이 저장되어 있을 때.
//		EL201800001,CH201800021,EN12231
//		EL-전자공학과
//		CH-화학공학과
//		EN-영어영문학과
//		각 학번의 학과명을 출력하시오.
		
		String csv = "EL201800001,CH201800021,EN12231";
		HashMap<String, String> map = new HashMap<String, String>();
		String[] info = csv.split(",");
		
		for(int i = 0; i < info.length; i++) {
			map.put(info[i].substring(2), info[i].substring(0, 2));
		}
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(info[i].substring(2)));
		}

	}

}
