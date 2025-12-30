package V24_Access_Modifiers.Private_AccessModifiers.Test;

public class Private_School {
	/*
	 Here we are creating an private constructor and making this class as singleton
	 So here we can't able to create the object of this class means one object is used in entire application
	 */
	
	//Created an variable of the class and marked that as private.
	private static Private_School school;
	
	//Created an constructor to make sure that to disable creating new object.
	private Private_School() {
		
	}
	
	//But we need to confirm how do we are using the single object
	//By default object value is null
	public static Private_School getInstance() {
		if(school == null) {
			school = new Private_School();
		}
		return school;
	}
}
