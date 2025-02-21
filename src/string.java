public class string {
    public static void main(String[] args) {
        String studentName = "Krow";
        double studentGPA = 3.5;
        char studentFirstInitialCharacter = studentName.charAt(0);
        char studentLastInitialCharacter = studentName.charAt(studentName.length() - 1);

        System.out.println(studentFirstInitialCharacter);
        System.out.println(studentLastInitialCharacter);
        System.out.println(studentName + " has GPA of " + studentGPA);
    }
}
