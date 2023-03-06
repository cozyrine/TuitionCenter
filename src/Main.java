public class Main {

    public static void main(String[] args) {

        //Student
        Name studname1 = new Name("Qasrina Nursabrina", "Binti", "Zainal Abidin");
        Address studAdd1 = new Address("Desa Surada", "Kajang", "43650", "Selangor");
        Student qas = new Student("05110914", 17, "SMITi");
        qas.addMarks(60);
        qas.addMarks(70);
        qas.addMarks(80);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname1.getFullName());
        System.out.println("IC: " + qas.getIc());
        System.out.println("Address: " + studAdd1.getFullAddress());
        System.out.println("Year: " + qas.getYear());
        System.out.println("Marks: " + qas.getMarks());
        System.out.println("");

        Name studname2 = new Name("Shasha Adiba", "Binti", "Sham");
        Address studAdd2 = new Address("Taman Mutiara", "Bandar Baru Bangi", "43650", "Selangor");
        Student sha = new Student("05060914", 17, "SMITi");
        sha.addMarks(80);
        sha.addMarks(65);
        sha.addMarks(75);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname2.getFullName());
        System.out.println("IC: " + sha.getIc());
        System.out.println("Address: " + studAdd2.getFullAddress());
        System.out.println("Year: " + sha.getYear());
        System.out.println("Marks: " + sha.getMarks());
        System.out.println("");

        //Teacher
        Name teachname1 = new Name("Siti Nur Masyitah", "Binti", "Rosli");
        Teacher masy = new Teacher("87040205", "Pahang", "5 years teaching", 5, "10/01/2016", 4);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname1.getFullName());
        System.out.println("IC: " + masy.getIc());
        System.out.println("Address: " + masy.getAddress());
        System.out.println("Qualifications: " + masy.getQualification());
        System.out.println("Year of Experience: " + masy.getYearsExp());
        System.out.println("Date Joined: " + masy.getDatejoined());
        System.out.println("Years since enter: " + masy.getYearsSinceEnter());
        System.out.println("");

        Name teachname2 = new Name("Farah Aliyah", "Binti", "Rusydi");
        Teacher farah = new Teacher("960706", "Selangor", "3 years teaching", 3, "15/03/2021", 1);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname2.getFullName());
        System.out.println("IC: " + farah.getIc());
        System.out.println("Address: " + farah.getAddress());
        System.out.println("Qualifications: " + farah.getQualification());
        System.out.println("Year of Experience: " + farah.getYearsExp());
        System.out.println("Date Joined: " + farah.getDatejoined());
        System.out.println("Years since enter: " + farah.getYearsSinceEnter());
        System.out.println("");

        //Tuition Center
        TuitionCenter bbb = new TuitionCenter("Bandar Baru Bangi");

        bbb.addteachers(masy);
        bbb.addteachers(farah);
        bbb.addnumstud(qas);
        bbb.addnumstud(sha);

        System.out.println("---Tuition Center Info---");
        System.out.println("Address: " + bbb.getAddress());
        System.out.println("Number of teacher: " + bbb.getnumteachers());
        System.out.println("Number of students: " + bbb.getnumstud());
        System.out.println("Average student marks: " + bbb.getAverageMarks());
        System.out.println("Minimum mark: " + bbb.getMinMarks());
        System.out.println("Maximum mark: " + bbb.getMaxMarks());
        System.out.println("Tutor's background: " + bbb.getTutorQualifications());

    }

}