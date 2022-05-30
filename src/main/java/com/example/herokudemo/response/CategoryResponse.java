package com.example.herokudemo.response;

import com.example.herokudemo.models.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {

    private List<Category> category;
}
