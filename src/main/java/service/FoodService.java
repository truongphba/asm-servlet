package service;

import entity.Food;
import repository.FoodRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodService {
    private FoodRepository foodRepository; // model

    public FoodService() {
        this.foodRepository = new FoodRepository();
    }

    public boolean create(Food obj) {
        return foodRepository.save(obj);
    }

    public List<Food> getList(){
        return new ArrayList<>(foodRepository.findAll());
    }

    public Food getById(int id){
        return foodRepository.findById(id);
    }

    public boolean edit(int id, Food obj) throws InstantiationException, IllegalAccessException, SQLException {

        return foodRepository.update(id,obj);
    }

    public boolean delete(int id) throws SQLException {

        return foodRepository.delete(id);
    }
}
