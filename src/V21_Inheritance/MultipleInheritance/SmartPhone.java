package V21_Inheritance.MultipleInheritance;

//public class SmartPhone extends phone, camera { //then will get error
//Here below i can inherit only one class as given below

//Java supports multilevel inheritance, hierarchical but Multiple inheritance is not present
//Why multiple inheritance is not present or java not support??
public class SmartPhone extends phone{
	//public class SmartPhone extends phone, camera, musicPlayer { this is multiple inheritance
	//if multiple inheritance is supports java then what happened 
	//I have defined powerOn() in the Camera class as well as musicPlayer class then if i call this method using smartPhone
	//Object the ambiguity issue arrive
	//What is ambiguity issue here smartphone is calling powerOn() method but here compiler get confussion
	//which method it needs to be called due to this reason java doesn't support multiple inheritance on class level
}
