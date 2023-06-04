package com.assignment1.bhardwya.bhardwyaassignment01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Box> boxes;
    private Box selectedBox;

    public Game() {
        boxes = new ArrayList<>();
        initializeBoxes();
    }

    private void initializeBoxes() {
        // Creating the boxes with different prizes
        Prize prize1 = new Prize("iPad", 700);
        Prize prize2 = new Prize("iPhone 14 Pro Max", 500);
        Prize prize3 = new Prize("100$ Gift Card for Steam", 100);
        Prize prize4 = new Prize("Legion Gaming Phone", 100);
        Prize prize5 = new Prize("Gaming Mouse", 100);
        Prize prize6 = new Prize("SteelSeries Keyboard", 100);

        boxes.add(new Box(prize1));
        boxes.add(new Box(prize2));
        boxes.add(new Box(prize3));

        // Shufflng the boxes
        Random random = new Random();
        for (int i = 0; i < boxes.size(); i++) {
            int j = random.nextInt(boxes.size());
            Box temp = boxes.get(i);
            boxes.set(i, boxes.get(j));
            boxes.set(j, temp);
        }
    }

    public void selectBox(int index) {
        selectedBox = boxes.get(index);
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public Box getSelectedBox() {
        return selectedBox;
    }
}
