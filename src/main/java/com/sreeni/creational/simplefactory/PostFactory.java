package com.sreeni.creational.simplefactory;

public class PostFactory {

public static Post createPost(String type) {

    return switch (type.toUpperCase()) {
        case "NEWS" -> new NewsPost();
        case "PRODUCT" -> new ProductPost();
        default -> throw new IllegalArgumentException("type unknown to create Post");
    };
}
}
