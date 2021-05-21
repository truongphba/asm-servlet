package controller;

import entity.Food;
import helper.GenericValidateClass;
import service.FoodService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class CreateFoodController extends HttpServlet {

    private FoodService foodService = new FoodService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        int category = Integer.parseInt(req.getParameter("category"));
        String description = req.getParameter("description");
        String thumbnail = req.getParameter("thumbnail");
        double price = Double.parseDouble(req.getParameter("price"));
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createdAt = formatter.format(calendar.getTime());
        String updatedAt = formatter.format(calendar.getTime());
        int status = 1;
        Food food = new Food(name, category, description, thumbnail, price, createdAt, updatedAt, status);

        GenericValidateClass<Food> foodGenericValidateClass = new GenericValidateClass<>(Food.class);
        System.out.println("Validate");
        System.out.println(foodGenericValidateClass.validate(food));
        System.out.println("End Validate");
        // validate
        if(!foodGenericValidateClass.validate(food)){
            System.out.println("Have Error");
            HashMap<String, ArrayList<String>> errors = foodGenericValidateClass.getErrors();

            req.setAttribute("errors", errors);
            req.setAttribute("food", food);
            req.getRequestDispatcher("/form.jsp").forward(req, resp);
            return;
        }
        System.out.println(foodGenericValidateClass.getErrors());
        System.out.println("Create Food");
        foodService.create(food);
        resp.sendRedirect("/list");
    }
}
