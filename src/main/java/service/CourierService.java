package service;

import mapper.CourierMapper;

import mapper.PaymentTypeMapper;
import model.Courier;

import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class CourierService {
    public static void insert(Courier courier3) {
    }

    public Courier getCourierById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            return courierMapper.getCourierById(id);
        }finally{
            sqlSession.close();
        }
    }

    public void insertCourier( Courier courier) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.saveCourier(courier);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void updateCourier(Courier courier) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.updateCourier(courier);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void deleteCourier(Courier courier) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.deleteCourier(courier);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }


    public Map<Integer, Courier> getAllCourier() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
           return courierMapper.getAllCourier();
        }finally{
            sqlSession.close();
        }
    }

}

