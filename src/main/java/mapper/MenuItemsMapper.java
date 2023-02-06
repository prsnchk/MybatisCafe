package mapper;

import model.MenuItems;
import model.PaymentType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface MenuItemsMapper {
    @Select("Select id_menu, name_ukr, name_eng, price from Menu_items where id_menu=#{menuId}")
    @Results(value = {
            @Result(property = "menuId", column = "id_menu"),
            @Result(property = "nameUkr", column = "name_ukr"),
            @Result(property = "nameEng", column = "name_eng"),
            @Result(property = "price", column = "price")})
    MenuItems getMenuItemsById(Integer id);

    @Select("select * from Menu_items")
    @MapKey("menuId")
    @Results(value = {
            @Result(property = "menuId", column = "id_menu"),
            @Result(property = "nameUkr", column = "name_ukr"),
            @Result(property = "nameEng", column = "name_eng"),
            @Result(property = "price", column = "price")})
    Map<Integer, MenuItems> getAllMenuItems();

    @Update("Update Menu_items set name_ukr = #{nameUkr}, name_eng = #{nameEng}, price = #{price} where id_menu=#{menuId}")
    void updateMenuItems(MenuItems menuItems);

    @Insert("Insert into Menu_items (id_menu, name_ukr, name_eng, price ) values (#{menuId},#{nameUkr}, #{nameEng},#{price})")
    void saveMenuItems(MenuItems menuItems);

    @Delete("DELETE FROM Menu_items WHERE id_menu=#{menuId}")
    void deleteMenuItems(MenuItems menuItems);
}
