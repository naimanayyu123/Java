package JavaEmployee.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class threeProfessionsArray {

	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//Doctor objs array
		int nd = Integer.parseInt(br.readLine());
		Doctor[] d = new Doctor[nd];
		
		System.out.println("Enter Doctor details in format name,age, sal, specialisation ");
		for(int i = 0 ; i<nd ; i++) {
			String[] str =  br.readLine().split(" ");
			d[i] = new Doctor(str[0], Integer.parseInt(str[1]) , Long.parseLong(str[2]), str[3]);
		}
		
		
		//engineer object array
		int ne = Integer.parseInt(br.readLine());
		System.out.println("Enter Engineer details in format name,age, role, project name, sal ");
		engineer[] e = new engineer[ne];
		
		for(int i=0; i<ne; i++) {
			String[] str =  br.readLine().split(" ");
			e[i] = new engineer(str[0], Integer.parseInt(str[1]) , str[2], str[3], Long.parseLong(str[4]));
		}
		
		
		
		//pilot array
		int np = Integer.parseInt(br.readLine());
		System.out.println("Enter Pilot details in format name,age, noOfFlights,  level, sal ");
		Pilot[] p = new Pilot[np];
        for(int i=0; i<ne; i++) {
        	String[] str =  br.readLine().split(" ");
        	p[i] = new Pilot(str[0], Integer.parseInt(str[1]) , str[2], str[3], Long.parseLong(str[4]));
		}
        
        
        //display Doctors
        System.out.println("Doctors");
        for(Doctor dc : d) {
        	dc.displayDetails();
        }
        
        //display Pilots
        System.out.println("Pilots");
        for(Pilot pt : p) {
        	pt.displayDetails();
        }
        
        //display Engineers
        System.out.println("Engineers");
        for(engineer eng : e) {
        	eng.displayDetails();
        }
	}

}
