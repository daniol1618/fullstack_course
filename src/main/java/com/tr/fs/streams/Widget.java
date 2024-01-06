package com.tr.fs.streams;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Widget {
    private Color color;
    private int weight;
    private String name;
}

enum Color {
    RED, BLUE, YELLOW;
}
