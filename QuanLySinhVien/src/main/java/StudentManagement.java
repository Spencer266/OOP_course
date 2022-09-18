public class StudentManagement {

    private final Student[] students = new Student[100];
    private int indexStudent = 0;

    public void addStudent(Student newStudent) {
        students[indexStudent++] = newStudent;
    }

    /**
     * Remove student using id.
     *
     * @param id student's id
     */
    public void removeStudent(String id) {
        for (int i = 0; i < indexStudent; i++) {
            if (students[i].getId().equals(id)) {
                while (i < indexStudent - 1) {
                    students[i] = students[i + 1];
                    i++;
                }
                students[--indexStudent] = null;
                break;
            }
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }


    /**
     * List students by group.
     *
     * @return List as string
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        boolean[] marked = new boolean[indexStudent];
        for (int i = 0; i < indexStudent; i++) {
            if (marked[i]) {
                continue;
            }
            result.append(students[i].getGroup());
            result.append("\n");
            for (int j = 0; j < indexStudent; j++) {
                if (sameGroup(students[i], students[j])) {
                    result.append(students[j].getInfo());
                    result.append("\n");
                    marked[j] = true;
                }
            }
        }
        return result.toString();
    }

    /**
     * Main method.
     *
     * @param args cli input
     */
    public static void main(String[] args) {

    }
}
