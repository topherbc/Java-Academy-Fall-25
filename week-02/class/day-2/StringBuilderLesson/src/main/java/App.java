public class App {
    public static void main(String[] args) {
        String nonStringBuilderSkills = "";

        //Concatenation
        nonStringBuilderSkills += "Git, ";
        nonStringBuilderSkills += "HTML, ";
        nonStringBuilderSkills += "CSS, ";
        nonStringBuilderSkills += "and Bootstrap\n";
        nonStringBuilderSkills += "JavaScript, ";
        nonStringBuilderSkills += "ES6, ";
        nonStringBuilderSkills += "jQuery, ";
        nonStringBuilderSkills += "REST APIs, ";
        nonStringBuilderSkills += "and Express\n";
        nonStringBuilderSkills += "Angular\n";

        nonStringBuilderSkills += "Java\n";
        nonStringBuilderSkills += "Node.js\n";
        nonStringBuilderSkills += "ML\n";
        nonStringBuilderSkills += "AWS\n";
        nonStringBuilderSkills += "Lambda Expressions\n";

        System.out.println(nonStringBuilderSkills);













        StringBuilder skills = new StringBuilder();

          // append strings to the StringBuilder object
        skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");

        String mySkills = skills.toString();
        System.out.println(mySkills);


    }
}
