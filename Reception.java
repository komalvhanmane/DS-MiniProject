import java.util.Scanner;
public class Reception
{
	Scanner s=new Scanner(System.in);
	int patientID=100;
public void registerPatient()
		{
			//Patient pr = new Patient();
			patientID++;
			System.out.println("Enter Patient name:");
			String patientName = s.nextLine();
			System.out.println("Enter Patient Age:");
			int age = s.nextInt();
			System.out.println("Enter Patient Sex:");
			char patientSex =s.next().charAt(0);
			System.out.println("Choose the doctor type:");
			System.out.println("1:Surgeon");  
			System.out.println("2:Cardiologist"); 
			System.out.println("3:Neurologist");
			System.out.println("4:Physician");
			System.out.println("5:Dermatologist");
			int ch=s.nextInt();
			String DoctorType;
			switch (ch) {
				case 1:
					DoctorType="Surgeon";
					break;
				case 2:
					DoctorType="Cardiologist";
					break;
				case 3:
					DoctorType="Neurologist";
					break;
				case 4:
					DoctorType="Physician";
					break;
				case 5:
					DoctorType="Dermatologist";
					break;	
				default:
				    System.out.println("INVALID CHOICE");
					DoctorType=null;
					break;
			}
			System.out.println("Enter the amount patient needs to pay for appointment:");
			Float amountForAppointment = s.nextFloat();
			Patient pr=new Patient(patientID, patientName, age, patientSex, DoctorType, amountForAppointment);
		}

public void showappointmentDetails() 
		{
			
			
			// FileWriter myFile3= new FileWriter("C:\\Hospital Management\\Filehp2.txt");
			// {
				
			
			// 	myFile3.write("patient-ID \t Patient-Name \t\tAge \tSex \t Illness \t Consultation Fees \t\t \n");
			// 	for(int i=0; i<hm.arl.size(); i++)
			// 		{
			// 			String abc=hm.arl.get(i).patientID + "\t\t  "+hm.arl.get(i).patientName+"\t \t"+hm.arl.get(i).age+"\t"+hm.arl.get(i).patientSex+"\t"+hm.arl.get(i).patientIllness+"\t\t"+hm.arl.get(i).amountForAppointment+"\t\t";
			// 			myFile3.write(abc);
			// 			myFile3.write("\n");
			// 		}
			// 	myFile3.close();
			// }
			
			// File myFile4=new File("C:\\Hospital Management\\Filehp2.txt");
			// Scanner ab=new Scanner(myFile4);
			// while(ab.hasNextLine())
			// {
			// 	String data=ab.nextLine();
			// 	System.out.println(data);
			// }
			// ab.close();
			
		}

public void assigndoctor()
{
}
}
