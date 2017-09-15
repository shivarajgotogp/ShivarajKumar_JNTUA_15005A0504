import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	
		
		return Student[];
	}

	@Override
	public void setStudents(Student[] students) {
	if(students==null){
		throw new IllegalArgumentException("students should not be empty");
	}
	else {
		for(int i=0;i<length;i++)
		{
			students[i]=Student[i];
		}
	}
	
		
	}

	@Override
	public Student getStudent(int index) {
	if(index<0|| index>=students.length())
	{
		throw new IllegalArgumentException("index must be greate than zero and lessthan are equal to students.length()");
	}
	
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==null||index < 0|| index>=students.length()){
		throw new IllegalArgumentException("students should not be empty");
	}
	else{
		Student[index]=student;
	}
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
		throw new IllegalArgumentException("students should not be empty");
	}
	else{
		Student[0]=student;
	}
	}

	@Override
	public void addLast(Student student) {
		if(student==null){
		throw new IllegalArgumentException("students should not be empty");
	}
	else{
		Student[Students.length()+1]=student;
	}
	}

	@Override
	public void add(Student student, int index) {
		if(student==null||index < 0|| index>=students.length()){
		throw new IllegalArgumentException("students should not be empty");
	}
	else{
		Student[index+1]=student;
	}
	}

	@Override
	public void remove(int index) {
		if(index<0|| index>=students.length())
	{
		throw new IllegalArgumentException("index must be greate than zero and lessthan are equal to students.length()");
			}
	else
	{
		Student[index]=null;
	}
	}

	@Override
	public void remove(Student student) {
	if(student==null){
		throw new IllegalArgumentException("students should not be empty");
	}
	else
	{
	for(int i=0:i<students.length;i++){
	int count=0;
		if(students[i]==student)
		{
			
			student[j]=student[j+1];
			count=1
			break;
		}
	}
	if(count=1)
	{
		throw new IllegalArgumentException("student not Exist");
	}
	}
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0|| index>=students.length())
	{
		throw new IllegalArgumentException("index must be greate than zero and lessthan are equal to students.length()");
	}
	else
	{
		for(int i=index+1:i<students.length;i++){
			student[i]=null;
			}
	}
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
	{
		throw new IllegalArgumentException("student should not be null");
	}
	else
	{
		for(int i=0:i<students.length;i++){
		if(students[i]==student)
		{
			for(int j=i+1;j<student;j++)
			{
			student[j]=null;
			}
		}
	}
	}
	}

	@Override
	public void removeToIndex(int index) {
			if(index<0|| index>=students.length())
	{
		throw new IllegalArgumentException("index must be greate than zero and lessthan are equal to students.length()");
			}
	else
	{
		for(int i=0:i<index;i++){
			student[i]=null;
			}
	}
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
	{
		throw new IllegalArgumentException("student should not be null");
	}
	else
	{
		for(int i=0:i<students.length;i++){
		if(students[i]==student)
		{
			for(int j=0;j<i;j++)
			{
			student[j]=null;
			}
		}
	}
	}
	}

	@Override
	public void bubbleSort() {
		int n = students.length();  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(students[j-1] > students[j]){  
                                 //swap elements  
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                         }  
                          
                 }  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		if(indexOfStudent==0)
		{
			throw new IllegalArgumentException()
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null)
	{
		throw new IllegalArgumentException("student should not be null");
	}
	else
	{
		for(int i=0;i<students.length();i++)
		{
			if(students[i]==student)
			String nextstudent=students[i+1]
		}
	}
		return nextstudent;
	}
}
