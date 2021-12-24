public void registerPatient()
		{
			Patient pr = new Patient();
			
			int patientID;
			System.out.println("Enter Patient name:");
			pr.patientName = s.nextLine();
			System.out.println("Enter Patient Age:");
			pr.age = s.nextInt();
			System.out.println("Enter Patient Sex:");
			pr.patientSex =s.next().charAt(0);
			System.out.println("Enter Patient Illness:");   //add emergency option
			pr.patientIllness = s.next();
			System.out.println("Enter the amount patient needs to pay for appointment:");
			pr.amountForAppointment = s.nextFloat();
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

