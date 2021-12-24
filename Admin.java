
import java.util.LinkedList;
import java.util.Scanner;

public class Admin {
    LinkedList<Doctor> d=new LinkedList<>();

    //data of doctors
    public void doctorsInitialData(){
<<<<<<< Updated upstream
        Doctor d1=new Doctor(1,"Dr. Strange",33,'m',"Surgeon");
        d.add(d1);
        Doctor d2=new Doctor(2,"Dr. Who",77,'m',"Physician");
        d.add(d2);
        Doctor d3=new Doctor(3,"Dr.Jones",28,'f',"Orthopedist");
        d.add(d3);
        Doctor d4=new Doctor(4,"Dr.Drake",50,'m',"Dermatologist");
        d.add(d4);
        Doctor d5=new Doctor(5,"Dr.Jessica",36,'f',"Neurologist");
        d.add(d5);
=======
        Object[] ob = new Object[5];
	public void initialize()
	{
	 Object[] ob = new Object[5];
	 ob[0] = "ID";
	 ob[1] = "Name";
	 ob[2] = "Speciality";
	 ob[3] = "Speciality No.";
	 ob[4] = "Availibility";

	 doclist.add(ob);       

	 ob = new Object[5];
	 ob[0] = "D101";
	 ob[1] = "Huzaif";
	 ob[2] = "Cardiology";
	 ob[3] = "1";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D102";
	 ob[1] = "Darshan";
	 ob[2] = "Orthopedic";
	 ob[3] = "2";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D103";
	 ob[1] = "Shabbir";
	 ob[2] = "Oncology";
	 ob[3] = "3";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D104";
	 ob[1] = "Kaif";
	 ob[2] = "Radiology";
	 ob[3] = "4";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D105";
	 ob[1] = "Shah";
	 ob[2] = "Cardiology";
	 ob[3] = "1";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D106";
	 ob[1] = "Moin";
	 ob[2] = "Orthopedic";
	 ob[3] = "2";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D107";
	 ob[1] = "Saad";
	 ob[2] = "Oncology";
	 ob[3] = "3";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D108";
	 ob[1] = "Azeem";
	 ob[2] = "Radiology";
	 ob[3] = "4";
	 ob[4] = "1";
	 doclist.add(ob);
	}

>>>>>>> Stashed changes
    }

    Scanner sc=new Scanner(System.in);
    //view doctor details
    public void viewDoctorsDetails(){
        System.out.println("Enter choice for details of  \n1-All doctors \n2-Specific Doctor");
        switch (sc.nextInt()){
            case 1:{
                System.out.println("\nDoctor-ID \tDoctor-Name \tAge \t Sex \tSpeciality ");
                for(int i=0;i<d.size();i++){
                    System.out.println(d.get(i).getDoctorID()+"\t\t"+d.get(i).getDoctorName()+"\t\t"+d.get(i).getAge()+"\t\t"+d.get(i).getDoctorSex()+"\t\t"+d.get(i).getDoctorSpeciality());
                }
                break;
            }
            case 2:{
                System.out.println("Enter the id of the doctor whose details are to be displayed ");
                int id=sc.nextInt();
                int i=searchDoctor(id);
                if(i>=0){
                    System.out.println("\nDoctor-ID \tDoctor-Name \tAge \t Sex \tSpeciality ");
                    System.out.println(d.get(i).getDoctorID()+"\t\t"+d.get(i).getDoctorName()+"\t\t"+d.get(i).getAge()+"\t\t"+d.get(i).getDoctorSex()+"\t\t"+d.get(i).getDoctorSpeciality());
                }else{
                    System.out.println("Doctor ID invalid");
                }
                break;
            }
        }
    }


    //add doctor
    public void addDoctor(){
        do {
            System.out.println("Enter the Doctor details :- \n ");
            int i = d.size() + 1;
            System.out.println("Enter the Doctor Name  ");
            String name = sc.next();
            System.out.println("Enter the Doctor Age  ");
            int age = sc.nextInt();
            System.out.println("Enter the Doctor  Gender  ");
            char gender = sc.next().charAt(0);
            System.out.println("Enter the Doctor Speciality  ");
            String spc = sc.next();
            Doctor doc = new Doctor(i, name, age, gender, spc);
            d.add(doc);
            System.out.println("do you want to add more doctors if tes press 1 ");
        }while(sc.nextInt()==1);
    }

    //remove doctor
    public void removeDoctor(){
        System.out.println("Enter the id of the doctor to be Deleted ");
        int id=sc.nextInt();
        int i=searchDoctor(id);
        if(i>=0) {
            d.remove(i);
            System.out.println("Successfully Doctor Deleted");
        }
        else
        {
            System.out.println("Invalid Doctor Id ");
        }
    }

    //search doctors
    public int searchDoctor(int id){
        for(int i=0;i<d.size();i++){
            if(id==d.get(i).getDoctorID()){
                return i;
            }
        }
        return -1;
    }
}
