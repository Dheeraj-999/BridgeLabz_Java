
interface MealPlan {
    String getCategory();
}

class VegetarianMeal implements MealPlan {
    public String getCategory() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getCategory() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getCategory() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getCategory() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    String name;
    T plan;

    Meal(String name, T plan) {
        this.name = name;
        this.plan = plan;
    }
}

public class MealPlanGenerator {

    static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.println("Meal: " + meal.name);
        System.out.println("Category: " + meal.plan.getCategory());
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 = new Meal<>("Vegetable Salad", new VegetarianMeal());

        Meal<VeganMeal> m2 = new Meal<>("Vegan Bowl", new VeganMeal());

        Meal<KetoMeal> m3 = new Meal<>("Keto Eggs", new KetoMeal());

        generateMeal(m1);
        System.out.println();

        generateMeal(m2);
        System.out.println();

        generateMeal(m3);
    }
}
