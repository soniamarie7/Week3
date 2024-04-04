
import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private String company;
    private List<String> programmingLanguages;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.programmingLanguages = new ArrayList<>();
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for company
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // Getter for programmingLanguages
    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    // Method to learn a new programming language
    public void learnLanguage(String language) {
        if (!language.isEmpty()) {
            if (!programmingLanguages.contains(language)) {
                programmingLanguages.add(language);
            } else {
                System.out.println("Language " + language + " already exists in the list.");
            }
        } else {
            System.out.println("Language cannot be empty.");
        }
    }

    // Method to forget a programming language
    public void forgetLanguage(String language) {
        programmingLanguages.remove(language);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", programmingLanguages=" + programmingLanguages +
                '}';
    }

    // Override equals method to compare programmingLanguages
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Programmer))
            return false;
        Programmer other = (Programmer) obj;
        return this.programmingLanguages.equals(other.programmingLanguages);
    }
}
