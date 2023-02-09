package service;

import mapper.DeliveryProviderMapper;

import model.DeliveryProvider;

import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class DeliveryProviderService {
    public DeliveryProvider getDeliveryProviderById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            return deliveryProviderMapper.getDeliveryProviderById(id);
        }
    }

    public void insertDeliveryProvider(DeliveryProvider deliveryProvider) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.saveDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        }
    }

    public void updateDeliveryProvider(DeliveryProvider deliveryProvider) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.updateDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        }
    }

    public void deleteDeliveryProvider(DeliveryProvider deliveryProvider) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            deliveryProviderMapper.deleteDeliveryProvider(deliveryProvider);
            sqlSession.commit();
        }
    }

    public Map<Integer, DeliveryProvider> getAllDeliveryProvider() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            DeliveryProviderMapper deliveryProviderMapper = sqlSession.getMapper(DeliveryProviderMapper.class);
            return deliveryProviderMapper.getAllDeliveryProvider();
        }
    }
}

