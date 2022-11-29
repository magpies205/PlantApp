package com.example.plantapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\bH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/example/plantapp/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_delivery", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/plantapp/model/PlantItem;", "_plant", "_subtotal", "", "kotlin.jvm.PlatformType", "_total", "delivery", "Landroidx/lifecycle/LiveData;", "getDelivery", "()Landroidx/lifecycle/LiveData;", "plant", "getPlant", "plantItems", "", "", "getPlantItems", "()Ljava/util/Map;", "previousDeliveryPrice", "previousPlantPrice", "subtotal", "getSubtotal", "total", "getTotal", "resetOrder", "", "setDelivery", "setPlant", "updateSubtotal", "itemPrice", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.example.plantapp.model.PlantItem> plantItems = null;
    private double previousPlantPrice = 0.0;
    private double previousDeliveryPrice = 0.0;
    private final androidx.lifecycle.MutableLiveData<com.example.plantapp.model.PlantItem> _plant = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> plant = null;
    private final androidx.lifecycle.MutableLiveData<com.example.plantapp.model.PlantItem> _delivery = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> delivery = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _subtotal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> subtotal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _total = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> total = null;
    
    public OrderViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.plantapp.model.PlantItem> getPlantItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> getPlant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> getDelivery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSubtotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTotal() {
        return null;
    }
    
    /**
     * Set the entree for the order.
     */
    public final void setPlant(@org.jetbrains.annotations.NotNull()
    java.lang.String plant) {
    }
    
    /**
     * Set the side for the order.
     */
    public final void setDelivery(@org.jetbrains.annotations.NotNull()
    java.lang.String delivery) {
    }
    
    /**
     * Update subtotal value.
     */
    private final void updateSubtotal(double itemPrice) {
    }
    
    /**
     * Reset all values pertaining to the order.
     */
    public final void resetOrder() {
    }
}