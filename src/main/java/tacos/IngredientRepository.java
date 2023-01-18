package tacos;

import java.util.List;

public interface IngredientRepository {
    public Iterable<Ingredient> findAll();
    public Ingredient findById(String id);
    public Ingredient save(Ingredient ingredient);
}
