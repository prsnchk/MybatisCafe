package service;

import mapper.MenuItemsMapper;


import model.MenuItems;


import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;
import java.util.Map;

public class MenuItemsService {
    public MenuItems getMenuItemsById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            return menuItemsMapper.getMenuItemsById(id);
        }finally{
            sqlSession.close();
        }
    }

    public void insertMenuItems(MenuItems menuItems) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.saveMenuItems(menuItems);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void updateMenuItems(MenuItems menuItems) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.updateMenuItems(menuItems);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void deleteMenuItems(MenuItems menuItems) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            menuItemsMapper.deleteMenuItems(menuItems);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public Map<Integer, MenuItems> getAllMenuItems() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            MenuItemsMapper menuItemsMapper = sqlSession.getMapper(MenuItemsMapper.class);
            return menuItemsMapper.getAllMenuItems();
        }finally{
            sqlSession.close();
        }
    }

}
