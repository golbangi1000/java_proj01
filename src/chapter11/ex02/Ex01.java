package chapter11.ex02;


class Student{
	
	//필드
	String name;
	
	public Student(String name) {
		super();
		this.name = name;
	}
	//합계와 평균을 출력하는 메소드
	void sum_avg() {
	}
}

class Student_Sub extends Student{
	int kor; 
	int eng;
	int math;

	public Student_Sub(String name, int kor, int eng, int math) {
		super(name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	//부모의 sum_avg() 메소드를 오버라이딩 해서 kor eng math 의 합계와 평균을 출력
	@Override
	void sum_avg() {
		double sum = eng + kor + math;
		double avg = sum/3;
		System.out.println(name +"의 "+"합계:" + sum + "   평균:" + avg);
	}
	
}

public class Ex01 {
	public static void main(String[] args) {

		/*
		 홍길동 70 88 77
		 이순신 80 68 87
		 김똘똘 60 86 87
		 홍길순 77 56 80
		 강감찬 55 66 77
		 */
		Student s1 = new Student_Sub("홍길동", 70, 88, 77);
		Student s2 = new Student_Sub("이순신", 80, 68, 87);
		Student s3 = new Student_Sub("김똘똘", 60, 86, 87);
		Student s4 = new Student_Sub("홍길순", 77, 56, 80);
		Student s5 = new Student_Sub("강감찬", 55, 66, 77);
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서 
		Student[] arr = new Student[] {s1,s2,s3,s4,s5};
		
		
		//배열의 값을 for문으로 출력할때 
			// 오버라이딩된 메소드 출력	< 그 학생의 국어 영어 수학의 합계와 평균 
			//5명의 학생의 국어에 대한 합계, 평균 
			//5명의 학생의 영어에 대한 합계, 평균 
			//5명의 학생의 수학에 대한 합계, 평균 
		
		//for문 한개
		int sum1[] = new int[3];
		for(int i = 0; i < arr.length;i++) {
			arr[i].sum_avg();
			sum1[0] += ((Student_Sub)arr[i]).kor;
			sum1[1] += ((Student_Sub)arr[i]).eng;
			sum1[2] += ((Student_Sub)arr[i]).math;
			if( i == arr.length-1) {
				System.out.println("국어합계:" + sum1[0] + "   국어평균:" + sum1[0]/5.0);
				System.out.println("영어합계:" + sum1[1] + "   영어평균:" + sum1[1]/5.0);
				System.out.println("수학합계:" + sum1[2] + "   수학평균:" + sum1[2]/5.0);
			}

		}
		
	}
}
