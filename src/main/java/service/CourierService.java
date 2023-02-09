package service;

import mapper.CourierMapper;

import mapper.PaymentTypeMapper;
import model.Courier;

import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class CourierService {

    public Courier getCourierById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            return courierMapper.getCourierById(id);
        }
    }

    public void insertCourier( Courier courier) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.saveCourier(courier);
            sqlSession.commit();
        }
    }

    public void updateCourier(Courier courier) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.updateCourier(courier);
            sqlSession.commit();
        }
    }

    public void deleteCourier(Courier courier) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            courierMapper.deleteCourier(courier);
            sqlSession.commit();
        }
    }

    public Map<Integer, Courier> getAllCourier() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CourierMapper courierMapper = sqlSession.getMapper(CourierMapper.class);
            return courierMapper.getAllCourier();
        }
    }

}

