package com.example.kaisyarani_crud.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}