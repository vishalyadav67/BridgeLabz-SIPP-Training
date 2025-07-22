import java.util.*;

interface Diet {
    String getMealType();
    List<String> getMeals();
}


class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public List<String> getMeals() {
        return Arrays.asList("Paneer Curry", "Dal Tadka", "Chapati", "Salad");
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public List<String> getMeals() {
        return Arrays.asList("Quinoa Bowl", "Tofu Stir-Fry", "Fruit Salad", "Smoothie");
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public List<String> getMeals() {
        return Arrays.asList("Grilled Chicken", "Avocado Salad", "Boiled Eggs", "Cheese Cubes");
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }

    public List<String> getMeals() {
        return Arrays.asList("Protein Shake", "Lentil Soup", "Grilled Fish", "Greek Yogurt");
    }
}

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public void displayMealPlan() {
        System.out.println("Meal Type: " + plan.getMealType());
        System.out.println("Items:");
        for (String item : plan.getMeals()) {
            System.out.println("- " + item);
        }
    }

    public T getPlan() {
        return plan;
    }
}

class MealGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        System.out.println("Generating a personalized " + plan.getMealType() + " meal plan...");
        return new Meal<>(plan);
    }
}

public class Diet {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal protein = new HighProteinMeal();

        Meal<VegetarianMeal> vegPlan = MealGenerator.generateMealPlan(veg);
        Meal<VeganMeal> veganPlan = MealGenerator.generateMealPlan(vegan);
        Meal<KetoMeal> ketoPlan = MealGenerator.generateMealPlan(keto);
        Meal<HighProteinMeal> proteinPlan = MealGenerator.generateMealPlan(protein);

        System.out.println();
        vegPlan.displayMealPlan();
        System.out.println();
        veganPlan.displayMealPlan();
        System.out.println();
        ketoPlan.displayMealPlan();
        System.out.println();
        proteinPlan.displayMealPlan();
    }
}
