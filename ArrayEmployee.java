package JavaEmployee.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class ArrayEmployee {

	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		EmployeeClass[] e = new EmployeeClass[n];
		
		for(int i = 0; i< n ; i++) {
			String[] str =  br.readLine().split(" ");
			e[i] = new EmployeeClass(str[0], Integer.parseInt(str[1]) , Long.parseLong(str[2]));
			
		}
		
		System.out.println("Employee Details\n");
		
		for(int i = 0; i<e.length; i++) {
			System.out.println("Employee "+i);
			System.out.println(e[i].getName()+"\t"+e[i].getAge()+"\t"+e[i].getSal()+"\n");
		}
		
		EmployeeClass[] e1 = new EmployeeClass[n];
		
		for(int i = 0; i< n ; i++) {
			String[] str =  br.readLine().split(" ");
			e1[i] = new EmployeeClass(str[0], Integer.parseInt(str[1]) , Long.parseLong(str[2]));
			
		}
		
		System.out.println("Employee Details\n");
		
		for(int i = 0; i<e1.length; i++) {
			System.out.println("Employee "+i);
			System.out.println(e1[i].getName()+"\t"+e1[i].getAge()+"\t"+e1[i].getSal()+"\n");
		}
		
		
		
		EmployeeClass[] e2 = new EmployeeClass[n];
		
		for(int i = 0; i< n ; i++) {
			String[] str =  br.readLine().split(" ");
			e2[i] = new EmployeeClass(str[0], Integer.parseInt(str[1]) , Long.parseLong(str[2]));
			
		}
		
		System.out.println("Employee Details\n");
		
		for(int i = 0; i<e.length; i++) {
			System.out.println("Employee "+i);
			System.out.println(e2[i].getName()+"\t"+e2[i].getAge()+"\t"+e2[i].getSal()+"\n");
		}

		

        
	}

}
class EmployeeClass{
	
	int age;
	String name;
	long sal;
	
	EmployeeClass(String name, int age, long sal){
		this.age = age;
		this.sal = sal;
		this.name = name;
	}
	
	
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	long getSal() {
		return sal;
	}
	void setSal(long sal) {
		this.sal = sal;
	}
	
	
	
}



