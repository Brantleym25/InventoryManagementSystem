package com.itc370.inventory;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface InventoryMapper {

    @Insert("INSERT INTO inventory_items (name, description, quantity, price) " +
            "VALUES (#{name}, #{description}, #{quantity}, #{price})")
    void insertItem(InventoryItem item);

    @Select("SELECT * FROM inventory_items ORDER BY id")
    List<InventoryItem> getAllItems();

    //Brantleys updates
    @Update("UPDATE inventory_items " +
            "SET name = #{name}, description = #{description}, quantity = #{quantity}, price = #{price} " +
            "WHERE id = #{id}")
    void updateItem(InventoryItem item);

    @Delete("DELETE FROM inventory_items WHERE id = #{id}")
    void deleteItem(int id);
}
