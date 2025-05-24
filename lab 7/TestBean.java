package lab.pkg7;


import lab.pkg7.Student;





public class TestBean {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(20);
        st.setName("Krishna Prasad Bharati");
        st.setSem("6th");
        
        System.out.println("Student Details");
        System.out.println("Id\tName\tSemester");
        System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getSem());
    } 
}
