package week9;

    class University {
    String name;
    int ranking;

    University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

class Faculty extends University {
    String name;

    Faculty(String universityName, int ranking, String facultyName) {
        super(universityName, ranking);
        this.name = facultyName;
    }

    void Details() {
        System.out.println("Faculty Name: " + name);
    }
}

class Department extends Faculty {
    String name;
    String chairman;

    Department(String universityName, int ranking, String facultyName,
               String departmentName, String chairman) {
        super(universityName, ranking, facultyName);
        this.name = departmentName;
        this.chairman = chairman;
    }

    @Override
    void Details() {
        System.out.println("Department Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        super.Details();

        this.Details();

        System.out.println("University Ranking: " + ranking);
    }
}

public class task2 {
    public static void main(String[] args) {
        Department d = new Department(
            "ABC University",
            10,
            "Science Faculty",
            "Computer Science",
            "Prof. Arman Faridi"
        );

        d.Display();
    }
}
