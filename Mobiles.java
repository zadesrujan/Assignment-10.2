package my;
//here we cretaed package as my which that organizes a set of related classes and interfaces.
public class Mobiles {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		System.out.println("properties of mobile:");
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
		//prints properties of mobile
		my.Mobile mobile=new my.Mobile();
		//here created fully qualified name to access the object of the
		//class mobile from the package my
		mobile.facebook();//displays the get methods for the objects provided
		mobile.whatsapp();
		mobile.instagaram();
		mobile.twitter();
}


	}

