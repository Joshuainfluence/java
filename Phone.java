public class Phone {
    public static void main(String[] args) {
        long x = 9077685271L;
        String name = "Influence";
        String univeristy = "Delta State University, Nigeria";
        float cgpa = 4.90f;
        char grade = 'A';
        System.out.println("I want to tell you all a story");
        System.out.println("There was guy namd " + name);
        System.out.println("He is attends " + univeristy);
        System.out.println("He have a cgpa of " + cgpa + " with a grade of " + grade);
        System.out.println("My phone number is " + x);

        String p = "Bread";
        String q = "Butter";
        String temp;
        temp = p;
        p = q;
        q = temp;

        System.err.println("P: " + p);
        System.out.println("q: " + q);

    }
}