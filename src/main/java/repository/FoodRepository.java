package repository;

import entity.Food;
import helper.GenericModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodRepository {
    private static List<Food> list = new ArrayList<>();
    private GenericModel<Food> genericModel = new GenericModel<>(Food.class);

    public boolean save(Food food){
        genericModel.save(food);
        return true;
    }

    public boolean update(int id, Food updateFood) throws InstantiationException, IllegalAccessException, SQLException {
        Food existFood = genericModel.findById(id);
        if(existFood == null){
            return false;
        }
        genericModel.update(id,existFood);
        return true;
    }
    public boolean delete(int id) throws SQLException {
        Food existFood = genericModel.findById(id);
        if(existFood == null){
            return false;
        }
        genericModel.delete(id);
        return true;
    }
    public Food findById(int id){
        return genericModel.findById(id);
    }
    public List<Food> findAll(){
        List<Food> list = genericModel.findAll();
        return list;
    }
}
