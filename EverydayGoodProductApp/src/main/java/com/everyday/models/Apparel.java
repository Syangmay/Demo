package com.everyday.models;

import javafx.scene.paint.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apparel extends  Category{
    private int size;
    private Material material;
}
