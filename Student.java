class Student {
	String index;
	String firstName;
	String lastName;
	char grades;
	
//TODO constructor

Student(){
	index=" ";
	firstName=" ";
	lastName=" ";
	grades=" ";
};


Student(const Student& s){
	strcpy(this->index=s.index;)
	strcpy(this->firstName,s.firstName);
	strcpy(this->lastName,s.lastName);
	strcpy(this->grades,s.grades);
}
~Student()

//TODO seters & getters
void setIndex(String i){
	index=i;
}
void setFirstName(String fN){
	firstName=fN;
}
void setLastName(String lN){
	lastName=lN;
}

String getIndex(){
	return index;
}

String getFirstNAme(){
	return firstName;
}
String getLastName(){
	return lastName;
}


public double getAverage() {
	//TODO
	int prosek;
	int n;
	for (int i=0;i<n;i++){
		prosek = grades/n;
	}

}

public int ECTSCredits() {
	//TODO

}
}
