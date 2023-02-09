package service;

import mapper.MenuItemsMapper;


import model.MenuItems;


import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;
import java.util.Map;

public class MenuItemsService {
    public MenuItems getMenuItemsById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            return menuItemsMapper.getMenuItemsById(id);
        }
    }

    public void insertMenuItems(MenuItems menuItems) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.saveMenuItems(menuItems);
            sqlSession.commit();
        }
    }

    public void updateMenuItems(MenuItems menuItems) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.updateMenuItems(menuItems);
            sqlSession.commit();
        }
    }

    public void deleteMenuItems(MenuItems menuItems) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.deleteMenuItems(menuItems);
            sqlSession.commit();
        }
    }

    public Map<Integer, MenuItems> getAllMenuItems() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            return menuItemsMapper.getAllMenuItems();
        }
    }
}
