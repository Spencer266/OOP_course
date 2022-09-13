public class StudentManagement {

    private static final Student[] students = new Student[100];
    private static int index_st = 0;

    public static void addStudent(Student newStudent) {
        students[index_st++] = newStudent;
    }

    /**
     * Remove student using id.
     *
     * @param id student's id
     */
    public static void removeStudent(String id) {
        for (int i = 0; i < index_st; i++) {
            if (students[i].getId().equals(id)) {
                while (i < index_st - 1) {
                    students[i] = students[i + 1];
                    i++;
                }
                students[--index_st] = null;
                break;
            }
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * List students by group.
     * @return List as string
     */
//    public static String studentsByGroup() {
//
//        String result = "";
//
//        List<String> existGroup = new ArrayList<>();
//        for (Student s : students) {
//            if (s == null) {
//                break;
//            }
//            if (!existGroup.contains(s.getGroup())) {
//                existGroup.add(s.getGroup());
//            }
//        }
//
//        List<Student> tmp = Arrays.asList(students);
//        for (String g : existGroup) {
//            result += g + "\n";
//            Iterator<Student> iter = tmp.listIterator();
//            while (iter.hasNext()) {
//                Student s = iter.next();
//                if (s == null) {
//                    break;
//                }
//                if (s.getGroup().equals(g)) {
//                    result += s.getInfo() + "\n";
//                    tmp.remove(iter);
//                }
//            }
//        }
//
//        return result;
//    }

    /**
     * List students by group.
     *
     * @return List as string
     */
    public static String studentsByGroup() {
        String result = "";
        boolean[] marked = new boolean[index_st];
        for (int i = 0; i < index_st; i++) {
            if (marked[i]) {
                continue;
            }
            result += students[i].getGroup() + "\n";
            for (int j = 0; j < index_st; j++) {
                if (sameGroup(students[i], students[j])) {
                    result += students[j].getInfo() + "\n";
                    marked[j] = true;
                }
            }
        }
        return result;
    }

    /**
     * Main method.
     *
     * @param args cli input
     */
    public static void main(String[] args) {
        Student st1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        st1.setGroup("K62CC");
        addStudent(st1);
        Student st2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        st2.setGroup("K62CC");
        addStudent(st2);
        Student st3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        st3.setGroup("K62CB");
        addStudent(st3);
        Student st4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        st4.setGroup("K62CB");
        addStudent(st4);
        Student st5 = new Student("Nguyen Van E", "17020005", "17020005@vnu.edu.vn");
        st5.setGroup("K62CC");
        addStudent(st5);

        removeStudent("17020002");
        System.out.println(studentsByGroup());
    }
}
